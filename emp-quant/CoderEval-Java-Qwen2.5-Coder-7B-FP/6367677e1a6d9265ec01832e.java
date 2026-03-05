public Logger exists(String name){
// Check if the logger with the given name exists
    if (loggerMap.containsKey(name)) {
        // Return the logger reference if it exists
        return loggerMap.get(name);
    } else {
        // Return null if the logger does not exist
        return null;
    }
}