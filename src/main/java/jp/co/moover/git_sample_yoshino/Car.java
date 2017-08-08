package jp.co.moover.git_sample_yoshino;

/**
 * 車を開発するクラス.
 * @author chai
 *
 */
public class Car {
	
	/**スピード*/
	private int speed;
	
	/**
	 * 走ります.
	 */
	public void run() {
		
		this.speed+=5;
	}
	
	public int getSpeed() {
		
		return speed;
	}
	
	public void setSpeed(int speed) {
		
		this.speed = speed;
	}

}
