public class Classroom
{
    // instance variable
    private Student[] classRoster;
    private int nextAvailableIndex;

    // constructor
    public Classroom(int numStudents)
    {
        classRoster = new Student[numStudents];
        nextAvailableIndex = 0;
    }

    // getter method: returns a reference to classRoster array
    public Student[] getClassRoster()
    {
        return classRoster;
    }

    /** Adds student to the next available index in classRoster array
     (when iterating left to right) and return true to indicate
     student was successfully added.
     If the array is already maxed out (i.e. the class roster is full),
     do not add the Student and return false.
     */
    public boolean addStudent(Student student)
    {
//        if (classRoster[classRoster.length-1] != null)
        if (nextAvailableIndex >= classRoster.length)
        {
            return false;
        }
        else
        {
            classRoster[nextAvailableIndex] = student;
            nextAvailableIndex++;
            return true;
        }
    }

    /** Returns the class exam average determined by adding
     adding up all exams taken by all students and dividing
     by total number of exam scores
     */
    public double classExamAverage()
    {
        // loop through each student
        // for each student, add each of their scores to grand total
        // divide grand total by total number of exam scores
        int grandTotal = 0;
        int totalNumberOfExams = 0;
        for (Student student : classRoster)
        {
            if (student != null)
            {
                int[] tempArray = student.getExamScores();
                for (int score : tempArray)
                {
                    grandTotal += score;
                    totalNumberOfExams++;
                }
            }
        }
        return (double) grandTotal / totalNumberOfExams;
    }

    /** Prints class roster by printing all non-null students
     in the order they appear in classRoster, one per line,
     in the format; last name, first name;
     any null values in classRoster are not printed
     */
    public void printRoster()
    {
        for (Student student : classRoster)
        {
            if (student != null)
            {
                System.out.println(student.getLast() + ", " + student.getFirst());
            }
        }
    }
}