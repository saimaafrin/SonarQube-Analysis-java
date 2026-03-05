public Logger exists(String name){
Logger logger = null;
	if(name != null){
		logger = this.loggers.get(name);
	}
	return logger;
}