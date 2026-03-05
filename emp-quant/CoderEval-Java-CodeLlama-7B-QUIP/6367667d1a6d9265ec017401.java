class Generated {
    public static String unescapeJava(String str) throws Exception {
    StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '\\') {
                i++;
                if (i < str.length()) {
                    switch (str.charAt(i)) {
                        case 'b':
                            sb.append('\b');
                            break;
                        case 'f':
                            sb.append('\f');
                            break;
                        case 'n':
                            sb.append('\n');
                            break;
                        case 'r':
                            sb.append('\r');
                            break;
                        case 't':
                            sb.append('\t');
                            break;
                        case '\'':
                            sb.append('\'');
                            break;
                        case '\"':
                            sb.append('"');
                            break;
                        case '\\':
                            sb.append('\\');
                            break;
                        default:
                            throw new Exception("Illegal escape sequence: " + str.substring(i));
                    }
                }
            } else {
                sb.append(str.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
