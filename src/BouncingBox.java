import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

public class BouncingBox extends JComponent {

	private ArrayList<BouncingFigure> figures = new ArrayList<BouncingFigure>();

	public void add(BouncingFigure f) {
		figures.add(f);
	}

	public void paintComponent(Graphics g) {
		for (BouncingFigure f : figures) {
			f.draw(g); f.move();
			if(f.upperBorderCollision()) {
                f.setTrajectory(f.getTrajectory()*-1);
            }
            if(f.leftBorderCollision()) {
                f.setTrajectory(f.getTrajectory()+90);
            }
            if(f.rightBorderCollision(620)) {
                f.setTrajectory(f.getTrajectory()+260);
            }
            if(f.lowerBorderCollision(600)) {
                f.setTrajectory(f.getTrajectory()*-1);
            }
		}
	}
}
