//Retrieving data. Wait a few seconds and try to cut or copy again.
//this catch block can handle any type of exception

public class MultipleExceptionInSingleCatch {

    public static void main(String[] args) {
        try
        {
//            int a=10;
//            int b=0;
//
//            int c=a/b;
//            System.out.println(c);

            String s1=null;
            s1.length();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
