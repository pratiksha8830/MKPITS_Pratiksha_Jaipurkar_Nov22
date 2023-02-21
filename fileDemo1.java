import java.io.*;

public class fileDemo1{
public static void main (String[]args){

File f=new File("C:\\Users\\Hp\\Desktop\\HTML.txt");


try {

       f.createNewFile();
       }
       catch(Exception e){
       throw new RuntimeException(e);
       }
     }
   }