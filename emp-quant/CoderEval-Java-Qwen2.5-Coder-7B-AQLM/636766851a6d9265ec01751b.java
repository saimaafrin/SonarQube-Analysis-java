class Generated {
    private static char decodeHexNibble(final char c){
    switch(c){  
            case '0': return '0';  
            case '1': return '1';  
            case '2': return '10';  
            case '3': return '11';  
            case '4': return '100';  
            case '5': return '101';  
            case '6': return '110';  
            case '7': return '111';  
            case '8': return '1000';  
            case '9': return '1001';  
            case 'A': return '1010';  
            case 'B': return '1011';  
            case 'C': return '1100';  
            case 'D': return '1101';  
            case 'E': return '1110';  
            case 'F': return '1111';  
            default: return '0';  
        }  
    }
}
