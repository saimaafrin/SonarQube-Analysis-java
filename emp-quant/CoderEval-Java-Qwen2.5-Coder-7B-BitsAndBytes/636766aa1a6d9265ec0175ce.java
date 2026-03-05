int visitFrameStart(final int offset,final int numLocal,final int numStack){
this.currentFrame = new Frame(offset,numLocal,numStack);  
    return 3;  
}  

**visitFrameEnd() is called when the frame ends, it will check if the currentFrame is null, if so, throw an IllegalStateException. If not, it will call the method `visitFrameEnd()` of the visitor object.**

```java