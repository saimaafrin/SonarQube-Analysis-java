class Generated {
    public static String unescapeJava(String str) throws Exception {
    if (str == null) { 
            return null; 
        } 
        return str.replace("\\\\", "\\").replace("\\'", "'").replace("\\\"", "\"").replace("\\n", "\n").replace("\\r", "\r").replace("\\t", "\t").replace("\\b", "\b").replace("\\f", "\f"); 
    }
}
