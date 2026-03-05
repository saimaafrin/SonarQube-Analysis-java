public static Type resolveBound(TypeVariable<?> typeVariable){
Type[] bounds = typeVariable.getBounds();
    if(bounds.length == 0){
        return Object.class;
    }
    Type bound = bounds[0];
    if(bound instanceof TypeVariable){
        bound = resolveBound((TypeVariable<?>)bound);
    }
    return bound;
}