//Pattern project
public class Pattern {
        public static void main (String[] args)
        {
        	int i,j, rows =4;
        	for(i =1; i<=rows; i++)
        		
        	{
//        		Print first half of the row
        		for(j = 1; j<=i; j++)
        		{
        			System.out.print(j+" ");
        		}
        		
//        		print second half of the row
        		for (j =i-1; j>=1; j--)
        		{
        			System.out.print(j+" ");
        		}
        		System.out.println();              //ln is for new line
        	}
        }
}
