public static String unescapeJava(String str) throws Exception {
if (str == null) { 
        return null; 
    } 
    StringBuilder sb = new StringBuilder(); 
    for (int i = 0; i < str.length(); i++) { 
        char c = str.charAt(i); 
        if (c == '\\') { 
            i++; 
            if (i >= str.length()) { 
                throw new Exception("Trailing backslash"); 
            } 
            c = str.charAt(i); 
            switch (c) { 
                case 'b': 
                    sb.append('\b'); 
                    break; 
                case 't': 
                    sb.append('\t'); 
                    break; 
                case 'n': 
                    sb.append('\n'); 
                    break; 
                case 'f': 
                    sb.append('\f'); 
                    break; 
                case 'r': 
                    sb.append('\r'); 
                    break; 
                case '\"': 
                    sb.append('\"'); 
                    break; 
                case '\'': 
                    sb.append('\''); 
                    break; 
                case '\\': 
                    sb.append('\\'); 
                    break; 
                default: 
                    throw new Exception("Unknown escape sequence: \\" + c); 
            } 
        } else { 
            sb.append(c); 
        } 
    } 
    return sb.toString(); 
}