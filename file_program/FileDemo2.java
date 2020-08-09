/* copy one file data into another file.
 (using FileReader & File OutputWriter)*/


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


