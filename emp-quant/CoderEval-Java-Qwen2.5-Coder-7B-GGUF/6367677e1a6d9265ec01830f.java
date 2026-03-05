public String format(LoggingEvent event){
StringBuffer sbuf = new StringBuffer();  
    int i = 0;  
    while (i < pattern.length()) {  
        if (pattern.charAt(i) == '%') {  
            i++;  
            if (i >= pattern.length()) {  
                sbuf.append('%');  
                break;  
            }  
            char c = pattern.charAt(i);  
            switch (c) {  
                case 'c':  
                    sbuf.append(event.getLoggerName());  
                    break;  
                case 'm':  
                    sbuf.append(event.getMessage());  
                    break;  
                case 'n':  
                    sbuf.append(System.getProperty("line.separator"));  
                    break;  
                default:  
                    sbuf.append('%');  
                    sbuf.append(c);  
                    break;  
            }  
        } else {  
            sbuf.append(pattern.charAt(i));  
        }  
        i++;  
    }  
    return sbuf.toString();  
}  
```