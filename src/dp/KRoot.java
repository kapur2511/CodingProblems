public class KRoot{


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

    void printKdistance(Node node, int k) {
        // Your code here
        if(k == 0){
            System.out.print(String.valueOf(node.data)+" ");
        }else{

            if(node.left!=null){
                printKdistance(node.left, k-1);
            }

            if(node.right!=null){
                printKdistance(node.right, k-1);
            }
        }
    }
}
