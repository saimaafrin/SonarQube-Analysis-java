public static String reverse(final String str){
if(str == null){  
        throw new IllegalArgumentException("Input string cannot be null");  
    }  
    return new StringBuilder(str).reverse().toString();  
}  

**Reverse the given String as per the given index.**