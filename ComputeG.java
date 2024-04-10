
public class ComputeG {
	
		  public static void main(String[] args) {
		    for (int i = 1; i <= 100; i++) {
		      System.out.printf("%7d", getPentagonalNumber(i));
		    	System.out.printf("%7d ", getPentagonalNumber(i));
		      if (i % 10 == 0) {
		        System.out.println();
		      }
		    }
		  }

		  public static int getPentagonalNumber(int n) {
		    return (n * (3 * n - 1)) / 2;
		  }
		}



//Replace this line:
//System.out.printf("%7d", getPentagonalNumber(i));
//With this line:
 // Add a space after %7d
