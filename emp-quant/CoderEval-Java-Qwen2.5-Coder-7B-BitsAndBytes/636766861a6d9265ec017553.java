public final boolean isTemplateVariablePresent(String name){
// Check if the provided name is a key in the map
    return this.templateVariables.containsKey(name);
}