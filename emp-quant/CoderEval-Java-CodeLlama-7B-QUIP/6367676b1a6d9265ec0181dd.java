class Generated {
    public static int countOccurrencesOf(String str,String sub){
    int count = 0;
        int index = 0;
        while(index >= 0) {
            index = str.indexOf(sub, index+1);
            if(index >= 0) {
                count++;
            }
        }
        return count;
    }
}
