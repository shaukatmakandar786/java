/* write a programe which enter n integers from the users
and write only the even numbers into the file*/

import java.util.*;
import java.io.*;
class FileDemo5
{
	public static void main(String[] args)
	{
		

			try
			{
				FileOutputStream fin=new FileOutputStream("temp.txt");
				DataOutputStream dos=new DataOutputStream(fin);
				
				FileInputStream fout=new FileInputStream("temp.txt");
				DataInputStream dis=new DataInputStream(fout);
				int n,num;
				System.out.println("how many numbers you want to enter");
				Scanner sc=new Scanner(System.in);
				n=sc.nextInt();
				for(int i=1;i<=n;i++)
				{
					num=sc.nextInt();
					if(num%2==0)
					{
						dos.writeInt(num);
					}
					
				}
				for(int i=1;i<=n;i++)
				{
					int no= dis.readInt();
					System.out.println(no);
				}
				
				dos.close();
				
	
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		
		
	}
}


