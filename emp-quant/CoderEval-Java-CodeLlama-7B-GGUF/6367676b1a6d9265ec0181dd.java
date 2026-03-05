class Generated {
    public static int countOccurrencesOf(String str,String sub){
    int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==sub.charAt(0)){
                int j=i;
                for(int k=1;k<sub.length();k++){
                    if(j<str.length() && str.charAt(j)==sub.charAt(k)){
                        j++;
                    }
                    else{
                        break;
                    }
                }
                if(j==i+sub.length()){
                    count++;
                }
            }
        }
        return count;
    }
}
