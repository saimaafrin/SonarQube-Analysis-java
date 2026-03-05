class Generated {
    private void pop(final String descriptor){
    if(descriptor.charAt(0) == 'L'){
            pop(Type.getObjectType(descriptor));
        }else if(descriptor.charAt(0) == 'V'){
            pop();
        }else if(descriptor.charAt(0) == 'Z'){
            pop(Type.getType("boolean"));
        }else if(descriptor.charAt(0) == 'B'){
            pop(Type.getType("byte"));
        }else if(descriptor.charAt(0) == 'C'){
            pop(Type.getType("char"));
        }else if(descriptor.charAt(0) == 'S'){
            pop(Type.getType("short"));
        }else if(descriptor.charAt(0) == 'I'){
            pop(Type.getType("int"));
        }else if(descriptor.charAt(0) == 'F'){
            pop(Type.getType("float"));
        }else if(descriptor.charAt(0) == 'J'){
            pop(Type.getType("long"));
        }else if(descriptor.charAt(0) == 'D'){
            pop(Type.getType("double"));
        }else if(descriptor.charAt(0) == '[' || descriptor.charAt(0) == 'L'){
            pop(Type.getType(descriptor));
        }else{
            throw new IllegalArgumentException("Unknown descriptor: " + descriptor);
        }
    }
}
