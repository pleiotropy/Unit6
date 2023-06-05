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

}

