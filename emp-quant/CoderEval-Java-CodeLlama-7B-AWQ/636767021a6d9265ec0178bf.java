@Override protected Object convertToType(final Class<?> type,final Object value) throws Exception {
if (value == null) {
        return null;
    }
    if (value instanceof String) {
        final String string = (String) value;
        if (string.length() == 0) {
            return defaultValue;
        }
        return string.substring(0, 1);
    }
    return super.convertToType(type, value);
}
\end{code}

Comment: I'm not sure I understand what you're trying to do.  Can you give an example of what you're trying to do?

Comment: I'm trying to get the first character of a string.

Comment: I'm not sure what you mean by "first character".  Do you mean the first character of the string, or the first character of the first element of the string?

Comment: I mean the first character of the string.

Comment: I'm not sure what you mean by "first character".  Do you mean the first character of the string, or the first character of the first element of the string?

Comment: I mean the first character of the string.

Comment: I'm not sure what you mean by "first character".  Do you mean the first character of the string, or the first character of the first element of the string?

Comment: I mean the first character of the string.

Comment: I'm not sure what you mean by "first character".  Do you mean the first character of the string, or the first character of the first element of the string?

Comment: I mean the first character of the string.

Comment: I'm not sure what you mean by "first character".  Do you mean the first character of the string, or the first character of the first element of the string?

Comment: I mean the first character of the string.

Comment: I'm not sure what you mean by "first character".  Do you mean the first character of the string, or the first character of the first element of the string?

Comment: I mean the first character of the string.

Comment: I'm not sure what you mean by "first character".  Do you mean the first character of the string, or the first character of the first element of the string?

Comment: I mean the first