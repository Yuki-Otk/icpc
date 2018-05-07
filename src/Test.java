import java.util.ArrayList;
import java.util.Scanner;

class Test{
	public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(0,2);
        list.add(3);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}