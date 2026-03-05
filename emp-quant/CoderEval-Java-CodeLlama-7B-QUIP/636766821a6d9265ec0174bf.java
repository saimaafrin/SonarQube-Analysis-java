class Generated {
    public static String capitalize(String name){
    String[] nameArray = name.split(" ");
    	String firstName = nameArray[0];
    	String firstNameCapitalized = firstName.substring(0, 1).toUpperCase() + firstName.substring(1, firstName.length());
    	String[] nameArrayCapitalized = new String[nameArray.length];
    	nameArrayCapitalized[0] = firstNameCapitalized;
    	for(int i = 1; i < nameArray.length; i++){
    		nameArrayCapitalized[i] = nameArray[i];
    	}
    	return String.join(" ", nameArrayCapitalized);
    }
}
