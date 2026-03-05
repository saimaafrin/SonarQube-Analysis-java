private Map<String,Object> buildContent(JsonObject jsonObject){
Map<String,Object> content = new HashMap<String,Object>();
    content.put("title",jsonObject.get("title").getAsString());
    content.put("description",jsonObject.get("description").getAsString());
    content.put("url",jsonObject.get("url").getAsString());
    content.put("urlToImage",jsonObject.get("urlToImage").getAsString());
    content.put("publishedAt",jsonObject.get("publishedAt").getAsString());
    content.put("content",jsonObject.get("content").getAsString());
    return content;
}
\end{code}

Comment: I'm not sure what you're asking.  Are you asking how to convert a `JsonObject` to a `Map<String,Object>`?

Comment: Yes, I want to convert a JsonObject to a Map<String,Object>

Comment: I've added an example of how to do that.

Answer: You can use the `getAsString()` method to get the value of a field as a string.  You can then use that string to create a `Map` entry.

\begin{code}
Map<String,Object> content = new HashMap<String,Object>();
content.put("title",jsonObject.get("title").getAsString());
content.put("description",jsonObject.get("description").getAsString());
content.put("url",jsonObject.get("url").getAsString());
content.put("urlToImage",jsonObject.get("urlToImage").getAsString());
content.put("publishedAt",jsonObject.get("publishedAt").getAsString());
content.put("content",jsonObject.get("content").getAsString());
\end{code}

Comment: Thank you very much, it works. I'm new to Java and I'm still learning.