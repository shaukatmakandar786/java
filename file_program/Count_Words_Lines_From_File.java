//  count no of word and no of lines from a file.
//(use FileReader class)


import java.io.*;
class Count_Words_Lines_From_File
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
