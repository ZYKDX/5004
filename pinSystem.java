import java.util.*;

public class pinSystem
{
	private static String actualPIN = "00000";
	private static int[] table = new int[10];
	private static String response;

    private static String getUserInput()
    {
    	char[] validCharArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		List<Character> validCharList = new LinkedList<>();
		for(int i = 0; i < 10; i++)
		{
			validCharList.add(validCharArr[i]);
		}
		Scanner keyboard = new Scanner(System.in);
		while(true)
		{
			System.out.println("Please enter your answer:");
			String userInput = keyboard.next();
			if(userInput.length() == 5)
			{
				int result = 1;
				for(int i = 0; i < 5; i++)
				{
					if(validCharList.contains(userInput.charAt(i)))
					{
						result *= 1;
					}
					else
					{
						result *= 0;
					}
				}
				if(result == 1)
				{
					return userInput;
				}
				else
				{
					System.out.println("Invalid PIN, please try again.");
				}
			}
			else
			{
				System.out.println("Invalid PIN, please try again.");
			}
		}

    } 
	/**
	 * Use this method to set or change the actual PIN
	 * The PIN has to be 5 digit long and each digit should be a number char
	 */
	public static void setActualPIN()
	{
		System.out.println("Your PIN should be a 5-digit number (00000 to 99999)");
		actualPIN = getUserInput();
	}

	/**
	 * 
	 * @param resp the response String got from the user
	 */
	public static Boolean PINMatch(String resp)
	{
		String expect = "";
		for(int i = 0; i < 5; i++)
		{
			char pinDigit = actualPIN.charAt(i);
			expect += table[Character.getNumericValue(pinDigit)];
		}
		return expect.equals(resp);
	}	

	public static void getResponse()
	{
		Random rand = new Random();
		int randomNum;

		for(int i = 0; i < 10; i++)
		{
			randomNum = rand.nextInt(3) + 1;
			table[i] = randomNum;
		}
		System.out.println("Please enter 5 digits according to your PIN and the following:");
		System.out.println("0 1 2 3 4 5 6 7 8 9");
		System.out.printf("%d %d %d %d %d %d %d %d %d %d\n", table[0], table[1], table[2], table[3], table[4], table[5], table[6], table[7], table[8], table[9]);
		response = getUserInput();
	}

	private static void showMenu()
	{
		System.out.println("Please enter your choice:");
		System.out.println("P - change your PIN");
		System.out.println("A - authenicate your PIN");
		System.out.println("W - withdraw cash");
		System.out.println("Q - logout");
	}
	public static void main(String[] args)
	{
		System.out.println("Please login first.");
		getResponse();
		while(!PINMatch(response))
		{
			getResponse();
		}
		System.out.println("You have logged in!");
		Scanner keyboard = new Scanner(System.in);
		while(true)
		{
			showMenu();
			String input = keyboard.next();
			if(input.equals("P") || input.equals("p"))
			{
				System.out.println("************************************************");
				setActualPIN();
				System.out.println("************************************************");
			}
			else if(input.equals("A") || input.equals("a"))
			{
				System.out.println("************************************************");
				System.out.println("You are validating your actual PIN:");
				getResponse();
				String expect = "";
				for(int i = 0; i < 5; i++)
				{
					char pinDigit = actualPIN.charAt(i);
					expect += table[Character.getNumericValue(pinDigit)];
				}
				System.out.printf("expected response: %s\n", expect);
				System.out.printf("your response: %s\n", response);
				System.out.printf("Is your input correct? %b\n", PINMatch(response));
				System.out.println("************************************************");
			}
			else if(input.equals("W") || input.equals("w"))
			{
				System.out.println("************************************************");
				System.out.println("Please take your 1000$ cash.");
				System.out.println("************************************************");
			}
			else if(input.equals("Q") || input.equals("q"))
			{
				return;
			}
			else
			{
				System.out.println("************************************************");
				System.out.println("Invalid input, please try again.");
				System.out.println("************************************************");
			}
		}
	}
}
