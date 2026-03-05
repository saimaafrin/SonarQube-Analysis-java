class Generated {
    public static void createConfigurationDirectory(){
    File configDir = new File(System.getProperty("user.home") + File.separator + "lf5");
    	if(!configDir.exists()){
    		configDir.mkdir();
    	}
    }
}
