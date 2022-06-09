import java.util.Scanner;

class MyNode
{
    private int data;
    private MyNode next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
class LinkedList{

    MyNode head;
    int size;

    public LinkedList()
    {
        head=null;
        size=0;
    }
    public LinkedList(MyNode head, int size) {
        this.head = head;
        this.size = size;
    }

    public void createList(int data)
    {
        MyNode temp,r;
        if(head==null)
        {

            head=new MyNode();
            head.setData(data);
            head.setNext(null);
        }
        else {

            temp=new MyNode();
            temp.setData(data);
            temp.setNext(null);

            r=head;
            while(r.getNext()!=null)
            {
                r=r.getNext();
            }
            r.setNext(temp);
        }
    }

    public void addFirst(int data)
    {
        if(head==null)
        {
            head=new MyNode();
            head.setData(data);
            head.setNext(null);
        }
        else {
            MyNode t=new MyNode();
            t.setData(data);
            t.setNext(head);
            head=t;

        }
    }
    public void addLastNode(int data)
    {
        MyNode temp,r;
        if(head==null)
        {
            head=new MyNode();
            head.setData(data);
            head.setNext(null);
        }
        else {
            temp=new MyNode();
            temp.setData(data);
            temp.setNext(null);

            r=head;
            while(r.getNext()!=null)
            {
                r=r.getNext();
            }
            r.setNext(temp);
        }
    }
    public int deleteFirstNode(){

        int c;
        if(head==null)
        {
            System.out.println("LinkedList is empty");
            return 0;
        }
        else {
            c=head.getData();
            head=head.getNext();
            return c;
        }
    }
    public int deleteLastNode()
    {
        int c;
        if(head==null)
        {
            System.out.println("LinkedList is empty");
            return 0;
        }
        else if(head.getNext()==null) {
            c=head.getData();
            head=null;
            return c;
        }
        else {
            MyNode r=null,t=null;
            t=head;
            while (t.getNext()!=null)
            {
                r=t;
                t=t.getNext();
            }
            r.setNext(null);
            return t.getData();
        }
    }
    public void display()
    {
        MyNode r;

        r=head;
        while(r!=null)
        {
            System.out.println(r.getData());
            r=r.getNext();
        }
    }

}
public class Main {

    public static void main(String[] args) {

        LinkedList l1=new LinkedList();
        Scanner sc=new Scanner(System.in);
        int no;
        while(true)
        {
            System.out.println("case 1: Create List" );
            System.out.println("case 2: Add first node");
            System.out.println("case 3: Add last node");
            System.out.println("case 4: delete first node");
            System.out.println("case 5: delete last node");
            System.out.println("case 6: Display List");
            System.out.println("case 7: exit");

            System.out.println("enter your choice");
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("enter a no");
                    no=sc.nextInt();
                    l1.createList(no);
                    break ;

                case 2:
                    System.out.println("enter a no");
                    no=sc.nextInt();
                    l1.addFirst(no);
                    break;

                case 3:
                    System.out.println("enter a no");
                    no=sc.nextInt();
                    l1.addLastNode(no);
                    break;

                case 4:
                    no= l1.deleteFirstNode();
                    System.out.println("you deleted"+no);
                    break;

                case 5:
                    no= l1.deleteLastNode();
                    System.out.println("you deleted"+no);
                    break;

                case 6:
                     l1.display();
                     break;
                case 7:
                    System.exit(0);

                default:
                    System.out.println("please enter valid choice");
            }
        }

    }
}
