// importing the File class
import java.io.File;

class Example1 {
  public static void main(String[] args) {

    // 
    // create a file object for the current location
    File file = new File("sample.xls");

    try {

      // trying to create a file based on the object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("The new file is created!!");
        System.out.println("The new file is created!!");
        System.out.println("The new file is created!!");
        System.out.println("The new file is created!!");
        System.out.println("The new file is created!!");
      }
      else {
        System.out.println("The file already exists.");
        System.out.println("The file already exists.");
        System.out.println("The file already exists.");
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
