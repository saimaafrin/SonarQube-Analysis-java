public static void createConfigurationDirectory(){
File directory = new File(System.getProperty("user.home") + "/lf5");
	if(!directory.exists()){
		directory.mkdir();
	}
}