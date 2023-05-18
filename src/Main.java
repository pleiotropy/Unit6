public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // example 1
        int[] heights = new int[3];
        heights[0] = 78;
        heights[1] = 72;
        heights[2] = 69;

        // example 2
        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};
        String temp = alphabeticalNames[1];
        alphabeticalNames[1] = alphabeticalNames[2];
        alphabeticalNames[2] = temp;
        for (int i = 0; i < alphabeticalNames.length; i++)
        {
            System.out.println(alphabeticalNames[i]);
        }

        // example 3
        double[] array1 = {7.5, 10.0};
        double[] array2 = {8.2, 14.8};
        double[] array3 = {array1[0]+array2[0], array1[1]*array2[1]};
        System.out.println(array3[0]);
        System.out.println(array3[1]);
    }
}