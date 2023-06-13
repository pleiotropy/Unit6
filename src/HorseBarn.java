public class HorseBarn
{
    /** The spaces in the barn. Each array element holds a reference to the horse
     *  that is currently occupying the space. A null value indicates an empty space.
     */
    private Horse[] spaces;


    /** Constructor that takes the number of spaces (stalls in the barn)
     *
     *  @param numStalls  the number of stalls in the barn
     */
    public HorseBarn(int numStalls)
    {
        spaces = new Horse[numStalls];
    }

    /** Places a Horse into the barn at index space
     *
     *  @param horse  the Horse object to place into the barn
     *  @param space  the index of spaces to place the Horse
     */
    public void placeHorse(Horse horse, int space)
    {
        spaces[space] = horse;
    }

    /** Returns the index of the space that contains the horse with the specified name.
     *
     * Precondition: No two horses in the barn have the same name.
     *
     * @param  name the name of the horse to find
     * @return  the index of the space containing the horse with the specified name;
     *          -1 if no horse with the specified name is in the barn.
     */
    public int findHorseSpace(String name)
    {
        // regular for loop through each element in the HorseBarn
        // if it's not null
        // get the name of the horse in the spot
        // if the name is the same as the name for which the user is searching
        // return the current index
        for (int i = 0; i < spaces.length; i++)
        {
            if (spaces[i] != null)
            {
                if (spaces[i].getName().compareTo(name) == 0)
                {
                    return i;
                }
            }
        }
        return -1; // stub value to allow class to compile
    }

    /** Consolidates the barn by moving horses so that the horses are in adjacent
     *  spaces, starting at index 0, with no empty space between any two horses.
     *
     *  Postcondition: The order of the horses is the same as before the consolidation.
     */
    public void consolidate()
    {
        // make a temp array with the same number of spaces as the original
        // make a new index loop start at 0
        // for loop through the original
        // if not null, add the horse in the original to the temp array at the new index
        Horse[] tempSpace = new Horse[spaces.length];
        int newIndex = 0;
        for (Horse originalHorse : spaces)
        {
            if (originalHorse != null)
            {
                tempSpace[newIndex] = originalHorse;
                newIndex++;
            }
        }
        spaces = tempSpace;
    }

    /** Returns a string that can be printed, showing which horses are in which spaces
     */
    public String toString()
    {
        String result = "";
        Horse h = null;
        for (int i = 0; i < spaces.length; i++)
        {
            h = spaces[i];
            result = result + "space " + i + " has ";
            if (h == null)
            {
                result = result + " null \n";
            }
            else
            {
                result = result + h.toString() + "\n";
            }
        }
        return result;
    }
}