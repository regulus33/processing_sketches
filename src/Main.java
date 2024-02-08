import processing.core.PApplet;

public class Main extends PApplet {
	public static void main(String[] args) {
		PApplet.main("Main"); // Use the string "Main" to refer to this class
	}

	public void settings() {
		size(640, 480); // Set the size of the window
	}

	public void setup() {
		background(255); // Set the background to white
	}

	public void draw() {
		ellipse(width / 2, height / 2, 100, 100); // Draw a circle in the middle of the window
	}
}
