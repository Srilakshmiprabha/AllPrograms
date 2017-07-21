package Ioclass;

	import java.io.*;  
	public class Filter {  
	    public static void main(String[] args) throws IOException {  
	        File data = new File("out.txt");  
	        FileOutputStream file = new FileOutputStream(data);  
	        FilterOutputStream filter = new FilterOutputStream(file);  
	        String s="Welcome to javaTpoint.";      
	        byte b[]=s.getBytes();      
	        filter.write(b);     
	        filter.flush();  
	        filter.close();  
	        file.close();  
	        System.out.println("Success...");  
	         data = new File("out.txt");  
	        FileInputStream  file1 = new FileInputStream(data);  
	        FilterInputStream filter1 = new BufferedInputStream(file1);  
	        int k =0;  
	        
	        while((k=filter1.read())!=-1){  
	            System.out.print((char)k);  
	           
	        }  
	        file.close();  
	        filter.close();  
	    }  
	 }  
	  
	   
	