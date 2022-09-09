package ArraysProgram;

public class CrossPattern {

	public static void main(String[] args) {
		String string="PROGRAMMING";
		int length=string.length()-1;
		for(int i=0;i<string.length();i++)
		{
			for(int j=0;j<string.length();j++)
			{
				if(i==j||j==length-i)
				{
					System.out.print(string.charAt(j));
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
