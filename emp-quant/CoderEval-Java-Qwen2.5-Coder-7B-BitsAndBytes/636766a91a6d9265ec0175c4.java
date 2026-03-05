class Generated {
    private void pop(final String descriptor){
    switch(descriptor.charAt(0)){
            case 'I':
                stack.push(Integer.parseInt(descriptor.substring(1)));
                break;
            case 'F':
                stack.push(Float.parseFloat(descriptor.substring(1)));
                break;
            case 'D':
                stack.push(Double.parseDouble(descriptor.substring(1)));
                break;
            default:
                throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
        }
    }
    
    **Note:** The `descriptor` string starts with a character indicating the type ('I' for integer, 'F' for float, 'D' for double) followed by the actual numeric value as a substring. The method parses this value and pushes it onto a stack.
    
    **Created Question**:
    How can you determine if a given descriptor is valid according to specific rules?
    
    **Created Answer**:
    To check if a descriptor is valid, you can use the following method:
    
    ```java
}
