import java.util.Scanner;
import java.util.Arrays;
public class DPL_1_D {
	//static int n,k,u[],min[count],max;
    static int dp[]=new int[100000];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data[]=new int[100000];
		int num;
        num=sc.nextInt();
        for(int i=0;i<num;i++){
            data[i]=sc.nextInt();
            int j=i;
            dp[i]=1;
            while(true){
                // boolean flag=false;
                if(j==0){
                    // dp[i]=1;
                    break;
                }
                if(data[i]>data[j-1]){
                    if(dp[i]<dp[j-1]+1){
                        dp[i]=dp[j-1]+1;
                    }
                    // if(max==dp[j-1]){
                    //     dp[i]=max+1;
                    //     max=dp[i];
                    //     break;
                    //     // flag=true;
                    // }
                    // dp[i]=dp[j-1]+1;
                }
                j--;
                // if(flag){
                //     break;
                // }
            }
        }
        int max=dp[0];
        for(int i=1;i<num;i++){
            if(max<dp[i]){
                max=dp[i];
            }
        }
        //      System.out.print(dp[i]+" ");
        //     // System.out.println(data[i]);
        // }

        // for(int i=0;i<num;i++){
        //      System.out.print(dp[i]+" ");
        // }
        System.out.println(max);
    }
}