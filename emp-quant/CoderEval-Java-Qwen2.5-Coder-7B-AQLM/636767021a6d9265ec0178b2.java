class Generated {
    private void pop(final String descriptor){
    switch(descriptor.charAt(0)){  
            case 'B':  
                popByte();  
                break;  
            case 'C':  
                popChar();  
                break;  
            case 'D':  
                popDouble();  
                break;  
            case 'F':  
                popFloat();  
                break;  
            case 'I':  
                popInt();  
                break;  
            case 'J':  
                popLong();  
                break;  
            case 'S':  
                popShort();  
                break;  
            case 'Z':  
                popBoolean();  
                break;  
            case '[':  
                popArray();  
                break;  
            case 'L':  
                popObject();  
                break;  
            default:  
                throw new IllegalArgumentException("Invalid descriptor: " + descriptor);  
        }  
    }
}
