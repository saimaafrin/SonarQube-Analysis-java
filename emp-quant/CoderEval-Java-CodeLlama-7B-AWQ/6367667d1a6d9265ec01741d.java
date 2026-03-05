class Generated {
    public static Type resolveBound(TypeVariable<?> typeVariable){
    Type[] bounds = typeVariable.getBounds();
        if(bounds.length == 0){
            return Unknown.class;
        }
        return resolveBound(bounds[0]);
    }
}
