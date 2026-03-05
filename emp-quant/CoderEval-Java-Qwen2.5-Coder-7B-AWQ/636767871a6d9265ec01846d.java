class Generated {
    public static void createConfigurationDirectory(){
    String homeDir = System.getProperty("user.home");  
        File configDir = new File(homeDir + "/Documents/Settings/lf5");  
        if (!configDir.exists()) {  
            boolean result = configDir.mkdirs();  
            if (result) {  
                System.out.println("Configuration directory created successfully.");  
            } else {  
                System.out.println("Failed to create configuration directory.");  
            }  
        } else {  
            System.out.println("Configuration directory already exists.");  
        }  
    }
}
