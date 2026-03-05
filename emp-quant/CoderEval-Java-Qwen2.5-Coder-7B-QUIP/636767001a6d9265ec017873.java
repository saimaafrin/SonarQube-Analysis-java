class Generated {
    public static String reverse(final String str){
    if(str==null){  
            throw new IllegalArgumentException("String is null");  
        }  
        if(str.isEmpty()){  
            throw new IllegalArgumentException("String is empty");  
        }  
        StringBuilder sb=new StringBuilder(str);  
        return sb.reverse().toString();  
    }
}
