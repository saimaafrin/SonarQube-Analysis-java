class Generated {
    public static Type resolveBound(TypeVariable<?> typeVariable){
    Type[] bounds = typeVariable.getBounds();  
        if(bounds.length == 0) {  
            return Object.class;  
        } else {  
            Type bound = bounds[0];  
            if(bound instanceof Class<?>) {  
                return (Class<?>)bound;  
            } else if(bound instanceof ParameterizedType) {  
                ParameterizedType parameterizedType = (ParameterizedType)bound;  
                Type rawType = parameterizedType.getRawType();  
                if(rawType instanceof Class<?>) {  
                    return (Class<?>)rawType;  
                } else {  
                    return Unknown.class;  
                }  
            } else if(bound instanceof WildcardType) {  
                WildcardType wildcardType = (WildcardType)bound;  
                Type[] upperBounds = wildcardType.getUpperBounds();  
                if(upperBounds.length > 0) {  
                    return resolveBound((TypeVariable<?>)upperBounds[0]);  
                } else {  
                    return Unknown.class;  
                }  
            } else {  
                return Unknown.class;  
            }  
        }  
    }
}
