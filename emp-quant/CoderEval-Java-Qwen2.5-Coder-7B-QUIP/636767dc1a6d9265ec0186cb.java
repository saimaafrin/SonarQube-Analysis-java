public void init(){
//creates a new directory
  File dir = new File("newDir");
  boolean result = dir.mkdir();
  if(result){
    System.out.println("Directory created successfully");
  }else{
    System.out.println("Failed to create directory");
  }
}

**Created Question**:
How can you check if a directory exists and create it if it does not exist?

**Created Answer**:
To check if a directory exists and create it if it does not exist, you can use the `exists()` method to check the directory's existence and the `mkdir()` method to create the directory. Here's an example:

```java