/* copy one file data into another file.
 (using BufferedReader & File BufferedWriter)*/


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


