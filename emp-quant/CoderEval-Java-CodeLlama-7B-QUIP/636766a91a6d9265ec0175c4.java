class Generated {
    private void pop(final String descriptor){
    if(descriptor.charAt(0) == 'L'){
            push(new Object());
        }else if(descriptor.charAt(0) == 'I'){
            push(new Integer(0));
        }else if(descriptor.charAt(0) == 'F'){
            push(new Float(0));
        }else if(descriptor.charAt(0) == 'D'){
            push(new Double(0));
        }else if(descriptor.charAt(0) == 'S'){
            push(new Short(0));
        }else if(descriptor.charAt(0) == 'B'){
            push(new Byte(0));
        }else if(descriptor.charAt(0) == 'C'){
            push(new Character('0'));
        }else if(descriptor.charAt(0) == 'Z'){
            push(new Boolean(false));
        }else if(descriptor.charAt(0) == 'V'){
            push(new Void());
        }else if(descriptor.charAt(0) == '['){
            push(new Object[0]);
        }else if(descriptor.charAt(0) == 'L'){
            push(new Object());
        }else{
            throw new IllegalArgumentException("Unsupported type: " + descriptor);
        }
    }
}
