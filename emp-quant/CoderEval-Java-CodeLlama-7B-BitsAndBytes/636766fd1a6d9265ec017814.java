class Generated {
    public static boolean arrayequals(byte[] a,byte[] b,int count){
    if(a==b)
            return true;
        if(a==null||b==null)
            return false;
        if(a.length!=b.length)
            return false;
        for(int i=0;i<count;i++)
            if(a[i]!=b[i])
                return false;
        return true;
    }
}
