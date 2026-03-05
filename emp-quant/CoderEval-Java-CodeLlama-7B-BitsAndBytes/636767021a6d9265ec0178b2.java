class Generated {
    private void pop(final String descriptor){
    switch(descriptor.charAt(0)){
            case 'V':
                return;
            case 'Z':
                pop(1);
                break;
            case 'B':
            case 'C':
            case 'S':
            case 'I':
            case 'F':
                pop(1);
                break;
            case 'J':
                pop(2);
                break;
            case 'D':
                pop(2);
                break;
            case '[':
                pop(descriptor.substring(1));
                break;
            case 'L':
                pop(descriptor.substring(1));
                break;
            default:
                throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
        }
    }
}
