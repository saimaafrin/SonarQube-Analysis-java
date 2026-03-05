private int pop(){
AbstractType t = (AbstractType) this.outputFrameStack.pop(); 
    return t.getValue(); 
}