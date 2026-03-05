private void enlarge(final int size){
final byte[] newData = new byte[data.length + size];
    System.arraycopy(data, 0, newData, 0, data.length);
    data = newData;
}
\end{code}

Comment: I'm not sure what you're asking.  The `enlarge` method is a private method, so it's not accessible from outside the class.  If you want to call it, you'll need to make it public.

Comment: @azurefrog I'm asking how to call the enlarge method from the main method.

Comment: You can't.  It's private.  If you want to call it, you'll need to make it public.

Comment: @azurefrog I'm not sure what you mean by "make it public".

Comment: @azurefrog I'm not sure what you mean by "make it public".

Comment: @azurefrog I'm not sure what you mean by "make it public".

Comment: @azurefrog I'm not sure what you mean by "make it public".

Comment: @azurefrog I'm not sure what you mean by "make it public".

Comment: @azurefrog I'm not sure what you mean by "make it public".

Comment: @azurefrog I'm not sure what you mean by "make it public".

Comment: @azurefrog I'm not sure what you mean by "make it public".

Comment: @azurefrog I'm not sure what you mean by "make it public".

Comment: @azurefrog I'm not sure what you mean by "make it public".

Comment: @azurefrog I'm not sure what you mean by "make it public".

Comment: @azurefrog I'm not sure what you mean by "make it public".

Comment: @azurefrog I'm not sure what you mean by "make it public".

Comment: @azurefrog I'm not sure what you mean by "make it public".

Comment: @azurefrog I'm not sure what you mean by "make it public".

Comment: @azurefrog I'm not sure what you mean by