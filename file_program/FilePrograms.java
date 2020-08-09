/* copy one file data into another file.
 (using FileInputStream &File OutputStream)*/

/*
import java.io.*;
class FilePrograms
{
	public static void main(String[] args)
	{
		File f1=new File("sample.txt");
		if(f1.exists())
		{
		
			try
			{
				FileInputStream fin=new FileInputStream("sample.txt");
				FileOutputStream fout=new FileOutputStream("temp.txt");
				
				
				while((c=fin.read())!=-1)
				{
					fout.write((char)c);
				}
				
				
				fin.close();
				fout.close();
	
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("file not found");
		}
	}
}


*/


/* copy one file data into another file.
 (using FileReader & File OutputWriter)


import java.io.*;
class FileProgramme
{
	public static void main(String[] args)
	{
		File f1=new File("sample.txt");
		if(f1.exists())
		{
		
			try
			{
				FileReader fr=new FileReader("sample.txt");
				FileWriter fw=new FileWriter("temp.txt");
				
				long l=f1.length();
				char[] ch=new char[(int)l];
				
				fr.read(ch);
				//String s=new String(ch);
				fw.write(ch);
				
				
				fr.close();
				fw.close();
	
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
		else
		{	
			System.out.println("file not found");
		}
	}
}

*/






/* copy one file data into another file.
 (using BufferedReader & File BufferedWriter)


import java.io.*;
class FileProgramme
{
	public static void main(String[] args)
	{
		File f1=new File("sample.txt");
		if(f1.exists())
		{
		
			try
			{
				BufferedReader fr=new BufferedReader(new FileReader("sample.txt"));
				BufferedWriter fw=new BufferedWriter(new FileWriter("temp.txt",true));
				
				String s;
				while((s=fr.readLine())!=null)
				{
						System.out.println(s);
						fw.write(s);
				}
				fr.close();
				fw.close();
	
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
		else
		{	
			System.out.println("file not found");
		}
	}
}


*/


// append one file data into another file accept file name from cmd

/*

import java.io.*;
class FilePrograms
{
	public static void main(String[] args)
	{
		File f1=new File(args[0]);
		if(f1.exists())
		{
		
			try
			{
				FileReader fr=new FileReader(args[0]);
				FileWriter fw=new FileWriter(args[1],true);
				
				int len=(int)f1.length();
				char[] ch=new char[len];
				
				fr.read(ch);
				
				fw.write(ch);
				
				
				fr.close();
				fw.close();
	
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
		else
		{	
			System.out.println("file not found");
		}
	}
}


*/

/* w a p to get file name from the command promt check weather file is exists or not

if it is regular file then display various details about that file,but if it is directory

then display the number of file in that directory.   */



/*
import java.io.*;
class FilePrograms
{
	public static void main(String[] args)
	{
		File f1=new File("sample.txt");
		
		if(f1.exists())
		{
			if(f1.isFile())
			{
				System.out.println("File Name="+f1.getName());
				System.out.println("Path ="+f1.getPath());
				System.out.println("File size="+f1.length()+"bytes");
				System.out.println("parent ="+f1.getParent());
				System.out.println(f1.canRead()?"file is readable":"file is not readable");
				System.out.println(f1.canWritable()?"file is readable":"file is not readable");
				System.out.println(f1.isHidden()?"file is readable":"file is not readable");
			}
			else if(f1.isDirectory())
			{
				int count;
				String s[]=f1.list();
				
				
				count=s.length;
				System.out.println("total numbers of files are="+count);
			}
			
		}
		else
		{	
			System.out.println("file not found");
		}
	}
}

*/

/*

import java.io.*;
class FilePrograms
{
	public static void main(String args[])
	{
		File f1=new File("abc");
		
		int count1=0,count2=0;
		
		
		if(f1.exists())
		{
			
			String s[]=f1.list();
			
			for(String p:s)
			{
				File f=new File(f1,p);   // create a file object to represent name of the
										//file or directory present in specified directory 
										
										
				if(f.isFile())
				{
					if(p.endsWith(".txt"))
					{
						f.delete();
						count1++;
					}
					else if(p.endsWith(".png"))
					{
						f.delete();
						count2++;
						
					}
						
				}
				
			}
			
		}
		else
		{
			
			System.out.println("this is not a directory");
		}
	}
}


*/


/* write a programme to accept two file name from cmd
copy only those lines which contains the word computer  */

/*

import java.io.*;
class FilePrograms
{
	public static void main(String args[])
	{
		File f1=new File(args[0]);
		
		if(f1.exists())
		{
			try
			{
				BufferedReader br=new BufferedReader(new FileReader(args[0]));
				BufferedWriter bw=new BufferedWriter(new FileWriter(args[1]));
				
				String s;
				
				while((s=br.readLine())!=null)
				{
					int flag=0;
					String w[]=s.split(" ");
					
					for(String p:w)
					{
						if(p.equals("computer"))
						{
							flag=1;
							break;
						}
					}
					if(flag==1)
					{
						bw.write(s);
					}
				}
				br.close(); 
				bw.close();//if you dont close data will not write in file
				
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
	}
}


*/


//read data from a file convert into a reverse case and write in another file


/*
import java.io.*;
class FilePrograms
{
	public static void main(String[] args)
	{
		File f1=new File("sample.txt");
		if(f1.exists())
		{
		
			try
			{
				FileInputStream fin=new FileInputStream("sample.txt");
				FileOutputStream fout=new FileOutputStream("temp.txt");
				
				int c;
				while((c=fin.read())!=-1)
				{
					
					if(c>='A' && c<='Z')
					{
						fout.write((char)c+32);
					}
					else if(c>='a' && c<='z')
					{
						fout.write((char)c-32);
					}
					else
					{	
						fout.write((char)c);
					}
				}
				
				
				fin.close();
				fout.close();
	
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("file not found");
		}
	}
}

*/

//read data from a file and display in reverse order

/*

import java.io.*;
class FilePrograms
{
	public static void main(String[] args)
	{
		File f1=new File(args[0]);
		if(f1.exists())
		{
		
			try
			{
				FileReader fr=new FileReader(args[0]);
				
				
				int len=(int)f1.length();
				char[] ch=new char[len];
				
				fr.read(ch);
				
				
				String s=new String(ch);
				StringBuffer sb=new StringBuffer(s);
				
				String rev=sb.reverse().toString();
				
				System.out.println("reverse string is"+rev);
				
				fr.close();
	
	
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
		else
		{	
			System.out.println("file not found");
		}
	}
}


*/

//read data from a file reverse line by line and write into the file.

/*
import java.io.*;
class FilePrograms
{
	public static void main(String[] args)
	{
		File f1=new File("sample.txt");
		if(f1.exists())
		{
		
			try
			{
				BufferedReader fr=new BufferedReader(new FileReader("sample.txt"));
				BufferedWriter fw=new BufferedWriter(new FileWriter("temp.txt"));
				
				String s;
				while((s=fr.readLine())!=null)
				{
						StringBuffer sb=new StringBuffer(s);
						String s1=sb.reverse().toString();
						fw.write(s1);
				}
				fr.close();
				fw.close();
	
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
		else
		{	
			System.out.println("file not found");
		}
	}
}


*/

/*  count no of word and no of lines from a file.
(use FileReader class)

import java.io.*;
class FilePrograms
{
	public static void main(String[] args)
	{
		File f1=new File("sample.txt");
		if(f1.exists())
		{
		
			try
			{
				FileReader fr=new FileReader("sample.txt");
				FileWriter fw=new FileWriter("temp.txt");
				
				int c,w=0,l=0;
				
				while((c=fr.read())!=-1)
				{
					if(c==32 )
					{
						w++;
					}
					else if(c==10)
					{
						l++;
						w++;
					}
				}
				
				System.out.println("no of word is"+(w+1));
				System.out.println("no of lines is"+(l+1));
				
				
				fr.close();
				fw.close();
	
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
		else
		{	
			System.out.println("file not found");
		}
	}
}

*/
