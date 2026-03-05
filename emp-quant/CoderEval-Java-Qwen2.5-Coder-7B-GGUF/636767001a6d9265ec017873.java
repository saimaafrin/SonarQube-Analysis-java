public static String reverse(final String str){
if(str == null){  
        throw new IllegalArgumentException("Input String cannot be null");  
    }  
    return new StringBuilder(str).reverse().toString();  
}  

**Reverse the given String as per.**