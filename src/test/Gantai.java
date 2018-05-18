import java.util.Scanner;

public class Gantai {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] data = new int[num];
        for (int i = 0; i < num; i++) {
            data[i] = 0;
        }
        for (int i = 0; i < 2; i++) {
            int count = scan.nextInt();
            for (int j = 0; j < count; j++) {
                int temp = scan.nextInt();
                if (i == 0) {
                    data[temp - 1]++;
                } else {
                    data[temp - 1]--;
                }
            }
        }
        boolean flag = false;
        for (int i = 0; i < num; i++) {
            if (data[i] == -1) {
                if (flag) {
                    System.out.print(" ");
                }
                System.out.print(i + 1);
                flag = true;
            }

        }
        if (!flag) {
            System.out.print("None");
        }
        System.out.println("");
    }
}
