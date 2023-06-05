import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        String[] words1 = {"te", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};
        printWordsEndingWithIng(words1);
    }

    /** Write a code segment that uses an enhanced for loop to print all elements of words
     * that end with "ing".
     */

    public static void printWordsEndingWithIng(String[] words)
    {
        for (String str:words)
        {
            if (str.substring(str.length() - 3).equals("ing"))
            {
                System.out.println(str);
            }
        }
//        for (String word : words)
//        {
//            String ing = "ing";
//            if (word.length() >= 3)
//            {
//                if (word.indexOf(ing) == word.length()-3)
//                {
//                    System.out.println(word);
//                }
//            }
//        }
    }



    /** Computes employee wages as described in part (b) and stores them in wages.
     * The parameter fixedWage represents the fixed amount each employee is paid per day.
     * The parameter perItemWage represents the amount each employee is paid per item sold.
     */
    public void computeWages(double fixedWage, double perItemWage)
    {
        for (int emp = 0; emp < itemsSold.length; emp++)
        {
            // start with the fixed wage
            double employeeComputedWage = fixedWage;

            // add the per item wage
            employeeComputedWage += perItemWage * itemsSold[emp];

            // if necessary, add bonus
            if (itemsSold[emp] > computeBonusThreshold())
            {
                employeeComputedWage *= 1.1;
            }

            // store in [wages]
            wages[emp] = employeeComputedWage;
        }
    }





}

