import java.util.Scanner;
import java.util.*;
public class M1155 {
	//static int n,k,u[],min[count],max;
	static String data;
	static int max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        data=sc.next();
        for(int i=0;i<data.length();i++){
            if(data.charAt(i)=='('){
                i=judge(i);
                System.out.println(i);
            }
        }
	}
	static int judge(int n) {
		for(int i=n;i<data.length();i++){
            if(data.charAt(i)==')'){
                return i;
            }
        }
        return -1;

	}
}
