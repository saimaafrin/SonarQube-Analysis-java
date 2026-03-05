class Generated {
    public static boolean arrayequals(byte[] a,byte[] b,int count){
    if(count==0){
            return true;
        }
        if(count==1){
            if(a[0]==b[0]){
                return true;
            }
            return false;
        }
        if(count==2){
            if(a[0]==b[0]&&a[1]==b[1]){
                return true;
            }
            return false;
        }
        if(count==3){
            if(a[0]==b[0]&&a[1]==b[1]&&a[2]==b[2]){
                return true;
            }
            return false;
        }
        return false;
    }
}
