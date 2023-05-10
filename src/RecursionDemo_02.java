
public class RecursionDemo_02 {
	public static void main(String[] args) {
		rec(1);
	}
	
	public static void rec(int sum) {
		if(sum==5) {
			return ;
		}
		rec(sum + 1);
		System.out.println(sum);
	}
}
