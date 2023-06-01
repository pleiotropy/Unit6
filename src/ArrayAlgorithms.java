import java.util.Locale;

public class ArrayAlgorithms {
    /** Prints each String in wordList, on its own line, followed by “!”.
     *  Does NOT mutate (modify) wordList.
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings; does not get modified
     */
    public static void printExclamation(String[] wordList)
    {
        for (int i = 0; i < wordList.length; i++)
        {
            System.out.println(wordList[i] + "!");
        }
    }

    /** Adds a “!” to the end of each String in wordList (does not print).
     *  DOES mutate (modify) original wordList.
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings, modified by method
     */
    public static void addExclamation(String[] wordList)
    {
        for (int i = 0; i < wordList.length; i++)
        {
            wordList[i] = wordList[i] + "!";
        }
    }

    /** Returns the sum of all values in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find sum
     *  @return  the sum of all numbers in the list
     */
    public static int sum(int[] numList)
    {
        int sum = 0;
        for (int i = 0; i < numList.length; i++)
        {
            sum += numList[i];
        }
        return sum;
    }

    /** Returns the average of all values in numList, as a double.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find average
     *  @return  the average of all numbers in the list
     *
     *  Use your sum method for this! (don’t rewrite that logic!)
     */
    public static double average(int[] numList)
    {
        return (double) sum(numList) / numList.length;
    }

    /** Returns the value in numList that represents the minimum value in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find minimum
     *  @return  the minimum value in the array
     */
    public static int minimum(int[] numList)
    {
        int min = numList[0];
        for (int i = 1; i < numList.length; i++)
        {
            if (numList[i] < min)
            {
                min = numList[i];
            }
        }
        return min;
    }

    /** Returns the value in numList that represents the maximum value in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find maximum
     *  @return  the maximum value in the array
     */
    public static int maximum(int[] numList)
    {
        int max = numList[0];
        for (int i = 1; i < numList.length; i++)
        {
            if (numList[i] > max)
            {
                max = numList[i];
            }
        }
        return max;
    }

    /** Multiplies each number in numList by multiplier.
     *  DOES mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of integers, modified by method
     *  @param multiplier  number to multiply each element in numList
     */
    public static void multiplyBy(int[] numList, int multiplier)
    {
        for (int i = 0; i < numList.length; i++)
        {
            numList[i] *= multiplier;
        }
    }

    /** Returns a NEW array containing the squares of the elements in the original
     *  numList array, in the same position.
     *  Does NOT mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of integers to be squared
     *  @return  new array containing squares of the values in numList
     */
    public static int[] squares(int[] numList)
    {
        int[] squaredValues = new int[numList.length];
        for (int i = 0; i < numList.length; i++)
        {
            squaredValues[i] = numList[i] * numList[i];
        }
        return squaredValues;
    }

    /** Switches each boolean value in boolList to its opposite value; true values
     *  becomes false, and false values become true.
     *  DOES mutate (modify) original boolList.
     *  PRECONDITION: boolList.length > 0
     *
     *  @param boolList  original array of booleans, modified by method
     */
    public static void flipBool(boolean[] boolList)
    {
        for (int i = 0; i < boolList.length; i++)
        {
            boolList[i] = !boolList[i];
        }
    }

    /** Returns a String representing the array of ints as a printable String,
     *  including open and closing brackets, with values separated by commas.
     *  This method should function identically to Arrays.toString()!

     *  Does NOT mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of ints to be represented in String form
     */
    public static String customToString(int[] numList)
    {
        String str = "[";
        for (int i = 0; i < numList.length; i++)
        {
            if (i < numList.length - 1) // every element before the last
            {
                str += numList[i] + ", ";
            }
            else // final element
            {
                str += numList[i] + "]";
            }
        }
        return str;
    }

    // U6L5 Enhanced For Loops / For Each Loops

    /** Returns the length of the longest String(s) in an array of Strings.
     *  Does NOT mutate (modify) stringList.
     *  PRECONDITION: stringList.length > 0
     *
     *  @param stringList  original array of Strings; does not get modified
     *  @return  length of the longest String in the array
     */
    public static int longestString(String[] stringList)
    {
        int longestStringLength = 0;
        for (String stringInArray : stringList )
        {
            if (stringInArray.length() > longestStringLength)
            {
                longestStringLength = stringInArray.length();
            }
        }
        return longestStringLength;
    }

    /** Changes all words in an array of words to uppercase.
     *  DOES mutate (modify) original wordList.
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings, modified by method
     */
    public static void makeUppercase(String[] wordList)
    {
        for (int i = 0; i < wordList.length; i++)
        {
            wordList[i] = wordList[i].toUpperCase();
        }
    }

    /** Returns true if ANY of the ints in numList are positive, otherwise,
     *  returns false.
     *
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of ints; does not get modified
     *  @return  true if any element of numList is positive, false otherwise
     */
    public static boolean containsPositive(int[] numList)
    {
        for (int num : numList)
        {
            if (num > 0)
            {
                return true;
            }
        }
        return false;
    }

    /** Returns true if ANY of the Strings in stringList contain searchStr,
     *  otherwise, returns false. Your method should NOT be case sensitive, e.g.
     *  searching for "ma" should be found in the String "Maddox" and searching
     *  for "MA" should be found in String "mad"
     *
     *  Does NOT mutate (modify) stringList.
     *  PRECONDITION: stringList.length > 0
     *
     *  @param stringList  original array of Strings; does not get modified
     *  @param searchStr  the String to search each element of stringList
     *  @return  true if any element of stringList contains searchStr, otherwise
     *           returns false
     */
    public static boolean containsString(String[] stringList, String searchStr)
    {
        for (String str : stringList)
        {
            if (str.toLowerCase().indexOf(searchStr.toLowerCase()) != -1)
            {
                return true;
            }
        }
        return false;
    }

    /** Returns a NEW array of Strings that contains all words from the original
     *  array of strings in lowercase.
     *
     *  Does NOT mutate (modify) original wordList
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings, not modified by method
     *  @return  new array of Strings in all lowercase
     */

    public static String[] makeLowercase(String[] wordList)
    {
        String[] lowercaseWordList = new String[wordList.length];
        int i = 0;
        for (String originalWord : wordList)
        {
            lowercaseWordList[i] = originalWord.toLowerCase();
            i++;
        }
        return lowercaseWordList;
    }

    /** Returns a NEW array of ints that contains the higher value of each pair
     *  of elements at the same index in two other equally-sized arrays of ints
     *  For example, if intArr1 = {2, 5, 6, 1, 0} and intArr2 = {1, 7, 6, -2, 8},
     *  this method returns the array {2, 7, 6, 1, 8}, where each value is the
     *  higher of the two at that respective index in the two original arrays
     *
     *  Does NOT mutate (modify) EITHER array
     *  PRECONDITION: intArr1.length == intArr2.length
     *
     *  @param intArr1  first array of ints
     *  @param intArr2  second array of ints, having the same length as intArr1
     *  @return  new array of ints representing the higher values
     */

    public static int[] arrayMaximums(int[] intArr1, int[] intArr2)
    {
        int[] maxValues = new int[intArr1.length];
        int i = 0;
        for (int int1 : intArr1)
        {
            if (int1 >= intArr2[i])
            {
                maxValues[i] = int1;
            }
            else
            {
                maxValues[i] = intArr2[i];
            }
            i++;
        }
        return maxValues;
    }

    /** Returns the number of Strings in stringList that have an exclamation point
     *  ("!") at the end.
     *
     *  Does NOT mutate (modify) stringList.
     *  PRECONDITION: stringList.length > 0
     *
     *  @param stringList  original array of Strings; does not get modified
     *  @return  number of Strings in stringList that end in "!"
     */
    public static int endsInExclamations(String[] stringList)
    {
        int exclamationCount = 0;
        for (String str : stringList)
        {
            if (str.indexOf("!") == str.length()-1)
            {
                exclamationCount++;
            }
        }
        return exclamationCount;
    }

    /** Returns the number of elements in the numList array that have the same
     *  value as the element immediately adjacent to the right in the array.
     *  (BE CAREFUL not to go out of bounds!)
     *  For example, given the array {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6}
     *  this method would return 5, since there are five numbers in the array that
     *  are equal to the number immediately to the right (shown below in blue):
     *                    {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6}
     *
     *  Does NOT mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of numbers; does not get modified
     *  @return  number of elements in numList that are equal to the element
     *           adjacent to the right of the element in the array
     */
    public static int countConsecutiveDoubles(int[] numList)
    {
        int count = 0;
        for (int i = 0; i < numList.length-1; i++)
        {
            if (numList[i] == numList[i+1])
            {
                count++;
            }
        }
        return count;
    }

    /** Returns a NEW array that contains all elements of the original numList,
     *  shifted to the left by one index; the first element of the array should
     *  wrap around and appear at the end.
     *  For example, given the array {5, 1, 3, 4, 7}, this method returns the
     *  array {1, 3, 4, 7, 5}
     *
     *  Does NOT mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of numbers; does not get modified
     *  @return  array with elements in numList shifted by one index left
     */
    public static int[] shiftLeft(int[] numList)
    {
        int[] leftShiftedNumList = new int[numList.length];
        for (int i = 0; i < numList.length - 1; i++)
        {
            leftShiftedNumList[i] = numList[i+1];
        }
        leftShiftedNumList[numList.length-1] = numList[0];
        return leftShiftedNumList;
    }

    /** Shifts all elements in the array to the left one index (just like in
     * the previous method), except you are modifying the ORIGINAL array
     * (numList) and returning nothing (void).
     *
     * @param numList
     */
    public static void shiftLeftModify(int[] numList)
    {
        int[] shiftedList = shiftLeft(numList);
        for (int i = 0; i < numList.length; i++)
        {
            numList[i] = shiftedList[i];
        }
    }

    /** Shifts all elements in numList to the LEFT shiftNum places;
     *  this method modifies the original array and does not
     *  return anything (void).
     *
     *  The first shiftNum elements of the array should wrap around
     *  to the back of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6} and shiftNum = 2, this method MODIFIES
     *  the array to {3, 4, 7, 6, 5, 1} (all elements shifted left
     *  two with the first two elements wrapping around to the back)
     *  And given the array {5, 1, 3, 4, 7, 6} and shiftNum = 4,
     *  this method modifies the array to {7, 6, 5, 1, 3, 4}
     *
     *  Assume shiftNum <= numList.length (precondition)
     *
     *  DOES mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *  PRECONDITION: shiftNum <= numList.length
     *
     *  @param numList  original array of numbers; DOES get modified
     */
    public static void shiftNumLeftModify2(int[] numList, int shiftNum)
    {
        for (int i = 0; i < shiftNum; i++)
        {
            shiftLeftModify(numList);
        }
    }

    public static void shiftNumLeftModify(int[] numList, int shiftNum)
    {
        int[] newArray = new int[numList.length];
        // from original indices 0 - 7 (i = 0; i < shiftNum; i++)
        // --> new indices 4 - 11 (j = length-shiftNum; j < length; j++)
        int j = newArray.length - shiftNum;
        for (int i = 0; i < shiftNum; i++)
        {
            if (j < numList.length)
            {
                newArray[j] = numList[i];
                j++;
            }
        }
        // from original indices 8 - 11 (i = shiftNum; i < length; i++)
        // --> new indices 0 - 4 (j = 0; j < length-shiftNum+1; j++)
        j = 0;
        for (int i = shiftNum; i < numList.length; i++)
        {
            if (j < numList.length - shiftNum + 1)
            {
                newArray[j] = numList[i];
                j++;
            }
        }


        // set each element in the original numList to the corresponding element in the new array
        for (int i = 0; i < numList.length; i++)
        {
            numList[i] = newArray[i];
        }
    }

    /** Shifts all elements in numList to the RIGHT shiftNum places;
     *  this method modifies the original array and does not
     *  return anything (void).
     *
     *  The last shiftNum elements of the array should wrap around
     *  to the front of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6} and shiftNum = 2, this method MODIFIES
     *  the array to {7, 6, 5, 1, 3, 4} (all elements shifted right
     *  two with the last two elements wrapping around to the front)
     *  And given the array {5, 1, 3, 4, 7, 6} and shiftNum = 4,
     *  this method modifies the array to {3, 4, 7, 6, 5, 1}
     *
     *  Assume shiftNum <= numList.length (precondition)
     *
     *  DOES mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *  PRECONDITION: shiftNum <= numList.length
     *
     *  @param numList  original array of numbers; DOES get modified
     */
    public static void shiftNumRightModify(int[] numList, int shiftNum)
    {
        int rightShiftNum = numList.length - shiftNum;
        shiftNumLeftModify(numList, rightShiftNum);
    }

    /** Returns a NEW array of ints that contains all elements of numList in
     *  reversed order.  For example, given the array {5, 1, 3, 4, 7, 6}, this
     *  method returns the array {6, 7, 4, 3, 1, 5}.
     *  Should work with all array lengths (both odd and even).
     *
     *  Does NOT mutate (modify) original wordList
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of numbers; does NOT get modified
     *  @return  array of ints that contains numList in reversed order
     */
    public static int[] reverse(int[] numList)
    {
        // make new array with same length as original numList
        int[] reversedNumList = new int[numList.length];

        int j = 0; // counter variable for the numList index

        for (int i = numList.length - 1; i >= 0; i--)
        {
            reversedNumList[i] = numList[j];
            j++;
        }
        return reversedNumList;
    }

    /** Reverses all elements in an array; this method modifies
     *  the original array and does not return anything (void).
     *  For example, given the array {5, 1, 3, 4, 7, 6}, this method
     *  MODIFIES the array to {6, 7, 4, 3, 1, 5}.
     *  Should work with all array lengths (both odd and even).
     *
     *  DOES mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of numbers; DOES get modified
     */
    public static void reverseModify1(int[] numList)
    {
        int[] newArray = reverse(numList);
        for (int i = 0; i < numList.length; i++)
        {
            numList[i] = newArray[i];
        }
    }

    public static void reverseModify2(int[] numList)
    {
        for (int i = 0; i < numList.length / 2; i++)
        {
            int old = numList[i];
            numList[i] = numList[numList.length-1-i];
            numList[numList.length-1-i] = old;
        }
    }

    // Coding Bat
    public int[] fizzArray3(int start, int end)
    {
        int diff = end - start;
        int[] fizz = new int[diff];
        for (int i = start; i < end; i++)
        {
            fizz[i-start] = i;
        }
        return fizz;
    }

    public boolean isEverywhere(int[] nums, int val)
    {
        int i = 0;
        while (i < nums.length - 1)
        {
            int leftNum = nums[i];
            int rightNum = nums[i+1];
            if (leftNum != val && rightNum != val)
            {
                return false;
            }
            i++;
        }
        return true;
    }

    public int centeredAverage(int[] nums)
    {
        // add up all of the numbers
        int total = 0;
        int max = nums[0]; // set initial value of maximum
        int min = nums[0]; // set initial value of minimum
        for (int num : nums)
        {
            total += num;
            if (num > max) // find the max value
            {
                max = num;
            }
            if (num < min) // find the min value
            {
                min = num;
            }
        }

        // subtract the max and min values from the total
        total = total - max - min;

        // divide by length - 2
        int centeredAverage = total / (nums.length - 2);
        return centeredAverage;
    }

}

