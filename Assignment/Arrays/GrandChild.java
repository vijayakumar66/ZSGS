package ArraysProgram;
import java.util.Scanner;
public class GrandChild {
	public static void main(String[] args) {
		String[][] arrayofstr= {{"luke","shaw"},
							{"wayne", "rooney"}, 
							{"rooney", "ronaldo"}, 
							{"shaw", "rooney"}};
		int count=0;
		Scanner object=new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String target=object.next();
		int length=arrayofstr.length;
		for(int i=0;i<length;i++)
		{
			if(arrayofstr[i][1].equalsIgnoreCase(target))
			{
				String child=arrayofstr[i][0];
				for(int j=0;j<length;j++)
				{
					if(arrayofstr[j][1].equalsIgnoreCase(child))
					{
						count++;
					}
				}
			}
		}
		System.out.println(count);
		
	}

}
