private static File[] classPath(){
String path = System.getProperty("java.class.path");
    String[] paths = path.split(File.pathSeparator);
    ArrayList<File> list = new ArrayList<>();
    for(String p : paths){
        File f = new File(p);
        if(f.exists()){
            if(f.isDirectory()){
                File[] files = f.listFiles((dir, name) -> name.endsWith(".class"));
                if(files != null){
                    Collections.addAll(list, files);
                }
            } else {
                if(p.endsWith(".jar")){
                    try(JarFile jar = new JarFile(p)){
                        Enumeration<JarEntry> entries = jar.entries();
                        while(entries.hasMoreElements()){
                            JarEntry entry = entries.nextElement();
                            if(entry.getName().endsWith(".class")){
                                list.add(new File(jar.getName(), entry.getName()));
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    return list.toArray(new File[0]);
}