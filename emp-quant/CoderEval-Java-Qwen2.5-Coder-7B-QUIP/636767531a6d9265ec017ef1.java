public static boolean equals(Point2D p1,Point2D p2){
return TOLERANCE_DOUBLE_COMPARATOR.compare(p1,p2)==0;  
}  

**Using TOLERANCE_DOUBLE_COMPARATOR to compare two points for equality,return true the point p1 is equal to another point p2,otherwise return false.**