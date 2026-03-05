private void putAbstractTypes(final int start,final int end){
for(int i=start;i<end;i++){
		final int index=i-start;
		final int type=currentFrame.get(i);
		if(type==0){
			frame.put(index,null);
		}else if(type==1){
			frame.put(index,new Integer(currentFrame.get(i+1)));
			i++;
		}else if(type==2){
			frame.put(index,new Double(currentFrame.get(i+1)));
			i++;
		}else if(type==3){
			frame.put(index,new String(currentFrame.get(i+1)));
			i++;
		}else if(type==4){
			frame.put(index,new Boolean(currentFrame.get(i+1)));
			i++;
		}else if(type==5){
			frame.put(index,new Object[]{currentFrame.get(i+1),currentFrame.get(i+2)});
			i+=2;
		}else if(type==6){
			frame.put(index,new Object[]{currentFrame.get(i+1),currentFrame.get(i+2),currentFrame.get(i+3)});
			i+=3;
		}else if(type==7){
			frame.put(index,new Object[]{currentFrame.get(i+1),currentFrame.get(i+2),currentFrame.get(i+3),currentFrame.get(i+4)});
			i+=4;
		}else if(type==8){
			frame.put(index,new Object[]{currentFrame.get(i+1),currentFrame.get(i+2),currentFrame.get(i+3),currentFrame.get(i+4),currentFrame.get(i+5)});
			i+=5;
		}else if(type==9){
			frame.put(index,new Object[]{currentFrame.get(i+1),currentFrame.get
}}}}