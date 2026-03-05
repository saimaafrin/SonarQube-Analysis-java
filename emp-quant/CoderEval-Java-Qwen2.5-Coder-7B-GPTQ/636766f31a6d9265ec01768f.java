class Generated {
    public static char[] clone(final char[] array){
    if(array==null){
            return null;
        }
        final char[] copy=new char[array.length];
        System.arraycopy(array,0,copy,0,array.length);
        return copy;
    }
}
