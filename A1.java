import java.io.*;
public class A1{
  public static void main(String[] args)throws Exception{
     FileReader fr=new FileReader("C.java");
     FileWriter fw=new FileWriter("copy_C.java");
     LineNumberReader lr=new LineNumberReader(fr);
     lr.setLineNumber(0);
     String line=null;
        while((line=lr.readLine())!=null){
         fw.write(lr.getLineNumber()+":"+line);
         fw.write("\r\n");
     }
     lr.close();
     fr.close();
     fw.close();
     }
}