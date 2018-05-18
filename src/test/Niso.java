import java.util.Scanner;

public class Niso {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        for(int i=0;i<m;i++){
            if(((i+n)/n)%2==1){
                System.out.print("R");
            }
            else {
                System.out.print("W");
            }
        }
        System.out.println("");
    }
}
