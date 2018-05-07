import java.util.Scanner;

class A009 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        String[] strings = new String[h];
        for (int i = 0; i < h; i++) {
            strings[i] = scan.next();
        }
        int count = 0, i = 0, j = 0;
        int flag = 0;
        while (true) {
            if (i < 0 || j < 0 || i >= h || j >= w) {
                break;
            }
            if (strings[i].charAt(j) == '/') {
                flag = 3-flag;
            }
            if (strings[i].charAt(j) == '\\') {
                if(flag==0 || flag==2){
                    flag++;
                }
                else {
                    flag--;
                }
            }
            if (flag == 0) {
                j++;
            } else if (flag == 1) {
                i++;
            } else if (flag == 2) {
                j--;
            } else {
                i--;
            }
            count++;
        }
        System.out.println(count);
    }
}