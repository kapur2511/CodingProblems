public class Postorder {

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

    void postOrder(Node node)
    {
       // Your code goes here
       if(node.left!=null)
            postOrder(node.left);
        if(node.right!=null)
            postOrder(node.right);
        System.out.print(String.valueOf(node.data)+" ");
    }
}
