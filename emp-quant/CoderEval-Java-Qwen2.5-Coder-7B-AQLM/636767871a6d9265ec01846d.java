public static void createConfigurationDirectory(){
String homeDir = System.getProperty("user.home"); 
    String configDir = homeDir + File.separator + "Documents" + File.separator + "Settings" + File.separator + "lf5"; 
    File dir = new File(configDir); 
    if (!dir.exists()) { 
        dir.mkdirs(); 
    } 
}