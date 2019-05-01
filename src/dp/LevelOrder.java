public class LevelOrder {

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

    void levelOrder(Node node) {
        // Your code here
        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(node);
        while(!nodes.isEmpty()){
            System.out.println(String.valueOf(nodes.get(0).data));
            if(nodes.get(0).left!=null)
                nodes.add(nodes.get(0).left);
            if(nodes.get(0).right!=null)
                nodes.add(nodes.get(0).right);
            nodes.remove(0);
        }
    }
}
