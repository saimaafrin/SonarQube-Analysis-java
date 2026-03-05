class Generated {
    public static char[] toPrimitive(final Character[] array){
    if(array==null){  
            return null;  
        }else if(array.length==0){  
            return ArrayUtils.EMPTY_CHAR_ARRAY;  
        }  
        final char[] result=new char[array.length];  
        for(int i=0;i<array.length;i++){  
            result[i]=array[i].charValue();  
        }  
        return result;  
    }
}
