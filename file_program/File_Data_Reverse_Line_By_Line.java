//read data from a file reverse line by line and write into the file.

/*
import java.io.*;
class File_Data_Reverse_Line_By_Line
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
