/* copy one file data into another file.
 (using FileInputStream &File OutputStream)*/


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
