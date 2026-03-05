public static Double[] toObject(final double[] array){
if (array == null) return null;
  final int len = array.length;
  final Double[] ret = new Double[len];
  for (int i = 0; i < len; i++) {
   ret[i] = Double.valueOf(array[i]);
  }
  return ret;
 }
}