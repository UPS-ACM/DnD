import java.util.Random;
/** An object that creates a die with any number of sides.
 * 
 * @Methods roll(), rollExploding()
 * @author Quinn Thorsnes
 * @version <2013-10-20>
 */
public class Dice
{
	private int size;
	
	/** Constructs the Dice object.
	 * 
	 * @param s - integer representing the number of sides on your die
	 */
	public Dice(int s)
	{
		size = s;
	}
	
	/** The method that rolls your die.
	 * 
	 * @return the result of the die roll as an integer.
	 */
	public int roll()
	{
		int result;
		Random foobar = new Random();
		result  = foobar.nextInt(size) + 1;
		return result;
	}
	
	/** A modification on the roll method for exploding dice. If a die comes up maximum it is re-rolled and the new value added. 
	 * 
	 * @return the result of the exploding die roll as an integer.
	 */
	public int rollExploding()
	{
		int result;
		result = this.roll();
		boolean exploding = true;
		while (exploding)
		{
			if (result == size)
			{
				result = result + this.roll();
			}
			else
			{
				exploding = false;
			}
		}
		return result;
	}
}