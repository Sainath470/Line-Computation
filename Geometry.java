import java.util.Scanner;
public class Geometry {
	 public static void main(String args[])
	 {
		 	Scanner sc=new Scanner(System.in);
		 	System.out.println("Enter the x1-coordinate");
		 	int x1=sc.nextInt();

		 	System.out.println("Enter the y1-coordinate");
		 	int y1=sc.nextInt();

		 	System.out.println("Enter the x2-coordinate");
		 	int x2=sc.nextInt();

		 	System.out.println("Enter the y2-coordinate");
		 	int y2=sc.nextInt();

			System.out.println("Enter the p1 coordinate");
		 	int p1=sc.nextInt();

		 	System.out.println("Enter the q1-coordinate");
		 	int q1=sc.nextInt();

		 	System.out.println("Enter the p2-coordinate");
		 	int p2=sc.nextInt();

		 	System.out.println("Enter the q2-coordinate");
		 	int q2=sc.nextInt();

		 	System.out.print( "("+x1+","+y1+")" );
		 	System.out.print( "("+x2+","+y2+")" );


		 	System.out.print( "("+p1+","+q1+")" );
		 	System.out.print( "("+p2+","+q2+")" );



				int Len1=(int)Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
				int Len2=(int)Math.sqrt(Math.pow((p2-p1),2)+Math.pow((q2-q1),2));

			System.out.println("Length of the line1 is="+Len1);
			System.out.println("Length of the line2 is="+Len2);

			Integer L1= Integer.valueOf(Len1);
			Integer L2= Integer.valueOf(Len2);
			System.out.println(L1.equals(L2));
	}
}
