public Logger exists(String name){
// Check if the logger with the given name exists
    if (loggerMap.containsKey(name)) {
        // Return the logger instance
        return loggerMap.get(name);
    } else {
        // Return null if no such logger exists
        return null;
    }
}