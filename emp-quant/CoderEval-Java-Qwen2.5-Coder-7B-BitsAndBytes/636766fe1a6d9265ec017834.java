class Generated {
    public static String sessionId(){
    return FacesContext.getCurrentInstance().getExternalContext().getSessionId(); }
}
