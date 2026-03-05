public Logger exists(String name){
// Check if the logger with the given name exists
    if (loggers.containsKey(name)) {
        // Return the logger instance
        return loggers.get(name);
    } else {
        // Return null if no such logger exists
        return null;
    }
}