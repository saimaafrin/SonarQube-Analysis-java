class Generated {
    public static char[] clone(final char[] array){
    char[] clone = new char[array.length];  
        for(int i=0; i<array.length; i++){  
            clone[i] = array[i];  
        }  
        return clone;  
    }  
    
    **Return a clone of the given array.**
}
