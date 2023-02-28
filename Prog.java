import java.lang.Integer;

public class Prog {

	public static void main(String [] args) {
		
		if (args.length != 2) {
			System.out.println("Please execute: java Prog <n> <p>");
			System.out.println("n is the input size, and p is the program number.");
			System.exit(0);
		}

		int n = Integer.parseInt(args[0]);
		int p = Integer.parseInt(args[1]);

		switch(p) {
			case 1: prog1(n);
							break;
			case 2: prog2(n);
							break;
			case 3: prog3(n);
							break;
			case 4: prog4(n);
							break;
			default: System.out.println("Invalid program number. Only 1-4.");
		}
	}

	private static void prog1(int n) {
		// TODO: Code to generate n keys that all get hashed to the same index using hash1.	
		for (int i = 0; i < n*n; i += n) {
			System.out.println(i);
		}
	}

	private static void prog2(int n) {
		// TODO: Code to generate n keys that all get hashed to the same index using hash2.
		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}
	}

	private static void prog3(int n) {
		// TODO: Code to generate n keys that all get hashed to the same index using hash3.
		HashFunctions hashFunctions = new HashFunctions(n);
		HashTable2 table = new HashTable2(n);
		int[] counts = new int[n];
		int val = 0;
		
		for (int i = 0; i < n*n; i++)
		{
			table.insert(i);
			counts[hashFunctions.hash3(i)]++;
			
			if (counts[hashFunctions.hash3(i)] == n)
			{
				val = hashFunctions.hash3(i);
				i = n*n;	
			}
		}
		table.print(val);	
	}

	private static void prog4(int n) {
		// TODO: Code to generate n keys that all get hashed to the same index using hash4.
		HashFunctions hashFunctions = new HashFunctions(n);
		HashTable table = new HashTable(n);
		int[] counts = new int[n];
		int val = 0;
		
		for (int i = 0; i < n*n; i++)
		{
			table.insert(i);
			counts[hashFunctions.hash4(i)]++;
			
			if (counts[hashFunctions.hash4(i)] == n)
			{
				val = hashFunctions.hash4(i);
				i = n*n;
			}
		}
		table.print(val);
	}	
}
