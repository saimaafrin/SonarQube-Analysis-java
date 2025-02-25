import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Imagine a road that's a perfectly straight infinitely long line.
    // n cars are driving left to right;  simultaneously, a different set of n cars
    // are driving right to left.   The two sets of cars start out being very far from
    // each other.  All cars move in the same speed.  Two cars are said to collide
    // when a car that's moving left to right hits a car that's moving right to left.
    // However, the cars are infinitely sturdy and strong; as a result, they continue moving
    // in their trajectory as if they did not collide.
    // This function outputs the number of such collisions.
    public static long carRaceCollision(long n) {

        long d=n;
        long ans=0;
        long max=0;
        long cnt=0;
        long p=-1;
        long temp;
        while(d>0){
            if(max==0){
                p=-1;
                max=n;
            }
            if(p>=0){
                if(max==p){
                    ans+=cnt*(cnt-1)/2;
                    cnt=1;
                    max-=p;
                    p=-1;
                }else{
                    temp=max;
                    max-=p;
                    p=temp;
                    cnt++;
                }
            }else{
                p=n;
                n-=1;
            }
            d--;
        }
        ans+=(n-1)*(n-1)/2;
        return ans;
    }
    public static void main(String[] args) {
    assert(carRaceCollision((2l)) == (4l));
    assert(carRaceCollision((3l)) == (9l));
    assert(carRaceCollision((4l)) == (16l));
    assert(carRaceCollision((8l)) == (64l));
    assert(carRaceCollision((10l)) == (100l));
    }

}
