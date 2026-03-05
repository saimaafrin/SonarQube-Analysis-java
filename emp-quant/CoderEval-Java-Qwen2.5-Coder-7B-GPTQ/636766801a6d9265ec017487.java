public static String encodeTemplateNames(String s){
if(s==null||s.length()==0) return "";  
    StringBuilder sb=new StringBuilder();  
    for(int i=0;i<s.length();i++){  
        char c=s.charAt(i);  
        if(c=='{') sb.append("[");  
        else if(c=='}') sb.append("]");  
        else sb.append(c);  
    }  
    return sb.toString();  
}