class Generated {
    public static String unescapeJava(String str) throws Exception {
    StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (c == '\\') {
                if (i + 1 < str.length()) {
                    char next = str.charAt(i + 1);
                    if (next == '\\') {
                        sb.append(next);
                        i += 2;
                    } else if (next == 'n') {
                        sb.append('\n');
                        i += 2;
                    } else if (next == 'r') {
                        sb.append('\r');
                        i += 2;
                    } else if (next == 't') {
                        sb.append('\t');
                        i += 2;
                    } else if (next == 'b') {
                        sb.append('\b');
                        i += 2;
                    } else if (next == 'f') {
                        sb.append('\f');
                        i += 2;
                    } else if (next == '\"') {
                        sb.append('\"');
                        i += 2;
                    } else if (next == '\'') {
                        sb.append('\'');
                        i += 2;
                    } else if (next == '\\') {
                        sb.append('\\');
                        i += 2;
                    } else if (next == 'u') {
                        if (i + 5 < str.length()) {
                            char[] hexChars = new char[4];
                            hexChars[0] = str.charAt(i + 2);
                            hexChars[1] = str.charAt(i + 3);
                            hexChars[2] = str.charAt(i + 4);
                            hexChars[3] = str.charAt(i + 5);
                            int code = Integer.parseInt(new String(hexChars), 16);
                            sb.append((char) code);
                            i += 6;
                        } else {
                            throw new Exception
    }}}}}}
}
