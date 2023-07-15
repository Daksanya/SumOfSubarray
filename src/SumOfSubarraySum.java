import java.util.Scanner;

public class SumOfSubarraySum {
    public static int sumSubArray(int[] array,int n)
    {
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    sum+=array[k];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(sumSubArray(array,n));
    }
}