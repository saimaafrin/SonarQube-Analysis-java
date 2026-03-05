public static String sessionId(){
return FacesContext.getCurrentInstance().getExternalContext().getSessionId(false);
} 

**Return the servlet request URI**