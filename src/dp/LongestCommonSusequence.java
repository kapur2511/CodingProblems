import java.util.*;
import java.lang.*;
import java.io.*;

public class LongestCommonSubsequence{


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for(int i=0;i<testCases;i++){
            int size1 = scanner.nextInt();
            int size2 = scanner.nextInt();
            String str1 = scanner.next();
            String str2 = scanner.next();
            System.out.println(""+lcs(str1,str2));
        }
    }

    static int lcs(String str1, String str2){

        int arr[][] = new int[str2.length()+1][str1.length()+1];
        //Initializing the first row and column to zero
        for(int i = 0; i<str2.length()+1; i++)
            arr[i][0] = 0;

        for(int i = 0; i<str1.length()+1; i++)
            arr[0][i] = 0;


        for(int i = 1; i<str2.length()+1; i++){
            char element = str2.charAt(i-1);
            for(int j = 1; j<str1.length()+1; j++){
                char innerElement = str1.charAt(j-1);
                if(element == innerElement){
                    arr[i][j] =  arr[i-1][j-1] + 1;
                }else{
                    int value1 = arr[i][j-1];
                    int value2 = arr[i-1][j];
                    arr[i][j] = max(value1,value2);
                }
            }
        }
        return arr[str2.length()][str1.length()];
    }

    static int max(int num1, int num2){
        return num1 > num2 ? num1 : num2;
    }

}



