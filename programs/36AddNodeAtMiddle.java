//Java Program to insert a new node at the middle of the singly linked list

package com.shaukat;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
    }
}

class SingleLinkedList
{
    Node head;
    int size;


    public void insertAtPossition(int no,int length)
    {
        if(length>size || length<1 )
        {
            System.out.println("out of range");
        }
        else {

            Node temp,r;
            r=head;
            temp=new Node(no);

            for(int i=1;i<length;i++)
            {
                r=r.next;
            }
            temp.next=r.next;
            r.next=temp;
            size++;
        }
    }
    public void display()
    {
        Node t=head;
        for(int i=1;i<size;i++)
        {
            System.out.println(t.data);
            t=t.next;
        }
    }
}
public class AddNodeAtMiddle {

    public static void main(String[] args) {

       SingleLinkedList l1=new SingleLinkedList();
       l1.head=new Node(10);
       l1.head.next=null;
       l1.size++;

       Node temp=new Node(20);
       temp.next=null;
       l1.head.next=temp;
       l1.size++;

        Node temp1=new Node(30);
        temp1.next=null;
        l1.head.next.next=temp1;
        l1.size++;

        Node temp2=new Node(40);
        temp2.next=null;
        l1.head.next.next.next=temp2;
        l1.size++;

        Node temp3=new Node(50);
        temp3.next=null;
        l1.head.next.next.next.next=temp3;
        l1.size++;

        l1.display();
        System.out.println();
        l1.insertAtPossition(60,1);
        System.out.println();

        l1.display();
    }
}
