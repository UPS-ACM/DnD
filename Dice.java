import java.util.Random;
/** An object that creates a die with any number of sides, the only method is Roll().
 *  @author Quinn Thorsnes
 *  @version <2013-10-20>
 */
public class Dice
{
	private int size;
	/** Constructs the Dice object.
	 * @param s - integer representing the number of sides on your die
	 */
	public Dice(int s)
	{
		size = s;
	}
	/** The method that rolls your die.
	 * @return int
	 */
	public int Roll()
	{
		int result;
		Random foobar = new Random();
		result  = foobar.nextInt(size) + 1;
		return result;
	}
}