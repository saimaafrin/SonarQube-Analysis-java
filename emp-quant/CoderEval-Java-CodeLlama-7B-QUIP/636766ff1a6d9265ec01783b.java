class Generated {
    public static String sub(String str,int start,int end){
    if(start < 0 || end < 0 || start > end || str.length() < end){
            return null;
        }
        return str.substring(start,end);
    }
}
