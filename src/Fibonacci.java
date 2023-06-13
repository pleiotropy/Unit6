public class Fibonacci
{
    // instance variable
    private int[] sequence;

    /** Constructor: sets sequence instance variable to an array containing the
     first sequenceLen numbers in a Fibonacci sequence (a Fibonacci sequence is formed
     by summing the previous two numbers to generate the next number,
     e.g. 0, 1, 1, 2, 3, 5, 8, 13, 21...)

     PRECONDITION: sequenceLen >= 2
     */
    public Fibonacci(int sequenceLen)
    {
        sequence = new int[sequenceLen];
        sequence[0] = 0;
        sequence[1] = 1;
        for (int i = 2; i < sequenceLen; i++)
        {
            sequence[i] = sequence[i-1] + sequence[i-2];
        }
    }


    /** Getter method: returns a reference to the sequence array

     @return  reference to sequence instance variable
     */
    public int[] getSequence()
    {
        return sequence;
    }

    /** Returns the index in the array where a particular value, searchVal, is
     located in sequence; if not found, returns -1.  If searchVal == 1, return
     first index where 1 is found (since this value appears twice in Fibonacci
     sequences longer than 2 numbers)

     @param searchVal  the number to search for in sequence
     @return  the index where searchVal is located in sequence, -1 if not found
     */
    public int getIndexOf(int searchVal)
    {
        for (int i = 0; i < sequence.length; i++)
        {
            if (sequence[i] == searchVal)
            {
                return i;
            }
        }
        return -1;
    }


    /** Creates a temp array that contains the original sequence array with
     howManyMore numbers Fibonacci values added on to the end,
     then assigns sequence to that new array.

     For example, if sequence == {0, 1, 1, 2, 3, 5} and this method is called
     with howManyMore == 3, sequence would be assigned to a new array with
     the next 2 Fibonacci numbers: {0, 1, 1, 2, 3, 5, 8, 13, 21}
     */
    public void extendBy(int howManyMore)
    {
        // calculate the length of the temp array
        int newLength = sequence.length + howManyMore;

        // make the temp array with the above length
        int[] tempArray = new int[newLength];

        // assign original sequence array elements to the temp array
        for (int i = 0; i < sequence.length; i++)
        {
            tempArray[i] = sequence[i];
        }

        // add additional elements (howManyMore) to temp array
        for (int i = sequence.length; i < newLength; i++)
        {
            tempArray[i] = tempArray[i-1] + tempArray[i-2];
        }

        // change sequence to a new array with the new length
        sequence = new int[newLength];

        // copy values from temp array to sequence
        for (int i = 0; i < newLength; i++)
        {
            sequence[i] = tempArray[i];
        }

        // das solution - why does this work? i feel like i've done
        // something like this before but it doesn't work??
        // sequence = tempArray;

    }
}