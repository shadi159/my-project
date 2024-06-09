import java.util.ArrayList;

/** class that represent a shared data structure that holds an 
 * array of integers, a boolean array indicating win states,
 * a flag, and a constant integer value.
 *
 * @author shadiBRZ
 * @version 9 June 2024 10:28
 */
public class SharedData 
{ 
    /**
     * The array of integers.
     */
    private ArrayList<Integer> array;

    /**
     * The boolean array indicating win states.
     */
    private boolean[] winArray;

    /**
     * The flag value.
     */
    private boolean flag;

    /**
     * The constant integer value.
     */
    private final int b;

    /**
     * Constructs a new instance with the specified array of integers
     * and constant integer value.
     *
     * @param array the array of integers
     * @param b the constant integer value
     */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	  /**
     * Returns the boolean array indicating win states.
     *
     * @return the boolean array indicating win states
     */
	public boolean[] getWinArray() 
	{
		return winArray;
	}
	
	 /**
     * Sets the boolean array indicating win states.
     *
     * @param winArray the boolean array to set
     */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

    /**
     * Returns the array of integers.
     *
     * @return the array of integers
     */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

    /**
     * Returns the constant integer value.
     *
     * @return the constant integer value
     */
	public int getB() 
	{
		return b;
	}

    /**
     * Returns the flag value.
     *
     * @return the flag value
     */
	public boolean getFlag() 
	{
		return flag;
	}

    /**
     * Sets the flag value.
     *
     * @param flag the flag value to set
     */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
