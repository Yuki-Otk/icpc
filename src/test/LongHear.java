import java.util.Scanner;

class LongHear {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int yes = 0, no = 0;
        for (int i = 0; i < 5; i++) {
            String input = scan.next();
            if (input.equals("yes")) {
                yes++;
            } else {
                no++;
            }
        }
        if (yes < no) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}