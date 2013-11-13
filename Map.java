import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
//import java.awt.Rectangle;

public class Map extends JComponent
{
	private int numX;
	private int numY;
	private final int CELL_SIZE = 20;
	private int xPos;
	private int yPos;
	private Color[][] mapArray;
	
	public Map (int xOffset, int yOffset, int cellsAcross, int cellsDown/*, int cellSideLength*/)
	{
		xPos = xOffset;
		yPos = yOffset;
		numX = cellsAcross;
		numY = cellsDown;
		//cellSize = cellSideLength;
		for (int x = 0; x < numX; x++)
		{
			for (int y = 0; y < numY; y++)
			{
				mapArray[x][y] = Color.WHITE;
			}
				
		}
	}
	
	public void paintComponent (Graphics g)
	{
		g.setColor(Color.WHITE);
		g.fillRect(xPos, yPos, numX*CELL_SIZE, numY*CELL_SIZE);
		
		for (int x = 0; x < mapArray.length; x++)
		{
			for (int y = 0; y < mapArray[x].length; y++)
			{
				g.setColor(mapArray[x][y]);
				g.fillRect(x*CELL_SIZE + xPos, yPos + y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
			}
		}
		
	}
}
