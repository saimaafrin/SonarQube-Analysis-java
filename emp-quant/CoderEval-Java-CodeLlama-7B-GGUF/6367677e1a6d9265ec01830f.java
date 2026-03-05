public String format(LoggingEvent event){
StringBuffer sbuf = new StringBuffer();
  int len = pattern.length();
  int i = 0;
  while (i < len) {
    char c = pattern.charAt(i);
    if (c == '%' && i + 1 < len) {
      c = pattern.charAt(++i);
      int conv = -1;
      if (c == '%') {
        sbuf.append(c);
      } else {
        conv = convLookup.lookup(c);
        if (conv != -1) {
          sbuf.append(format(conv, event, sbuf));
        } else {
          sbuf.append(c);
        }
      }
    } else {
      sbuf.append(c);
    }
    i++;
  }
  return sbuf.toString();
}