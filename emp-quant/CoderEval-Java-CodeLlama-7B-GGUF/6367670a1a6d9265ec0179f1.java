public static Short[] toObject(final short[] array){
if(null == array){
        return null;
    }else{
        Short[] ret = new Short[array.length];
        for(int i = 0; i < ret.length; i++){
            ret[i] = array[i];
        }
        return ret;
    }
}