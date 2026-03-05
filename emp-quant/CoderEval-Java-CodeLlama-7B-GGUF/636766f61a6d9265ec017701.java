class Generated {
    public static int lastIndexOf(String str,String searchStr){
    if(str.length()==0)
            return INDEXNOTFOUND;
        int lastIndex=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==searchStr.charAt(0)){
                int j=i;
                for(int k=1;k<searchStr.length();k++){
                    if(j==str.length()-1)
                        return INDEXNOTFOUND;
                    if(str.charAt(j+1)!=searchStr.charAt(k))
                        break;
                    j++;
                }
                if(j-i+1==searchStr.length())
                    lastIndex=i;
            }
        }
        return lastIndex;
    }
}
