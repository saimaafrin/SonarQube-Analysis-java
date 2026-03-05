public Logger exists(String name){
Logger logger = null;
	if(loggers.containsKey(name)){
		logger = loggers.get(name);
	}
	return logger;
}