package Lesson01;

public class Application {
	
	public static void main(String[] args) {
		// Завдання 1
				byte a = 36;
				short b = 75;
				int c = 63;
				long d = 89;
				

				// Завдання 2

				System.out.println("Byte =" + Byte.MAX_VALUE);
				System.out.println("Byte = " + Byte.MIN_VALUE);
				System.out.println("Short = " + Short.MAX_VALUE);
				System.out.println("Short = " + Short.MIN_VALUE);
				System.out.println("Integer = " + Integer.MAX_VALUE);
				System.out.println("Integer = " + Integer.MIN_VALUE);
				System.out.println("Long = " + Long.MAX_VALUE);
				System.out.println("Long = " + Long.MIN_VALUE);
				System.out.println("float = " + Float.MIN_VALUE);
				System.out.println("float = " + Float.MAX_VALUE);
				System.out.println("char = " + Character.MAX_VALUE);

		        //Завдання 3

				int array[] = { 15, 35, 48, 69, 92, 31, 5, 56, 87, 91 };
				int max = array[0];
				int min = array[0];

				for (int m = 0; m < array.length; m++) {
					if (max < array[m])
						max = array[m];
					if (min > array[m])
						min = array[m];
				}

				System.out.println();
				System.out.println("max is " + max);
				System.out.println("min is " + min);

			}

	

	}


