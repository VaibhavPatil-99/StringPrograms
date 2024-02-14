package string;

public class SortAlphabetically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "welcome to java";
		String[] sa = s1.split(" ");
		
		for(int i=0;i<sa.length;i++) {
			for(int j=0;j<sa.length;j++) {
				if(sa[i].compareTo(sa[j])<0) {
					String temp = sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
			
		}
		String s = "";
		for(int i=0;i<sa.length;i++) {
			s= s+sa[i]+ " ";
			
		}
		System.out.println(s);
	}

}
