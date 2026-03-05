class Generated {
    public String format(LoggingEvent event){
    if(patternLayout == null){
        patternLayout = new PatternLayout();
        patternLayout.setConversionPattern(conversionPattern);
        patternLayout.activateOptions();
      }
      return patternLayout.format(event);
    }
}
