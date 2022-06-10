//Java program to find the largest element in a Binary Tree

class Node{

    int data;
    Node left,right;

    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class BinaryTree {

    Node root;
    public static int findMax(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        else
        {
               int leftMax,rightMax;
               int max= node.data;

               if(node.left!=null)
               {
                   leftMax=findMax(node.left);
                   max=(max>leftMax)?max:leftMax;
               }
               if(node.right!=null)
               {
                   rightMax=findMax(node.right);
                   max=(max>rightMax)?max:rightMax;
               }
               return max;
        }

    }

    public static int findMin(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        else
        {
            int leftMin,rightMin;
            int min= node.data;

            if(node.left!=null)
            {
                leftMin=findMin(node.left);
                min=(min<leftMin)?min:leftMin;
            }
            if(node.right!=null)
            {
                rightMin=findMin(node.right);
                min=(min<rightMin)?min:rightMin;
            }
            return min;
        }

    }


    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();
        tree.root=new Node(10);
        tree.root.left=new Node(1);
        tree.root.right=new Node(50);
        tree.root.left.left=new Node(8);
        tree.root.right.left=new Node(30);
        tree.root.right.right=new Node(54);
        tree.root.left.right=new Node(2);
        tree.root.right.left.left=new Node(27);

        System.out.println("Maximum elements is "+findMax(tree.root));
        System.out.println("Minimum elements is "+findMin(tree.root));
    }
}
