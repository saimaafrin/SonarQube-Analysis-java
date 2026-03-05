public String format(LoggingEvent event){
StringBuffer sbuf = new StringBuffer();  
    int i = 0;  
    while (i < pattern.length()) {  
        char c = pattern.charAt(i);  
        if (c == '%') {  
            i++;  
            if (i >= pattern.length()) {  
                break;  
            }  
            c = pattern.charAt(i);  
            switch(c) {  
                case 'd':  
                    sbuf.append(event.getTimeStamp());  
                    break;  
                case 'm':  
                    sbuf.append(new java.util.Date(event.getTimeStamp()).toString());  
                    break;  
                case 'n':  
                    sbuf.append(System.getProperty("line.separator"));  
                    break;  
                case 'c':  
                    sbuf.append(event.getLoggerName());  
                    break;  
                case 'p':  
                    sbuf.append(event.getLevel().toString());  
                    break;  
                case 'l':  
                    sbuf.append(event.getLocationInformation().getClassName());  
                    break;  
                default:  
                    sbuf.append('%');  
                    sbuf.append(c);  
                    break;  
            }  
        } else {  
            sbuf.append(c);  
        }  
        i++;  
    }  
    return sbuf.toString();  
}