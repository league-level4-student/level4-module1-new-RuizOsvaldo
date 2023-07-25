package _05_Polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int w = 50;
    private int h = 50;
    
    
    public Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;

    
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getW(){
        return w;
    }

    public int getH(){
        return h;
    }

    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }

    public abstract void update();
    
    public abstract void draw(Graphics g);
}
