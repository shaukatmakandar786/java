package data_structure;

class Node2
{
    int data;
    Node2 next;
    Node2 prev;

    Node2(int data)
    {
        this.data=data;
        next=prev=null;
    }
}
class CircularLinkedList
{
    Node2 root;
    int size;

    public void addFirstNode(int data)
    {
        Node2 temp;
        temp=new Node2(data);
        temp.next=root;
        temp.prev=root.prev;
        root.prev=temp;
        temp.prev.next=temp;
        root=temp;
        size++;
    }
    public void display(int n)
    {
        Node2 t=root;

        for(int i=1;i<=n;i++)
        {
            System.out.println(t.data);
            t=t.next;
        }
    }

}


public class AddNewNodeAtBeginning {

    public static void main(String[] args) {
        Node2 temp;
        CircularLinkedList list=new CircularLinkedList();
        list.root=new Node2(10);
        list.root.next=list.root;
        list.root.prev=list.root;
        list.size++;

        temp=new Node2(20);
        list.root.next=temp;
        temp.prev=list.root;
        temp.next=list.root;
        list.root.prev=temp;
        list.size++;

        temp=new Node2(30);
        list.root.next.next=temp;
        temp.prev=list.root.next;
        temp.next=list.root;
        list.root.prev=temp;
        list.size++;

        temp=new Node2(40);
        list.root.next.next.next=temp;
        temp.prev=list.root.next.next;
        temp.next=list.root;
        list.root.prev=temp;
        list.size++;

        list.addFirstNode(50);
        list.addFirstNode(60);
        list.addFirstNode(70);
        list.display(list.size);
    }
}

// 70
// 60
// 50
// 10
// 20
// 30
// 40
