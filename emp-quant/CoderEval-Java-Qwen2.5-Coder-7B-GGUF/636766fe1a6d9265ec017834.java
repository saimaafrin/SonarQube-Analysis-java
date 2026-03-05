public static String sessionId(){
return FacesContext.getCurrentInstance().getExternalContext().getSessionId(false);  
}  

**Return the servlet session id with creation time**