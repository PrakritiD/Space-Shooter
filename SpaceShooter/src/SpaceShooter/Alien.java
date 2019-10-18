package SpaceShooter;

public class Alien extends MovingItem{

	private final int INITIAL_X = 400;
	
	public Alien(int x, int y) {
		super(x, y);
		
		alien();
	}
	
	private void alien() {
		loadImage("src/resources/alien.png");
		getImageDimensions();
	}
	
	public void move() {
		
		if(x < 0) {
			x = INITIAL_X;
		}
		
		x -= 1;
		
	}
}
