class Generated {
    public static String encodeTemplateNames(String s){
    def max_unique_substrings(s):
        # Initialize a set to store unique substrings
        unique_substrings = set()
        
        # Iterate over each index in the string
        for i in range(len(s)):
            # Remove the digit at the current index
            new_string = s[:i] + s[i+1:]
            
            # Split the new string into substrings based on non-digit characters
            substrings = new_string.split()
            
            # Add all substrings to the set of unique substrings
            unique_substrings.update(substrings)
        
        # Return the number of unique substrings
        return len(unique_substrings)
    
    # Example usage
    print(max_unique_substrings("12345"))  # Output: 10
    }
}
