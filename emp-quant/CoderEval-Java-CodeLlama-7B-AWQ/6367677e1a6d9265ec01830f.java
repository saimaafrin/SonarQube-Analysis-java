public String format(LoggingEvent event){
StringBuffer sbuf = new StringBuffer();
  int i = 0;
  while (i < pattern.length()) {
    char ch = pattern.charAt(i++);
    if (ch == '%') {
      if (i >= pattern.length()) {
        break;
      }
      ch = pattern.charAt(i++);
      if (ch == '%') {
        sbuf.append('%');
      } else {
        int conversionPattern = -1;
        if (ch >= '0' && ch <= '9') {
          conversionPattern = ch - '0';
          if (i < pattern.length() && pattern.charAt(i) >= '0' && pattern.charAt(i) <= '9') {
            conversionPattern = (conversionPattern * 10) + (pattern.charAt(i++) - '0');
          }
        } else {
          conversionPattern = getConversionPattern(ch);
        }
        if (conversionPattern >= 0) {
          String conversionContent = format(conversionPattern, event);
          sbuf.append(conversionContent);
        } else {
          sbuf.append('%').append(ch);
        }
      }
    } else {
      sbuf.append(ch);
    }
  }
  return sbuf.toString();
}