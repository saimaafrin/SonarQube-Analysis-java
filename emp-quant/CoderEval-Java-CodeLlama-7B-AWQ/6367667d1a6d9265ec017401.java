class Generated {
    public static String unescapeJava(String str) throws Exception {
    StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (c == '\\') {
                c = str.charAt(++i);
                switch (c) {
                    case '\\':
                        sb.append('\\');
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
                    case 'b':
                        sb.append('\b');
                        break;
                    case 'f':
                        sb.append('\f');
                        break;
                    case '\"':
                        sb.append('\"');
                        break;
                    case '\'':
                        sb.append('\'');
                        break;
                    case 'u':
                        sb.append((char) Integer.parseInt(str.substring(i + 1, i + 5), 16));
                        i += 4;
                        break;
                    case 'U':
                        sb.append((char) Integer.parseInt(str.substring(i + 1, i + 9), 16));
                        i += 8;
                        break;
                    default:
                        throw new Exception("Invalid escape sequence: " + c);
                }
            } else {
                sb.append(c);
            }
            i++;
        }
        return sb.toString();
    }
}
