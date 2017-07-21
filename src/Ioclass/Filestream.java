package Ioclass;

import java.io.*;

public class Filestream {
	public static void main(String args[]){    
	           try{    
	             FileOutputStream fout=new FileOutputStream("java.txt"); 
	             
	             String s="Welcome to io.";    
	             byte b[]=s.getBytes(); 
	             fout.write(b);
	             FileOutputStream out=new FileOutputStream("file.txt"); 
	           String s1="this is for sequence";    
	              byte d[]=s1.getBytes(); 
	             fout.write(d);
	             BufferedOutputStream bout=new BufferedOutputStream(fout);
	             
	             s="Welcome to buffered reader";    
	             byte c[]=s.getBytes();    
	             bout.write(c);    
	             bout.flush();    
	             bout.close(); 
	             
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	      try{    
	            FileInputStream fin=new FileInputStream("java.txt");    
	            int i=0;    
	            
	            while((i=fin.read())!=-1){ 
	            //	int available=fin.available();
	            //	System.out.println(available);
	             System.out.print((char)i);    
	            }    try{    
	                 
	                BufferedInputStream bin=new BufferedInputStream(fin);    
	                  
	                while((i=bin.read())!=-1){    
	                 System.out.print((char)i);    
	                }    
	                bin.close();    
	                fin.close();    
	              }catch(Exception e){System.out.println(e);}    
	                
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}    
	         }
}
