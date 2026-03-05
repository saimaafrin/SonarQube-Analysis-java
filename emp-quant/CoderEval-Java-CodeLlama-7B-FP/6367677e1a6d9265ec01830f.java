class Generated {
    public String format(LoggingEvent event){
    StringBuffer sbuf = new StringBuffer();
      int i = 0;
      while(i < pattern.length()){
        char c = pattern.charAt(i);
        if(c == '%' && i + 1 < pattern.length()){
          c = pattern.charAt(++i);
          int precision = -1;
          if(c == '-' && i + 1 < pattern.length()){
    	c = pattern.charAt(++i);
          }
          if(c == '.'){
    	c = pattern.charAt(++i);
    	precision = 0;
    	if(c >= '0' && c <= '9'){
    	  precision = c - '0';
    	  c = pattern.charAt(++i);
    	  while(c >= '0' && c <= '9' && i < pattern.length()){
    	    precision = precision * 10 + (c - '0');
    	    c = pattern.charAt(++i);
    	  }
    	}
          }
          if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'){
    	PatternConverter pc = converters[c];
    	if(pc == null){
    	  pc = new PatternConverter(c);
    	  converters[c] = pc;
    	}
    	pc.format(sbuf, event, precision);
          }else{
    	sbuf.append(c);
          }
        }else{
          sbuf.append(c);
        }
        i++;
      }
      return sbuf.toString();
    }
}
