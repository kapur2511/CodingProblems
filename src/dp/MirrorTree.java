public class MirrorTree{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for(int i = 0; i < testCases; i++){
        
        }
    }
    
    //A Binary Tree node
    class Node {
        int data;
        Node left, right;
        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    void mirror(Node node) {
        // Your code here
        if(node.left == null && node.right == null){
            System.out.print(String.valueOf(node.data)+" ");
        } else{
            Node temp  = node.left;
            node.left  = node.right;
            node.right = temp;
            if(node.left!=null)
                mirror(node.left);
            System.out.print(String.valueOf(node.data)+" ");
            if(node.right!=null)
                mirror(node.right);
        }
    }
}
