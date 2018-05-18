import java.util.Scanner;

class Mizugi {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long num=scan.nextLong();
        System.out.println(doFactorial(num));
    }
    private static long doFactorial(long num){
        long sum=1;
        for(int i=2;i<=num;i++){
            sum=sum*i;
            sum=doDeleat0(sum);
            sum=doSubString(sum,9);
        }
        return  sum;

    }
    private  static long doSubString(long num,int a){
        String temp= String.valueOf(num);
        if(temp.length()<a){
            return num;
        }
        return Long.parseLong(temp.substring(temp.length()-a,temp.length()));
    }
    private static long doDeleat0(long num){
        while (true){
            if(num%10==0){
                num=num/10;
            }
            else {
                break;
            }
        }
        return num;
    }
}