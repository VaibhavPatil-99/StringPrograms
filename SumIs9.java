package string_Variation;

public class SumIs9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s =9;
		int d=2;
		int start =(int)(Math.pow(10, d-1));
		int end =(int)(Math.pow(10, d));
		
		
		for(int i=start;i<end;i++) {
			int result = SumOfDigits(i);
			
			if(result==s)
			{
				System.out.println(i);
				break;
			}
		}
	}

	private static int SumOfDigits(int i) {
		
		int sum=0;
		while(i>0)
		{
			int rem=i%10;
			sum = sum+rem;
			i=i/10;
		}
		return sum;
		
	}

}
