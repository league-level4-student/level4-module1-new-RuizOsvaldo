package _05_Polymorphs;
import java.awt.Color;
import java.awt.Graphics;
public class MovingMorph extends Polymorph{

    public MovingMorph(int x, int y) {
        super(x, y);
       
    }

    @Override
    public void update() {
       setX(getX()+5);
       setY(getY()+5);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.GRAY);
		g.fillRect(getX(), getY(), getW(), getH());
        update();
    }
    
}
