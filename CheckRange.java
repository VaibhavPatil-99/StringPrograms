package string_Variation;

public class CheckRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5};
		int a=2;
		int b=5;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<2 || arr[i]>b)
			{
				System.out.println("false");
				break;
			}
			else
			{
				System.out.println("true");
				break;
			}
		}
	}

}
