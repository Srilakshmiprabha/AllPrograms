package Ioclass;
import java.io.*;

public class Data {
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("testout.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.writeChar(65); 
        data.writeShort(89); 
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  

}
