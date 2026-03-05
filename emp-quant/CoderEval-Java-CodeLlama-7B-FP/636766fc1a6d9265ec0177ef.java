static String[] toNoNullStringArray(Object[] array){
if(array == null){
        return null;
    }
    int i = 0;
    for(Object object : array){
        if(object == null){
            continue;
        }
        if(object instanceof String){
            array[i] = (String)object;
            i++;
        }
    }
    if(i == 0){
        throw new RuntimeException("The size of array is zero,it can not be converted to String array.");
    }
    return Arrays.copyOf(array, i);
}