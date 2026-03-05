class Generated {
    private void pop(final String descriptor){
    if (descriptor.charAt(0) == 'I') {  
        popInt();  
      } else if (descriptor.charAt(0) == 'J') {  
        popLong();  
      } else if (descriptor.charAt(0) == 'F') {  
        popFloat();  
      } else if (descriptor.charAt(0) == 'D') {  
        popDouble();  
      } else if (descriptor.charAt(0) == 'L') {  
        popLong();  
      } else {  
        pop();  
      }  
    }
}
