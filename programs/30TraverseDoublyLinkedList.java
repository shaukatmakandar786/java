package data_structure;
class Node1
{
    int data;
    Node1 next;
    Node1 prev;

    Node1(int data)
    {
        this.data=data;
        next=prev=null;
    }
}
class LinkedList
{
    Node1 root;
    int size;

    public void display(int n)
    {
        Node1 t=root;

        for(int i=1;i<=n;i++)
        {
            System.out.println(t.data);
            t=t.next;
        }
    }

}

public class TraverseDoublyLinkedList {
    public static void main(String[] args) {

        Node1 temp;
        LinkedList list=new LinkedList();
        list.root=new Node1(10);
        list.size++;

        temp=new Node1(20);
        list.root.next=temp;
        temp.prev=list.root;
        list.size++;

        temp=new Node1(30);
        list.root.next.next=temp;
        temp.prev=list.root.next;
        list.size++;

        temp=new Node1(40);
        list.root.next.next.next=temp;
        temp.prev=list.root.next.next;
        list.size++;

        list.display(2);
    }
}
