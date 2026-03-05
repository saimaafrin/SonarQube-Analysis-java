class Generated {
    public static String toString(Object obj){
    // Check if the object is null
        if (obj == null) {
            return ""; // Return an empty string if the object is null
        } else {
            return obj.toString(); // Otherwise, return the string representation of the object
        }
    }
}
