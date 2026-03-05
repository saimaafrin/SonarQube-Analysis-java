class Generated {
    public static String deleteAny(String inString,String charsToDelete){
    // Create a boolean array to mark characters to be deleted
        boolean[] delete = new boolean[256]; 
        for (int i = 0; i < charsToDelete.length(); i++) { 
            delete[charsToDelete.charAt(i)] = true; 
        } 
        // Create a StringBuilder to store the modified string
        StringBuilder sb = new StringBuilder(); 
        for (int i = 0; i < inString.length(); i++) { 
            // If the character is not in the delete array, append it to the StringBuilder
            if (!delete[inString.charAt(i)]) { 
                sb.append(inString.charAt(i)); 
            } 
        } 
        // Return the modified string
        return sb.toString(); 
    }
}
