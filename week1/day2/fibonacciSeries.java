package week1.day2;

public class fibonacciSeries {
	
	public static void main(String[] args) {
		
		int term1,term2,solution;
		term1=0;
		term2=1;
		for(int i=0;i<8;i++) {
		System.out.println(term1);
		solution=term1+term2;
		term1=term2;
		term2=solution;
		

	}
}
}