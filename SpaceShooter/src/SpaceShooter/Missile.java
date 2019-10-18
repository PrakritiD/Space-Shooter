package SpaceShooter;

public class Missile extends MovingItem{
	
	private final int BOARD_WIDTH = 390;
	private final int MISSILE_SPEED = 2;
	
	public Missile(int x, int y) {
		super(x, y);
		missile();
	}
	
	private void missile() {
		loadImage("src/resources/missile.png");
		getImageDimensions();
	}

	public void move() {
		x += MISSILE_SPEED;
		
		if(x > BOARD_WIDTH) {
			visible = false; 
		}
	}
}
