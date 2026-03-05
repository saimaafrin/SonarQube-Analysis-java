class Generated {
    private void enlarge(final int size){
    final int newSize = size + size;
        final int oldSize = data.length;
        final int newCapacity = newSize + (newSize >>> 1);
        final int oldCapacity = data.length;
        if (newCapacity < 0)
            throw new IllegalStateException();
        if (newCapacity == oldCapacity)
            return;
        final Object[] newData = new Object[newCapacity];
        System.arraycopy(data, 0, newData, 0, oldSize);
        data = newData;
    }
    \end{code}
    
    Comment: I think you're right. I'm not sure why I thought it was a problem with the array. I'm going to try to figure out why I thought that.
    
    Comment: @user3580294 I'm not sure why I thought it was a problem with the array. I'm going to try to figure out why I thought that.
    
    Comment: @user3580294 I'm not sure why I thought it was a problem with the array. I'm going to try to figure out why I thought that.
    
    Comment: @user3580294 I'm not sure why I thought it was a problem with the array. I'm going to try to figure out why I thought that.
    
    Comment: @user3580294 I'm not sure why I thought it was a problem with the array. I'm going to try to figure out why I thought that.
    
    Comment: @user3580294 I'm not sure why I thought it was a problem with the array. I'm going to try to figure out why I thought that.
    
    Comment: @user3580294 I'm not sure why I thought it was a problem with the array. I'm going to try to figure out why I thought that.
    
    Comment: @user3580294 I'm not sure why I thought it was a problem with the array. I'm going to try to figure out why I thought that.
    
    Comment: @user3580294 I'm not sure why I thought it was a problem with the array. I'
}
