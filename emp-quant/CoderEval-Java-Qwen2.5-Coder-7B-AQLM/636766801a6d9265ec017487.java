public static String encodeTemplateNames(String s){
return s.replace("{", "%%").replace("}", "%%");  
}