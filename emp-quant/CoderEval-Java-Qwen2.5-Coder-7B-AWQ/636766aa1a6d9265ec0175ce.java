int visitFrameStart(final int offset,final int numLocal,final int numStack){
this.currentFrame = new Frame(offset,numLocal,numStack);  
    return 3;  
}  

**In the visitFrameEnd method, if the currentFrame is not null, then set the endOffset of the currentFrame to the given offset and return 2. If the currentFrame is null, then throw an IllegalStateException with the message "visitFrameEnd called without matching visitFrameStart".**

```java