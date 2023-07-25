package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;


public class RedPolymorph extends Polymorph {

    public RedPolymorph(int x, int y) {
        super(x, y);
  
    }

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);
		g.fillRect(getX(), getY(), getW(), getH());
    }


    
}
