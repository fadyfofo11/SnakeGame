/**
 * Snake
 *
 * @author Marc Oliveras Galvez <admin@oligalma.com> 
 * @link http://www.oligalma.com
 * @copyright 2018 Oligalma
 * @license GPL License v3
 */

package snake.domain;

public class Point implements Cloneable {
	private int x;
	private int y;
	
	public Point()
	{
		
	}
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public void setLocation(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
