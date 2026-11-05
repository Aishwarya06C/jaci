package s;
import java.util.*;
public class Subtractapp {
static int sub(int x,int y){
	return x-y;
}
public static void main(String arr[]) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	int res=sub(x,y);
	System.out.print(res);
	
}
}
