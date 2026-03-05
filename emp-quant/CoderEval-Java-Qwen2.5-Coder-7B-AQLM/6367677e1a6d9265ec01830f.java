public String format(LoggingEvent event){
StringBuffer sbuf = new StringBuffer();  
    int start = 0;  
    int c;  
    while (start < pattern.length()) {  
        c = pattern.charAt(start);  
        if (c == '%') {  
            if (start + 1 < pattern.length()) {  
                c = pattern.charAt(start + 1);  
                if (c == 'c') {  
                    sbuf.append(event.getRenderedMessage());  
                    start += 2;  
                    continue;  
                } else if (c == 'd') {  
                    sbuf.append(event.getTimeStamp());  
                    start += 2;  
                    continue;  
                }  
            }  
        }  
        sbuf.append(c);  
        start++;  
    }  
    return sbuf.toString();  
}