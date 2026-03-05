class Generated {
    public static String encodeTemplateNames(String s){
    StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '{'){
                sb.append('}');
            }else if(s.charAt(i) == '}'){
                sb.append('{');
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
