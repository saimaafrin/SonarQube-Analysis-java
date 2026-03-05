class Generated {
    public static Type resolveBound(TypeVariable<?> typeVariable){
    Type[] bounds = typeVariable.getBounds();
        if(bounds.length == 0){
            return Unknown.class;
        }
        Type bound = bounds[0];
        if(bound instanceof TypeVariable){
            return resolveBound((TypeVariable<?>)bound);
        }
        return bound;
    }
}
