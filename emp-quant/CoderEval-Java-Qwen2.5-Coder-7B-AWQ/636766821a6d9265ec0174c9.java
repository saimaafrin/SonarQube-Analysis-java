class Generated {
    private static File[] classPath(){
    String path = System.getProperty("java.class.path");
        String[] paths = path.split(File.pathSeparator);
        List<File> list = new ArrayList<>();
        for(String p : paths){
            File f = new File(p);
            if(f.exists() && f.isDirectory()){
                File[] files = f.listFiles((dir, name) -> name.endsWith(".class"));
                if(files != null){
                    Collections.addAll(list, files);
                }
            } else if(f.exists() && f.isFile()){
                String fileName = f.getName();
                if(fileName.endsWith(".class")){
                    list.add(f);
                }
            }
        }
        return list.toArray(new File[0]);
    }
}
