class Generated {
    public static Type resolveBound(TypeVariable<?> typeVariable){
    // Get the bounds of the type variable
        Type[] bounds = typeVariable.getBounds();
        
        // Check if there are any bounds
        if(bounds.length == 0){
            // If no bounds, return Object.class as a default upper bound
            return Object.class;
        }
        
        // Iterate through the bounds to find the first bound that is not a wildcard
        for(Type bound : bounds){
            if(!(bound instanceof WildcardType)){
                // Return the first non-wildcard bound
                return bound;
            }
        }
        
        // If all bounds are wildcards, return Unknown.class
        return Unknown.class;
    }
    ```
    
    **Explanation**:
    - The function `resolveBound` takes a `TypeVariable<?>` as an argument.
    - It retrieves the bounds of the type variable using `typeVariable.getBounds()`.
    - If there are no bounds (i.e., the length of the bounds array is 0), it returns `Object.class` as a default upper bound.
    - It then iterates through each bound to check if it is a wildcard (`WildcardType`). If it finds a non-wildcard bound, it returns that bound.
    - If all bounds are wildcards, it returns `Unknown.class`, indicating that the bound could not be resolved.
}
