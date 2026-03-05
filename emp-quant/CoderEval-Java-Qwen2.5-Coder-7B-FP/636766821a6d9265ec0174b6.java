public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
// Check if the genericType is a parameterized type
    if(!(genericType instanceof ParameterizedType)){
        return null;
    }
    // Get the actual type arguments of the genericType
    Type[] types = ((ParameterizedType)genericType).getActualTypeArguments();
    // Create an array to hold the resolved class types
    Class<?>[] classes = new Class[types.length];
    // Iterate over each type argument
    for(int i=0;i<types.length;i++){
        Type type = types[i];
        // If the type is a wildcard type, try to resolve it using targetType
        if(type instanceof WildcardType){
            WildcardType wildcardType = (WildcardType)type;
            Type[] upperBounds = wildcardType.getUpperBounds();
            // Use the first upper bound as the resolved type
            classes[i] = resolveBound(upperBounds,targetType);
        }else if(type instanceof TypeVariable){
            TypeVariable<?> tv = (TypeVariable<?>)type;
            // Resolve the type variable using targetType
            classes[i] = resolveTypeVariable(tv,targetType);
        }else{
            // Directly cast the type to Class
            classes[i] = (Class<?>)type;
        }
    }
    return classes;
}