class Generated {
    public static String stripFilenameExtension(String path){
    stripFilenameExtension("example.txt") returns "example"
    stripFilenameExtension("example.docx") returns "example"
    stripFilenameExtension("example.") returns "example."
    stripFilenameExtension(".txt") returns ".txt"
    }
}
