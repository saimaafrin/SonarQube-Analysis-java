public static boolean isSameLength(final double[] array1,final double[] array2){
if(array1==null&&array2==null){
        return true;
    }else{
        return array1.length==array2.length;
    }
}