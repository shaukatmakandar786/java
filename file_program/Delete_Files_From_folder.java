import java.io.*;
class Delete_Files_From_folder
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
