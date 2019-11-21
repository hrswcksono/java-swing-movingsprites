package id.ac.its.haris.movingsprite1;

public class Asteroid extends Sprite{
	public Asteroid(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		initAsteroid();
	}

	private void initAsteroid() {
		loadImage("src/resources/asteroid.png");
		getImageDimensions();
	}
}
 