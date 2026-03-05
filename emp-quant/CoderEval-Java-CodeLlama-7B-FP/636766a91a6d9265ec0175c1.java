class Generated {
    private void enlarge(final int size){
    final int oldSize = data.length;
        final int newSize = oldSize + size;
        final int[] newData = new int[newSize];
        System.arraycopy(data, 0, newData, 0, oldSize);
        data = newData;
    }
    \end{code}
    
    Comment: I'm not sure what you mean by "longer array".  The array is already of size 1000.  The problem is that the array is full, and you need to add more elements to it.  You can't just add more elements to the array, because the array is already full.  You need to create a new array that is larger than the original array, and copy the elements from the original array to the new array.
    
    Comment: @ajb I think he means that the array is of size 1000, but the index is 999, so the array is full.
    
    Comment: @ajb I think you are right.  I'm not sure what I was thinking.
    
    Comment: @ajb I think I understand what you are saying.  I'll try to implement it.
    
    Comment: @ajb I've updated the code.  I'm not sure if it's correct.
    
    Comment: @ajb I've updated the code.  I'm not sure if it's correct.
    
    Comment: @ajb I've updated the code.  I'm not sure if it's correct.
    
    Comment: @ajb I've updated the code.  I'm not sure if it's correct.
    
    Comment: @ajb I've updated the code.  I'm not sure if it's correct.
    
    Comment: @ajb I've updated the code.  I'm not sure if it's correct.
    
    Comment: @ajb I've updated the code.  I'm not sure if it's correct.
    
    Comment: @ajb I've updated the code.  I'm not sure if it's correct.
    
    Comment: @ajb I've updated the code.  I'm not sure if it's correct.
    
    Comment: @ajb I've updated the code.  I'm
}
