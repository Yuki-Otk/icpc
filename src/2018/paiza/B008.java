import java.util.Scanner;

class B008 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=0;j<m;j++){
                temp=scan.nextInt()+temp;
            }
            if(temp>0){
                count=count+temp;
            }
        }
        System.out.println(count);
    }
}