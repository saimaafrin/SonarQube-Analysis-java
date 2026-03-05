public String format(LoggingEvent event){
StringBuffer sbuf = new StringBuffer();  
    int i;  
    for(i=0;i<patternLayout.length;i++){  
        char c = patternLayout[i];  
        if(c == '%'){  
            i++;  
            if(i >= patternLayout.length) {  
                break;  
            }  
            c = patternLayout[i];  
            switch(c){  
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
        }else{  
            sbuf.append(c);  
        }  
    }  
    return sbuf.toString();  
}