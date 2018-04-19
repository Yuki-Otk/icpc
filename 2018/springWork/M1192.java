import java.util.Scanner;
class M1192{
	public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        while(true){
            int x=scan.nextInt();
            int y=scan.nextInt();
            int s=scan.nextInt();
            if(x==0 && y==0 && s==0){
                break;
            }
            int[] data={x+100,y+100,s};
            System.out.println(doMoney(data));
        }
    }
    private static int doMoney(int[] data){
        int max=-1;
        for(int i=0;i<=data[2]/2;i++){
            int j=data[2]-i;
            double[] old=new double[2];
            old[0]=Math.ceil((double)(i*100)/data[0]);
            old[1]=Math.ceil((double)(j*100)/data[0]);
            int temp=(int)(old[0]*data[1]/100)+(int)(old[1]*data[1]/100);
            System.out.println("i="+i+"j="+j+":"+old[0]+":"+old[1]+":"+temp+":"+max);
            if(max<temp){
                max=temp;
            }
        }
        return max;
    }
}