public static boolean isSameLength(final double[] array1,final double[] array2){
if(array1==null || array2==null){
    return array1==array2;
  }
  return array1.length==array2.length;
}