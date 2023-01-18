import java.util.Scanner;
class triangle
{
	public static String check(int a,int b,int c)
	{
		if(a>0&&b>0&&c>0&&a+b+c==180)
		{
			return "tria";
            }
		else
		{
			return "not";
		}
	}
			

	public static void main(String[] args)
		{
			Scanner inp = new Scanner(System.in);
			int a= inp.nextInt();
			int b=inp.nextInt();
			int c=inp.nextInt();
			System.out.println((check(a,b,c)));
		}
}
			
			
			