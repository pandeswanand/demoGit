import java.util.*;
public class Difference {

	public int calculateDifference(int n) {
		
		int dif = 0, sum = 0, i, sum_sq, sq_sum = 0, sq;
		for(i=1; i<=n;i++) {
			sum = sum + i;
			sq = i*i;
			sq_sum = sq_sum + sq;
		}
		sum_sq = sum*sum;
		
		dif = sq_sum - sum_sq;
		int add = sq_sum + sum_sq;
		System.out.println("The sum of sum of squares and square of sum is "+add);
		
		return dif;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		Difference diff = new Difference();
		int dif = diff.calculateDifference(number);
		System.out.println("Difference between sum of squares and square of sum is "+dif);
	}

}
