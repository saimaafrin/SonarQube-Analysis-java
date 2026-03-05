static String[] toNoNullStringArray(Object[] array){
static int[] filterEvenNumbers(int[] array) {
    if (array == null || array.length == 0) {
        return new int[0];
    }
    List<Integer> evenNumbers = new ArrayList<>();
    for (int num : array) {
        if (num % 2 == 0) {
            evenNumbers.add(num);
        }
    }
    return evenNumbers.stream().mapToInt(Integer::intValue).toArray();
}
}