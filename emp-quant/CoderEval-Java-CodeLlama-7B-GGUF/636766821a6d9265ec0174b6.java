class Generated {
    public static Class<?>[] resolveArguments(Type genericType,Class<?> targetType){
    if(genericType instanceof ParameterizedType){
    		ParameterizedType parameterizedType=(ParameterizedType)genericType;
    		Type[] actualTypeArguments=parameterizedType.getActualTypeArguments();
    		Class<?>[] resolvedArguments=new Class<?>[actualTypeArguments.length];
    		for(int i=0;i<actualTypeArguments.length;i++){
    			Type actualTypeArgument=actualTypeArguments[i];
    			if(actualTypeArgument instanceof TypeVariable){
    				TypeVariable<?> typeVariable=(TypeVariable<?>)actualTypeArgument;
    				TypeVariable<?>[] typeVariables=targetType.getTypeParameters();
    				for(int j=0;j<typeVariables.length;j++){
    					if(typeVariables[j].getName().equals(typeVariable.getName())){
    						resolvedArguments[i]=typeVariables[j].getBounds()[0];
    						break;
    					}
    				}
    			}else{
    				resolvedArguments[i]=resolveType(actualTypeArgument);
    			}
    		}
    		return resolvedArguments;
    	}
    	return null;
    }
}
