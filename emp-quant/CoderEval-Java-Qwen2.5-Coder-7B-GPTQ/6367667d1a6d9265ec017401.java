public static String unescapeJava(String str) throws Exception {
if (str == null || str.length() == 0) {  
        return str;  
    }  
    StringBuilder sb = new StringBuilder();  
    for (int i = 0; i < str.length(); ++i) {  
        char c = str.charAt(i);  
        if (c == '\\') {  
            char nextChar = str.charAt(++i);  
            switch(nextChar){  
                case 'b': sb.append('\b'); break;  
                case 't': sb.append('\t'); break;  
                case 'n': sb.append('\n'); break;  
                case 'f': sb.append('\f'); break;  
                case 'r': sb.append('\r'); break;  
                case '\"': sb.append('\"'); break;  
                case '\'': sb.append('\''); break;  
                case '\\': sb.append('\\'); break;  
                default: throw new Exception("Invalid escape sequence: " + nextChar);  
            }  
        } else {  
            sb.append(c);  
        }  
    }  
    return sb.toString();  
}