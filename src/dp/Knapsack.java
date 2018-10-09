import java.util.*;
import java.lang.*;
import java.io.*;

public class Knapsack {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for(int i=0;i<testCases;i++){
            int elements = scanner.nextInt();
            int maxWeight = scanner.nextInt();
            int arrW[] = new int[elements];
            int arrV[] = new int[elements];

            for(int j=0;j<elements;j++){
                arrV[j] = scanner.nextInt();
            }

            for(int j=0;j<elements;j++){
                arrW[j] = scanner.nextInt();
            }

            System.out.println(""+knapsack(arrW,arrV,maxWeight));
        }
    }

    static int knapsack(int []wt, int []val, int weight){
        int [][]arr = new int[weight+1][wt.length+2];

        for(int i=0; i<weight+1; i++){
            arr[i][0] = i;
            arr[i][1] = 0;
        }



        for(int j=0; j<wt.length; j++){
            int elementWeight = wt[j];
            int elementValue  = val[j];

            for(int i=0; i<weight+1; i++){
                int maxWeight = arr[i][0];
                if(elementWeight<=maxWeight){
                    int remainingWeight = maxWeight-elementWeight;
                    int totalValue = elementValue+arr[remainingWeight][j+1];
                    arr[i][j+2] = max(arr[i][j+1], totalValue);
                }else{
                    arr[i][j+2] = arr[i][j+1];
                }
            }
        }

        return arr[weight][wt.length+1];
    }

    static int max(int i1, int i2){
        return i1>i2? i1 : i2;
    }

}
