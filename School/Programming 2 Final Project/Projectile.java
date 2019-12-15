/**
 * Projectile.java
 * @author Nathan Branson
 */

public class Projectile{


    private double vx0;
    private double vy0;
    private double rx;
    private double ry;

    private double vx;
    private double vy;

    
    public Projectile(double vx0, double vy0, double rx, double ry){
        this.vx0 = vx0;
        this.vy0 = vy0;

        this.rx = rx;
        this.ry = ry;
    }



    public double getProX(){
        return rx;
    }
    public double getProY(){
        return ry;
    }


    public double velocityX(double xm){
        vx = (xm - rx) + vx0; // dt = 1
        return vx;
    }

    public double velocityY(double ym){
        vy = (ym - ry) + vy0; // dt = 1
        return vy;
    }


    public void draw(double rx, double ry){
        this.rx = rx;
        this.ry = ry;


        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledCircle(rx, ry, .025);
      
    }

    
}