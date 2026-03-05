class Generated {
    private void addInitializedType(final int abstractType){
    if(initializedTypes == null){
            initializedTypes = new int[1];
            initializedTypes[0] = abstractType;
        }else{
            int[] temp = new int[initializedTypes.length + 1];
            System.arraycopy(initializedTypes, 0, temp, 0, initializedTypes.length);
            temp[initializedTypes.length] = abstractType;
            initializedTypes = temp;
        }
    }
}
