import java.util.Scanner;
import java.util.Arrays;
public class M1188 {
    // static int dp[][]=new int[2000][2000];
    static int data[]=new int[10000];
    static int temp[]=new int[10000];
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            String str=sc.next();
            boolean open=false,close=false;
            int count=1,x=0;
            for(int j=0;j<str.length();j++){
                String mozi=str.charAt(j)+"";
                if(mozi.equals("[")){
                    close=false;
                    if(open){
                        x++;
                        count=1;
                    }
                    open=true;
                    String hoge=null;
                    int k=0;
                    while(true){
                        try{
                            String a=str.charAt(j+1+k)+"";
                        }
                        catch(Exception e){
                            break;
                        }
                        k++;
                        hoge=hoge+a;
                    }
                    j=j+k;
                    int hogehoge=Integer.parseInt(hoge);
                    if(hogehoge%2==1){
                        temp[count]=hogehoge/2+1;
                    }                    
                    else{
                        temp[count]=hogehoge/2;
                    }
                }
                else if(mozi.equals("]")){
                    open=false;
                    if(close){
                        for()
                    }
                    close=false;
                }
            }
        }
    }
    // public int judge(int num,)
}