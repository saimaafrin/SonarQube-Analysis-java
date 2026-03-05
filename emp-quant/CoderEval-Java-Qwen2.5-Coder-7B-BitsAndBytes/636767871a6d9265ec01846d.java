public static void createConfigurationDirectory(){
String homeDir = System.getProperty("user.home");
    File configDir = new File(homeDir + "/lf5"); 
    if (!configDir.exists()) { 
        boolean result = configDir.mkdir(); 
        if (result) { 
            System.out.println("Configuration directory created successfully."); 
        } else { 
            System.err.println("Failed to create configuration directory."); 
        } 
    } else { 
        System.out.println("Configuration directory already exists."); 
    } 
}