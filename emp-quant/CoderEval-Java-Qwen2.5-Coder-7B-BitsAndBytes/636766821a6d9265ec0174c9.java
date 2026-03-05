class Generated {
    private static File[] classPath(){
    String path = System.getProperty("java.class.path");
        String[] paths = path.split(File.pathSeparator);
        ArrayList<File> list = new ArrayList<>();
        for(String p : paths){
            File f = new File(p);
            if(f.isFile() && f.getName().endsWith(".class")){
                list.add(f);
            }
        }
        return list.toArray(new File[0]);
    }
}
