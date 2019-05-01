public class Inorder {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for(int i = 0; i < testCases; i++){
           
        }
    }

    class Node
    {
        int data;
        Node left, right;

        public Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    void inOrder(Node node)
    {
       // Your code goes here
       if(node.left!=null)
            inOrder(node.left);
        System.out.print(String.valueOf(node.data)+" ");
        if(node.right!=null)
            inOrder(node.right);
    }
}
