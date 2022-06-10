import java.util.*;


/**
 * Class containing methods to create a 5 digit pin using integers 0-9, randomly assigns an integer between 1-3 to
 * each value in 0-9, converts user input pin to the corresponding value using the newly assigned 1-3 integers for each
 * digit, presents the user with the 0-9 array and its corresponding 1-3 value arrays, asks user to input pin using the
 * corresponding to 1-3 digits for the pin, lastly authenticates user pin.
 */
public class PinAuthentication
{
   private static final int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
   private static int[] randomizedValues = new int[10];
   private static int[] pin = new int[5];
   private static int[] privateKey = new int[5];
   private static int[] encryptedInput = new int[5];


   /**
    *
    */
   public PinAuthentication() {}


   /**
    * Method that creates an array and randomly assigns an integer from 1 to 3 to each digit (0-9)
    * No parameters
    */
   public static void randomizeValues()
   {
      for(int i = 0; i < values.length; i++)
      {
         randomizedValues[i] = (int)Math.ceil(3*Math.random());
      }
   }


   /**
    * Method prompts user to input 5 digit pin. Validates pin is 5 digits and is only numeric characters. (Greater than
    * or less than 5 characters is invalid. Any non-numeric character input is invalid)
    */
   public static void userPin()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Input 5 digit pin:");
      String tempPin = keyboard.nextLine();
      if(tempPin.length() == 5)
      {
         for(int i = 0; i < tempPin.length(); i++)
         {
            char c = tempPin.charAt(i);
            if(Character.isDigit(c))
            {
               pin[i] = Character.getNumericValue(c);
            }
            else
            {
               System.out.println("Not a valid input");
               return;
            }
         }
      }
      else
      {
         System.out.println("Input is not 5 digits");
         return;
      }
   }


   /**
    * Method prompts user to input 5 digit pin. Validates pin is 5 digits and is only numeric characters. (Greater than
    * or less than 5 characters is invalid. Any non-numeric character input is invalid)
    *
    */
   public static void userLogin()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Input encrypted 5 digit pin:");
      String tempPin = keyboard.nextLine();
      if(tempPin.length() == 5)
      {
         for(int i = 0; i < encryptedInput.length; i++)
         {
            char c = tempPin.charAt(i);
            if(Character.isDigit(c))
            {
               encryptedInput[i] = Character.getNumericValue(c);
            }
            else
            {
               System.out.println("Not a valid input!");
               return;
            }
         }
      }
   }


   /**
    * method that returns True if the user inputs the correct pin using the 1-3 values assigned to each digit. False if
    * the user inputs the incorrect pin using the 1-3 values assigned to each digit.
    * @return
    */
   public static boolean authenticate()
   {
      for(int i = 0; i < privateKey.length; i++)
      {
         privateKey[i] = randomizedValues[pin[i]];
      }
      for(int i = 0; i < encryptedInput.length; i++)
      {
         if(encryptedInput[i] != privateKey[i])
         {
            System.out.println("Incorrect password!");
            return false;
         }
      }
      System.out.println("Success!");
      return true;
   }


   /**
    *
    * @param args
    * Main function to test PinAuthentication class and its contents.
    */
   public static void main(String[] args)
   {
      userPin();
      randomizeValues();
      System.out.println("Use numbers below your pin numbers: " + Arrays.toString(values));
      System.out.println("Input the corresponding digits      " + Arrays.toString(randomizedValues));
      userLogin();
      authenticate();
   }
}