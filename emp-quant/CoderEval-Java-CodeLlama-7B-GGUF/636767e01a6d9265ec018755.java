private Map<String,Object> buildContent(JsonObject jsonObject){
Map<String,Object> content = new HashMap<>();
    content.put("title",jsonObject.get("title").getAsString());
    content.put("description",jsonObject.get("description").getAsString());
    content.put("url",jsonObject.get("url").getAsString());
    content.put("urlToImage",jsonObject.get("urlToImage").getAsString());
    content.put("publishedAt",jsonObject.get("publishedAt").getAsString());
    content.put("content",jsonObject.get("content").getAsString());
    return content;
}
\end{code}

\strong{The error:}

\begin{code}
java.lang.IllegalStateException: Expected BEGIN_OBJECT but was STRING at line 1 column 1 path $
\end{code}

\strong{The json:}

\begin{code}
{
    "status": "ok",
    "totalResults": 100,
    "articles": [
        {
            "source": {
                "id": null,
                "name": "The Verge"
            },
            "author": "Jonathan Cheng",
            "title": "The Verge's 2019 Holiday Gift Guide: Best gadgets, gizmos, and more",
            "description": "The Verge's 2019 Holiday Gift Guide: Best gadgets, gizmos, and more",
            "url": "https://www.theverge.com/2019/12/20/21019997/gadgets-gizmos-holiday-gift-guide-2019",
            "urlToImage": "https://cdn.vox-cdn.com/thumbor/43_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
}}