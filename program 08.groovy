// Java implementation of the above approach

class GFG
{

	static void check(char ch)
	{
	
		if (ch >= 'A' && ch <= 'Z')
			System.out.println("\n" + ch +
					" is an UpperCase character");
	
		else if (ch >= 'a' && ch <= 'z')
			System.out.println("\n" + ch +
					" is an LowerCase character" );
	
		else
			System.out.println("\n" + ch +
					" is not an aplhabetic character" );
	}

	// Driver Code
	public static void main(String []args)
	{
		char ch;
	
		// Get the character
		ch = 'A';
	
		// Check the character
		check(ch);
	
		// Get the character
		ch = 'a';
	
		// Check the character
		check(ch);
	
		// Get the character
		ch = '0';
	
		// Check the character
		check(ch);
	
	}
}

// This code is contributed by Ryuga
