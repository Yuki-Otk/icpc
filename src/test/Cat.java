package test;

import java.util.Scanner;

public class Cat {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        String CAT = "cat";
        int[] catCount = new int[CAT.length()];
        int max = -1;
        for (int i = 0; i < catCount.length; i++) {
            catCount[i] = 0;
        }
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < CAT.length(); j++) {
                if (CAT.charAt(j) == input.charAt(i)) {
                    catCount[j]++;
                    if (catCount[j] > max) {
                        max = catCount[j];
                    }
                    break;
                }
            }
        }
        int count = 0;
        while (true) {
            boolean flag = false;
            for (int i = 0; i < catCount.length; i++) {
                if (catCount[i] - 1 < 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                for (int i = 0; i < catCount.length; i++) {
                    catCount[i]--;
                }
                count++;
            } else {
                break;
            }
        }
        max = max - count;
        System.out.println(count);
        for (int i = 0; i < catCount.length; i++) {
            System.out.println(max - catCount[i]);
        }
    }
}
