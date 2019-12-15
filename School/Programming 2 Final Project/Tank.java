/**
 * Tank.java
 * @author Nathan Branson
 */

public class Tank{

    private double x, y;


    public Tank(double x){
        StdDraw.setPenRadius(.1);
        this.x = x;
        y = .3;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public void draw(){
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(x, y, .065);
    }

    public void drawLives(int hits){
        for (int i = hits; i < 3; i++){
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledCircle(x - .06 + i*.1, .9, .03);
        }
    }

    
}