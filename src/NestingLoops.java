public class NestingLoops
{
	public static void main( String[] args )
	{
		// this is #1 - I'll call it "CN"
		for ( int n=1; n <= 3; n++ )
		{
			for ( char c='A'; c <= 'E'; c++ )
			{
				System.out.println( n + " " + c );
			}
		}

		System.out.println("\n");

		// this is #2 - I'll call it "AB"
		for ( int a=1; a <= 3; a++ )
		{
			for ( int b=1; b <= 3; b++ )
			{
				System.out.print( a + "-" + b + " " );
			}
			System.out.println();
		}

		System.out.println("\n");

	}
}

// 1) n changes faster.
// 2) now c changes faster.
// 3) it prints each one on a new line instead of all in one line.
// 4) it prints to a new line after every third output.