import java.util.Scanner;
import java.util.Arrays;

class ConverterRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Converter!");
        System.out.println("--------------------------------");
        System.out.print("Enter the base of your number (2, 8 or 10): ");

        // check for valid base choice
        int base = 0;
        Scanner s = new Scanner(System.in);
        while (base != 2 && base != 8 && base != 10)
        {
            // get user input (base)
            String choice = s.nextLine();
            base = Integer.parseInt(choice);

            // prompt user if the base choice is invalid
            System.out.println("You chose base " + base);
            if (base != 2 && base != 8 && base != 10)
            {
                System.out.println(base + " is an invalid base. Please choose another base. (2, 8, or 10)");
            }
        }

        // check for valid digits based on base
        String allDigits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz+/";
        String validDigits = allDigits.substring(0,base);
        System.out.println("validDigits is: " + validDigits);
        boolean allDigitsAreValid = false;
        int n = 0;

        while (!allDigitsAreValid)
        {
            allDigitsAreValid = true;
            System.out.print("Enter your number: ");
            String number = s.nextLine();

            for (int i = 0; i < number.length(); i++)
            {
                // get the digit (substring)
                String numberBeingChecked = number.substring(i,i+1);
                // check if that digit is somewhere in the validDigits string
                // if the digit is not in the validDigits string:
                if (validDigits.indexOf(numberBeingChecked) == -1)
                {
                    // set allDigitsAreValid = false; ask the user to re-enter the number
                    allDigitsAreValid = false;
                }
                // if the 1st digit is in the validDigits string, do nothing and go to the 2nd digit
            }

            if (!allDigitsAreValid)
            {
                System.out.println("The number you entered has invalid characters in it. Valid characters:");
                System.out.println(validDigits);
            }
            else
            {
                System.out.println("The number you entered is valid.");
                n = Integer.parseInt(number);
            }
        }

        s.close();

        NumberConverter nc = new NumberConverter(n, base);
        int[] digits = nc.getDigits();
        System.out.println("\n\nDigit array: " + Arrays.toString(digits));
        System.out.println("Number: " + nc.displayOriginalNumber());
    }

    public void getBase()
    {

    }
}

