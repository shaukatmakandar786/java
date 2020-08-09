/* copy one file data into another file.
 (using FileInputStream &File OutputStream)*/


import java.io.*;
class FileDemo1
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

/*

/* copy one file data into another file.
 (using FileReader & File OutputWriter)


import java.io.*;
class FileDemo2
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



/*


/* copy one file data into another file.
 (using BufferedReader & File BufferedWriter)


import java.io.*;
class FileDemo3
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


// append one file data into another file


import java.io.*;
class FileDemo2
{
	public static void main(String[] args)
	{
		File f1=new File("sample.txt");
		if(f1.exists())
		{
		
			try
			{
				FileReader fr=new FileReader("sample.txt");
				FileWriter fw=new FileWriter("temp.txt",true);
				
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










/* copy one file data into another file.
 (using FileInputStream &File OutputStream)


import java.io.*;
class FileDemo6
{
	public static void main(String[] args)
	{
		File f1=new File("abc");
		if(f1.exists())
		{
			if(f1.isFile())
			{
				System.out.println("File Name="+f1.getName());
				System.out.println("Path ="+f1.getPath());
				System.out.println("File size="+f1.length()+"bytes");
				System.out.println("parent ="+f1.getParent());
				System.out.println(f1.canRead()?"file is readable":"file is not readable");
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













