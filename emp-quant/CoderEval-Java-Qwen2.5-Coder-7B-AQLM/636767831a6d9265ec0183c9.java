public static String peek(){
if (isEmpty()) {
        return null;
    }
    return stackArray[top];
}