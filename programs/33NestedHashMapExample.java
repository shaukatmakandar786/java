import java.util.HashMap;
import java.util.Scanner;

public class Demo{

    public static void main(String[] args) {
//
//        HashMap<String,Integer> sub1=new HashMap<String,Integer>();
//        sub1.put("Hindi",45);
//        sub1.put("Marathi",67);
//        sub1.put("English",78);
//
//        HashMap<String,Integer> sub2=new HashMap<String,Integer>();
//        sub2.put("Hindi",56);
//        sub2.put("Marathi",76);
//        sub2.put("English",47);
//
//        HashMap<String,Integer> sub3=new HashMap<String,Integer>();
//        sub3.put("Hindi",44);
//        sub3.put("Marathi",36);
//        sub3.put("English",45);
//
//        HashMap<String,Object> semester=new HashMap<String,Object>();
//        semester.put("sem1",sub1);
//        semester.put("sem2",sub2);
//        semester.put("sem3",sub3);
//
//        HashMap<String,Object> student_Result=new HashMap<String,Object>();
//        student_Result.put("shaukat",semester);
//
//        System.out.println(student_Result.get("shaukat"));

        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many Students details you want to enter");
        int no=sc.nextInt();

        HashMap<String,Object> student=new HashMap<String,Object>();
        for(int i=1;i<=no;i++)
        {
            HashMap<String,Object> semester=new HashMap<String,Object>();
            System.out.println("how many semesters you have");
            int sem= sc.nextInt();

            for(int j=1;j<=sem;j++)
            {
                HashMap<String,Integer> sub1=new HashMap<String,Integer>();
                System.out.println("how many subject you have");
                int len= sc.nextInt();
                for(int k=1;k<=len;k++)
                {
                    System.out.println("enter your subject and marks for semester"+i);
                    System.out.println("enter subject name");
                    String s=sc.next();
                    System.out.println("enter marks");
                    Integer i1=Integer.valueOf(sc.nextInt());
                    sub1.put(s,i1);
                }
                semester.put("sem"+1,sub1);
            }
            System.out.println("enter the student name who got these marks");
            String s1=sc.next();
            student.put(s1,semester);
        }


        System.out.println(student.get("shaukat"));
    }
}

// enter how many Students details you want to enter
// 1
// how many semesters you have
// 1
// how many subject you have
// 2
// enter your subject and marks for semester1
// enter subject name
// hindi
// enter marks
// 67
// enter your subject and marks for semester1
// enter subject name
// marathi
// enter marks
// 78
// enter the student name who got these marks
// shaukat
// {sem1={marathi=78, hindi=67}}
