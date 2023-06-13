//public class ArrayFRQPractice {
//    // Set 1, Question 1
//
//    /** Returns the sum of all integers in arr that are divisible by num
//     * Precondition: num > 0
//     */
//    public static int divBySum(int[] arr, int num)
//    {
//        int sum = 0;
//        for (int number : arr)
//        {
//            if (number % num == 0)
//            {
//                sum += number;
//            }
//        }
//        return sum;
//    }
//
//
//// Set 1, Question 2a
//
//    /** Counts how many strings in wordArray are not found in theVocab, as described in
//     * part (a).
//     */
//    public int countNotInVocab(String[] wordArray)
//    {
////    return notInVocab(wordArray).length;
//        int count = 0;
//        for (String word : wordArray)
//        {
//            if (!findWord(word))
//            {
//                count++;
//            }
//        }
//        return count;
//    }
//
//// Set 1, Question 2b
//
//    /** Returns an array containing strings from wordArray not found in theVocab,
//     * as described in part (b).
//     */
//    public String[] notInVocab(String[] wordArray)
//    {
//        int count = countNotInVocab(wordArray);
//        String[] wordsNotInVocab = new String[count];
//        int i = 0;
//        for (String word : wordArray)
//        {
//            if (!findWord(word))
//            {
//                wordsNotInVocab[i] = word;
//                i++;
//            }
//        }
//        return wordsNotInVocab;
//    }
//
//
//// Set 2, Question 1
//
//    /** Write a code segment that uses an enhanced for loop to print all elements of words
//     * that end with "ing".
//     */
//
//    public void printWordsEndingWithIng(String[] words)
//    {
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
//    }
//
//
//// Set 2, Question 2a
//
//    /** Returns the bonus threshold as described in part (a).
//     */
//    public double computeBonusThreshold()
//    {
//        // compute the sum of all items sold by all employees
//        int sum = 0;
//        for (int i : itemsSold)
//        {
//            sum += i;
//        }
//
//        // find the max and min
//        int max = itemsSold[0]; // set initial value for max
//        int min = itemsSold[0]; // set initial value for min
//        for (int i : itemsSold)
//        {
//            if (i > max)
//            {
//                max = i;
//            }
//            if (i < min)
//            {
//                min = i;
//            }
//        }
//
//        // subtract them from the total and divide by the array.length-2
//        return double bonusThreshold = ((double) sum - max - min) / (itemsSold.length - 2)
//    }
//
//// Set 2, Question 2b
//
//    /** Computes employee wages as described in part (b) and stores them in wages.
//     * The parameter fixedWage represents the fixed amount each employee is paid per day.
//     * The parameter perItemWage represents the amount each employee is paid per item sold.
//     */
//    public void computeWages(double fixedWage, double perItemWage)
//    {
//        for (int emp = 0; emp < itemsSold.length; emp++)
//        {
//            // start with the fixed wage
//            double employeeComputedWage = fixedWage;
//
//            // add the per item wage
//            employeeComputedWage += perItemWage * itemsSold[emp];
//
//            // if necessary, add bonus
//            if (itemsSold[emp] > computeBonusThreshold())
//            {
//                employeeComputedWage *= 1.1;
//            }
//
//            // store in [wages]
//            wages[emp] = employeeComputedWage;
//        }
//    }
//}
