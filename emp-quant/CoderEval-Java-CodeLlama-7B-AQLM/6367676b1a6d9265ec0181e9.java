class Generated {
    public static boolean substringMatch(CharSequence str,int index,CharSequence substring){
    int j=0;
        for(int i=index;i<str.length()&&j<substring.length();i++){
            if(str.charAt(i)==substring.charAt(j)){
                j++;
            }else{
                j=0;
            }
        }
        return j==substring.length();
    }
}
