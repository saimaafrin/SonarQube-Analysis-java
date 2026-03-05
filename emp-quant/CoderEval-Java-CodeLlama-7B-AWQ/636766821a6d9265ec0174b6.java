class Generated {
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
    if(!(genericType instanceof ParameterizedType)){
    		return null;
    	}
    	ParameterizedType parameterizedType=(ParameterizedType)genericType;
    	Type[] actualTypeArguments=parameterizedType.getActualTypeArguments();
    	Class<?>[] resolvedArguments=new Class<?>[actualTypeArguments.length];
    	for(int i=0;i<actualTypeArguments.length;i++){
    		resolvedArguments[i]=resolveType(actualTypeArguments[i],targetType);
    	}
    	return resolvedArguments;
    }
}
