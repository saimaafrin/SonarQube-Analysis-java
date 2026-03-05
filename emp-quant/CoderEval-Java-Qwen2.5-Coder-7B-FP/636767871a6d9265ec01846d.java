public static void createConfigurationDirectory(){
String homeDir = System.getProperty("user.home");
    File configDir = new File(homeDir + "/Documents/Settings/lf5"); // On Windows
    if (!configDir.exists()) {
        boolean created = configDir.mkdirs(); // Create parent directories as well
        if (created) {
            System.out.println("Configuration directory created successfully.");
        } else {
            System.out.println("Failed to create configuration directory.");
        }
    } else {
        System.out.println("Configuration directory already exists.");
    }
}