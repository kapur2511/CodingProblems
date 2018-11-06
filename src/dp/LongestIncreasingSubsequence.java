public class LongestIncreasingSubsequence{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for(int i = 0; i < testCases; i++){
            int size = scanner.nextInt();
            int arr[] = new int[size];
            for(int j = 0; j<size; j++){
                arr[j] = scanner.nextInt();
            }
            System.out.println(String.valueOf(lis(arr)));
        }
    }


    static int lis(int arr[]){
        int arrLis[] = new int[arr.length];
        for(int i = 0; i < arrLis.length; i++)
            arrLis[i] = 1;
        int lis = 1;
        for(int i = 1; i<arr.length; i++){
            int element = arr[i];
            for(int j = 0; j<i; j++){
                int jEle = arr[j];
                if(element > jEle && arrLis[i] < arrLis[j] + 1){
                    arrLis[i] = arrLis[j] + 1;
                }
            }
        }

        for(int i=0; i<arrLis.length; i++)
            lis = arrLis[i] > lis? arrLis[i]:lis;
        return lis;
    }
}
