class Generated {
    private void pop(final String descriptor){
    switch(descriptor.charAt(0)){
            case 'Z':
            case 'C':
            case 'B':
            case 'S':
            case 'I':
                push(pop().intValue());
                break;
            case 'F':
            case 'J':
            case 'D':
                push(pop().longValue());
                break;
            case '[':
            case 'L':
                push(pop().refValue());
                break;
            default:
                throw new IllegalStateException("Unexpected descriptor: " + descriptor);
        }
    }
}
