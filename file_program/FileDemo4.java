/* w a p which accept two file names from cmd 
copy only those line which contain the word computer
*/


import java.io.*;
class FileDemo4
{
	public static void main(String[] args)
	{
		File f1=new File(args[0]);
		if(f1.exists())
		{
		
			try
			{
				BufferedReader fr=new BufferedReader(new FileReader(args[0]));
				FileWriter fw=new FileWriter(args[1]);
				
				String s;
				while((s=fr.readLine())!=null)
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
							fw.write(s);
						}
						
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


