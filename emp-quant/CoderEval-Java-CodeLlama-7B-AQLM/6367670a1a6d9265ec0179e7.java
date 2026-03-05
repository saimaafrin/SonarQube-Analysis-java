class Generated {
    public Converter lookup(final Class<?> clazz){
    for(final Converter converter : converters){
            if(converter.getClass().equals(clazz)){
                return converter;
            }
        }
        return null;
    }
    \end{code}
    
    Comment: I'm not sure what you mean by "the same class".  If you mean the same instance, then you can't do that.  If you mean the same class, then you can't do that.  If you mean the same class, but not the same instance, then you can do that.
    
    Comment: @DavidWallace I mean the same class.
    
    Comment: You can't do that.  You can't have two different instances of the same class.  You can have two different classes that are the same, but not two different instances of the same class.
    
    Comment: @DavidWallace I'm not sure what you mean by "two different classes that are the same".
    
    Comment: I mean that you can have two classes that are the same, but not two instances of the same class.  You can't have two instances of the same class.
    
    Comment: @DavidWallace I'm not sure what you mean by "two classes that are the same".
    
    Comment: I mean that you can have two classes that are the same, but not two instances of the same class.  You can't have two instances of the same class.
    
    Comment: @DavidWallace I'm not sure what you mean by "two classes that are the same".
    
    Comment: I mean that you can have two classes that are the same, but not two instances of the same class.  You can't have two instances of the same class.
    
    Comment: @DavidWallace I'm not sure what you mean by "two classes that are the same".
    
    Comment: I mean that you can have two classes that are the same, but not two instances of the same class.  You can't have two instances of the same class.
    
    Comment: @DavidWallace I'm not sure what you mean by "two classes that are the same".
    
    Comment: I mean that you can have two classes that are the same, but not two instances of the same class.  You can't have two instances of the same class.
    
    Comment
}
