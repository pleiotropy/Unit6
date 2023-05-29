import java.util.Arrays;

public class ArrayAlgorithmTester
{
    public static void main(String[] args)
    {
//        // TEST longestString
//        String[] strings = {"hello", "hola", "hi", "apple", "why?"};
//        System.out.println(ArrayAlgorithms.longestString(strings));
//
//        // original array NOT modified
//        System.out.println(Arrays.toString(strings));
//
//        System.out.println("----");
//
//        String[] strings2 = {"cut", "boy", "mom", "she"};
//        System.out.println(ArrayAlgorithms.longestString(strings2));
//
//        // original array NOT modified
//        System.out.println(Arrays.toString(strings2));
//
//        System.out.println("----");
//
//        String[] strings3 = {"M", "DA", "B", "FAD"};
//        System.out.println(ArrayAlgorithms.longestString(strings3));
//
//        // original array NOT modified
//        System.out.println(Arrays.toString(strings3));
//
//        // TEST addExclamation
//        String[] words = {"hello", "hola", "hi", "what's up?"};
//        ArrayAlgorithms.makeUppercase(words);
//
//        // original word list IS modified
//        System.out.println(Arrays.toString(words));
//
//        // TEST containsPositive
//        int[] nums = {-6, -4, 0, -3, 1, -2, 5};
//        boolean positive = ArrayAlgorithms.containsPositive(nums);
//        System.out.println(positive);
//
//        // original numbers list NOT modified
//        System.out.println(Arrays.toString(nums));
//
//        System.out.println("----");
//
//        int[] nums2 = {-6, -4, 0, -3, -1, -2, -5};
//        boolean positive2 = ArrayAlgorithms.containsPositive(nums2);
//        System.out.println(positive2);
//
//        // original numbers list NOT modified
//        System.out.println(Arrays.toString(nums2));
//
//        // TEST containsString
//        String[] strings = {"hello", "hole", "Adam", "Apple", "why?"};
//        boolean hasStr = ArrayAlgorithms.containsString(strings, "y");
//        System.out.println(hasStr);
//
//        // original array NOT modified
//        System.out.println(Arrays.toString(strings));
//
//        System.out.println("----");
//
//        boolean hasStr2 = ArrayAlgorithms.containsString(strings, "LE");
//        System.out.println(hasStr2);
//
//        boolean hasStr3 = ArrayAlgorithms.containsString(strings, "ap");
//        System.out.println(hasStr3);
//
//        boolean hasStr4 = ArrayAlgorithms.containsString(strings, "hola");
//        System.out.println(hasStr4);
//
//        // TEST makeLowercase
//        String[] strings = {"HELLO", "Hole", "Adam", "booyAH", "WHY?"};
//        String[] lower = ArrayAlgorithms.makeLowercase(strings);
//        System.out.println(Arrays.toString(lower));
//
//        // original array NOT modified
//        System.out.println(Arrays.toString(strings));
//
//        int[] arr1= {2, 5, 6, 1, 0};
//        int[] arr2 = {1, 7, 6, -2, 8};
//        int[] maximums = ArrayAlgorithms.arrayMaximums(arr1, arr2);
//        System.out.println(Arrays.toString(maximums));
//
//        // original arrays NOT modified
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//
//        // TEST endsInExclamations
//        String[] strings = {"hello!", "!!!whoa", "sad", "Adam!", "What! No way", "Why?!"};
//        int numExclamations = ArrayAlgorithms.endsInExclamations(strings);
//        System.out.println(numExclamations);
//
//        // original array NOT modified
//        System.out.println(Arrays.toString(strings));
//
//        // TEST countConsecutiveDoubles
//        int[] nums = {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6};
//        int numDoubles = ArrayAlgorithms.countConsecutiveDoubles(nums);
//        System.out.println(numDoubles);
//
//        // original array NOT modified
//        System.out.println(Arrays.toString(nums));
//
//        // TEST shiftLeft
//        int[] nums = {5, 1, 3, 4, 7};
//        int[] shiftedLeftArr = ArrayAlgorithms.shiftLeft(nums);
//        System.out.println(Arrays.toString(shiftedLeftArr));
//
//        // original array NOT modified
//        System.out.println(Arrays.toString(nums));

        // TEST shiftLeftModify
        int[] nums = {5, 1, 3, 4, 7};
        ArrayAlgorithms.shiftLeftModify(nums);

        // original array IS modified
        System.out.println(Arrays.toString(nums));


    }
}
