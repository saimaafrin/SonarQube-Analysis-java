class Generated {
    public static String unescapeJava(String str) throws Exception {
    StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (c == '\\') {
                if (i + 1 < str.length()) {
                    char c1 = str.charAt(i + 1);
                    if (c1 == '\\') {
                        sb.append(c1);
                        i += 2;
                    } else if (c1 == 'n') {
                        sb.append('\n');
                        i += 2;
                    } else if (c1 == 'r') {
                        sb.append('\r');
                        i += 2;
                    } else if (c1 == 't') {
                        sb.append('\t');
                        i += 2;
                    } else if (c1 == 'b') {
                        sb.append('\b');
                        i += 2;
                    } else if (c1 == 'f') {
                        sb.append('\f');
                        i += 2;
                    } else if (c1 == '\"') {
                        sb.append('\"');
                        i += 2;
                    } else if (c1 == '\'') {
                        sb.append('\'');
                        i += 2;
                    } else if (c1 == '\\') {
                        sb.append('\\');
                        i += 2;
                    } else {
                        sb.append(c);
                        i++;
                    }
                } else {
                    sb.append(c);
                    i++;
                }
            } else {
                sb.append(c);
                i++;
            }
        }
        return sb.toString();
    }
}
