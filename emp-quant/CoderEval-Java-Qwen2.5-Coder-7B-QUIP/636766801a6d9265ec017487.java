public static String encodeTemplateNames(String s){
return s.replace("{", "X").replace("}", "Y");  
}