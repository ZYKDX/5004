import java.util.*;

/**
 *
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
    *
    */
   public static void randomizeValues()
   {
      for(int i = 0; i < values.length; i++)
      {
         randomizedValues[i] = (int)Math.ceil(3*Math.random());
      }
   }


   /**
    *
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
    *
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
            System.out.println("Incorrected password!");
            return false;
         }
      }
      System.out.println("Success!");
      return true;
   }


   /**
    *
    * @param args
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