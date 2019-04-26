public class CountLeaves{


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

    int countLeaves(Node node) {
        // Your code
        int leaves = 0;
        if(node.left == null && node.right == null)
            leaves++;
        else {
            if(node.left!=null){
                leaves += countLeaves(node.left);
            }

            if(node.right!=null){
                leaves += countLeaves(node.right);
            }
        }
        return leaves;
    }
}
