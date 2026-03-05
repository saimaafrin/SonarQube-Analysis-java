int visitFrameStart(final int offset,final int numLocal,final int numStack){
this.currentFrame = new Frame(offset,numLocal,numStack);  
    return 3;  
}  

**In the visitFrameEnd method, if the currentFrame is not null, then pop all elements from the stack of the currentFrame until it's empty, and set the currentFrame to null. Return 2 finally.**

```