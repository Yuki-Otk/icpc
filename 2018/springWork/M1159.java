//YukiOtake-2018/03/04
//time:12:11
import java.util.Scanner;
class M1159{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String line=scan.nextLine();
		String[] hoge=line.split(" ");
		int[] data=new int[hoge.length];
		for(int i=0;i<hoge.length;i++){
            data[i]=Integer.parseInt(hoge[i]);
            System.out.println(data[i]);
		}
	}
}
