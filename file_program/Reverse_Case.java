//read data from a file convert into a reverse case and write in another file.



import java.io.*;
class Reverse_case
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

