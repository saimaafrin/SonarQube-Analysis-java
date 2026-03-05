private static boolean isAllZeros(String s){
for(int i=0;i<s.length();i++){
        if(s.charAt(i) != '0'){
            return false;
        }
    }
    return true;
}