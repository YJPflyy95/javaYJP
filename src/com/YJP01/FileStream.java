package com.YJP01;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;


public class FileStream 
{
	 public static void main(String[] args) throws IOException {
		
		/* FileWriter fw=new FileWriter("fw.txt",true); 
		 fw.write("你好");
		 fw.flush();
		 fw.close();*/
		 
		/* FileReader fr=new FileReader("d:\\a.txt");
		 FileWriter fw = new FileWriter("copy.txt");
		  
	     char[] chs=new char[5];
	      int len;
	      
	      while( ( len=fr.read(chs) )!=-1)
	      {
	    	  fw.write(new String(chs,0,len) );
	    	  System.out.print(new String(chs,0,len));
	      }
		 
		 fw.close();
		 fr.close();*/
		 
		/* BufferedWriter bw=new BufferedWriter(new FileWriter("copy.txt"));
		 BufferedReader br=new BufferedReader(new FileReader("d:\\a.txt"));
		     
		    String str;
		   while(( str=br.readLine() )!=null)
		   { 
			  bw.write(str);	  
			  bw.newLine();
			  System.out.println(str);
		   }
		 
		 
		 bw.close();
		 br.close();*/
		 
		/* ArrayList<String> arrayList=new ArrayList<>();
	     arrayList.add("你好");
		 arrayList.add("中国");
		 arrayList.add("杨锦鹏");
		 
		 BufferedWriter bWriter=new BufferedWriter(new FileWriter("array"));
		   
		  String str;
		   for(int i=0;i<arrayList.size();i++)
		   {   
			  str=arrayList.get(i);
			  bWriter.write(str);
			  bWriter.newLine();
			  
			  System.out.println(str);
		   }
		 
		  bWriter.flush();
		  bWriter.close();
		  */ 
		 
		  BufferedReader br=new BufferedReader(new FileReader("array.txt"));
		  ArrayList<String> arrayList=new ArrayList<>();
		  String str;
		   while( (str=br.readLine())!=null )
		   { 
			   arrayList.add(str);
		   }
		 
		   for(int i=0;i<arrayList.size();i++)
		   { 
			   System.out.print(new String( arrayList.get(i) ) );
		   }
		   
		 
	}
	
}
