import java.util.Scanner;
import java.util.Arrays;

class ConverterRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Converter!");
        System.out.println("--------------------------------");
        System.out.print("Enter the base of your number (1-64): ");

        // check for valid base choice
        int base = 0;
        Scanner s = new Scanner(System.in);
        while (base < 1 || base > 64)
        {
            // get user input (base)
            String choice = s.nextLine();

            // check if the choice is all integers
            try {
                base = Integer.parseInt(choice);
            }
            catch (NumberFormatException ex) {
                System.out.println("The base you entered is not an integer.");
            }

            // prompt user if the base choice is invalid
            if (base < 1 || base > 64)
            {
                System.out.print(choice + " is an invalid base. Please choose another base (1-64): ");
            }
        }

        // check for valid digits based on base
        String allDigits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz+/";
        String validDigits = allDigits.substring(0,base);
        boolean allDigitsAreValid = false;
        //int n = 0;
        String number = "";
        while (!allDigitsAreValid)
        {
            allDigitsAreValid = true;
            System.out.print("Enter your number: ");
            number = s.nextLine();

            for (int i = 0; i < number.length(); i++)
            {
                // get the digit (substring)
                String numberBeingChecked = number.substring(i,i+1);
                // check if that digit is somewhere in the validDigits string
                // if the digit is not in the validDigits string:
                if (validDigits.indexOf(numberBeingChecked) == -1)
                {
                    allDigitsAreValid = false;
                }
                // if the 1st digit is in the validDigits string, do nothing and go to the 2nd digit
            }

            if (!allDigitsAreValid)
            {
                // if not all digits are valid, ask the user to re-enter the number
                System.out.println("The number you entered has invalid characters in it. Valid characters:");
                System.out.println(validDigits);
            }
            else
            {
                // if all digits are valid, report to user
                System.out.println("The number you entered is valid.");
            }
        }

        // create instance of NumberConverter class
        NumberConverter nc = new NumberConverter(number, base);

        // convert the number to decimal before converting to any other base
        int numberInDecimal = nc.convertToDecimal();

        System.out.print("To which base do you want to convert? (1-64): ");

        // check for valid base choice
        int targetBase = 0;
        while (targetBase < 1 || targetBase > 64)
        {
            // get user input (base)
            String targetBaseString = s.nextLine();

            // check if the choice is all integers
            try {
                targetBase = Integer.parseInt(targetBaseString);
            }
            catch (NumberFormatException ex) {
                System.out.println("The base you entered is not an integer.");
            }

            // prompt user if the base choice is invalid
            if (targetBase < 1 || targetBase > 64)
            {
                System.out.print(targetBaseString + " is an invalid base. Please choose another base (1-64): ");
            }
        }
        // display and convert number in decimal to the target base
        System.out.println("Number in Base " + targetBase + ": " + nc.convertFromDecimal(numberInDecimal,targetBase));
        s.close();
    }

    public void getBase()
    {

    }
}

