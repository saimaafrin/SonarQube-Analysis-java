int visitFrameStart(final int offset,final int numLocal,final int numStack){
currentFrame = new Frame(offset,numLocal,numStack);
    return 3;
}