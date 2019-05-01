public class Preorder {

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

    void preorder(Node node)
    {
       // Your code goes here
       System.out.print(String.valueOf(node.data)+" ");
        if(node.left == null && node.right == null)
            return;
        if(node.left!=null)
            preorder(node.left);
        if(node.right!=null)
            preorder(node.right);
    }
}
