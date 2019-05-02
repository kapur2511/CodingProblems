
public class Kadane{


   public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for(int i=0;i<testCases;i++){
            int arr[] = {-2,3,2,-1,2};
            System.out.print(kadane(arr)+" ");
        }
    }

    static int kadane(int []arr){
        int maxSum= arr[0], currentMax = arr[0];
        for(int i=1; i<arr.length; i++){
            currentMax = max(arr[i],currentMax+arr[i]);
            if(currentMax>maxSum)
                maxSum = currentMax;
        }
        return maxSum;
    }

    static int max(int i1, int i2){
        return i1>i2? i1 : i2;
    }
}
