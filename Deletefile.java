import java.io.*;

public class Deletefile{
public static void main (String[]args){

File f=new File("C:\\Users\\Hp\\Desktop\\HTML.txt");


try {

      // f.createNewFile();
          f.delete();
       }
       catch(Exception e){
       throw new RuntimeException(e);
       }
     }
   }