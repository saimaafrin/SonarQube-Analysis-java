class Generated {
    public static String[] split(String toSplit,String delimiter){
    int index = toSplit.indexOf(delimiter);
        if(index == -1){
            return new String[]{toSplit};
        }
        String s1 = toSplit.substring(0,index);
        String s2 = toSplit.substring(index+1);
        return new String[]{s1,s2};
    }
}
