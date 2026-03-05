public void add(LoggingEvent event){
if (event == null) {
        throw new IllegalArgumentException("Event cannot be null");
    }
    if (event.getLevel() == null) {
        throw new IllegalArgumentException("Event level cannot be null");
    }
    if (event.getLoggerName() == null) {
        throw new IllegalArgumentException("Logger name cannot be null");
    }
    if (event.getMessage() == null) {
        throw new IllegalArgumentException("Message cannot be null");
    }
    if (event.getThrowable() == null) {
        throw new IllegalArgumentException("Throwable cannot be null");
    }
    if (event.getThreadName() == null) {
        throw new IllegalArgumentException("Thread name cannot be null");
    }
    if (event.getThreadID() == 0) {
        throw new IllegalArgumentException("Thread ID cannot be 0");
    }
    if (event.getNDC() == null) {
        throw new IllegalArgumentException("NDC cannot be null");
    }
    if (event.getMDCC() == null) {
        throw new IllegalArgumentException("MDCC cannot be null");
    }
    if (event.getMDC() == null) {
        throw new IllegalArgumentException("MDC cannot be null");
    }
    if (event.getNDC() == null) {
        throw new IllegalArgumentException("NDC cannot be null");
    }
    if (event.getMDCC() == null) {
        throw new IllegalArgumentException("MDCC cannot be null");
    }
    if (event.getMDC() == null) {
        throw new IllegalArgumentException("MDC cannot be null");
    }
    if (event.getNDC() == null) {
        throw new IllegalArgumentException("NDC cannot be null");
    }
    if (event.getMDCC() == null) {
        throw new IllegalArgumentException("MDCC cannot be null");
    }
    if (event.getMDC() == null) {
        throw new IllegalArgumentException("MDC cannot be null");
    }
    if (event.getNDC() == null) {
        throw new IllegalArgumentException("NDC cannot be null");
    }
    if (event.getMDCC() == null) {
        throw new IllegalArgumentException("MDCC cannot be null");
    }
    if (event.getMDC() == null) {
        throw new IllegalArgumentException("MDC cannot be null");
    }
    if (event.getNDC() == null) {
        throw new IllegalArgumentException("NDC cannot be null");
    }
    if (event.getMDCC() == null) {
        throw new IllegalArgumentException("MDCC cannot be null");
}}