
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Tester extends JFrame{

	public int rect_width = 30;
	public Tester () {
		/*add(new TestAni());*/
		setTitle("MatheSimulation");
		setSize(600,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		}

	public static void main(String[] args) {
	
		
	Tester testObject = new Tester();
	testObject.setVisible(true);
	
	while (true) {
		testObject.drawsp(10);
		try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
		}
	}

}

public void drawsp(double time) {	
	Graphics g = getGraphics();
	g.setColor(Color.WHITE);
	g.fillRect(0, 0, 600, 800);
	g.setColor(Color.BLACK);
	
	MassenSimulation homo = new MassenSimulation(20,50,50,50,10,10,10,10);
	//*Anfangspunkt
	int coor_x1 = (int)homo.x1;
	g.fillRect(coor_x1-rect_width/2,100-rect_width/2,rect_width,rect_width);
	//*Zeichnet Schwerpunkte
	for(int i = 0; i<=time; i++) {
	
	homo.simulate(i);
	g.setColor(Color.RED);
	int pixels = (int)homo.schwerpunkt;
	g.fillOval(pixels,100,10,10);
	
	
	}
}



public void process(double time) {

	MassenSimulation homo = new MassenSimulation(1,5,5,6,1,4,1,1);
	for(int i = 0; i<=time;i++) {
		homo.simulate(i);
		}
	}
}
