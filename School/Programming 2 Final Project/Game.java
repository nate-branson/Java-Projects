/**
 * Game.java
 * @author Nathan Branson
 * 
 * 
 * NEED stdlib.jar, Projectile.java, and Tank.java
 */

public class Game{

    public static void main(String[] agrs){

        //StdDraw.setCanvasSize(1000, 1000);


        Tank tank1 = new Tank(.2);
        Tank tank2 = new Tank(.8);

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledSquare(0.0, 0.0, 1.0);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.filledRectangle(0.0, 0.0, 1, 0.3 - .05);

        tank1.draw();
        tank2.draw();
        
        double dx1 = tank1.getX();
        double dy1 = tank1.getY();

        double dx2 = tank2.getX();
        double dy2 = tank2.getY();


        Projectile pro = null;

        double vx0 = 0;
        double vy0 = 0;
        double vx = 0;
        double vy = 0;
        double rx = 0;
        double ry = 0;
        double gravity = .03;
        double wind = 0;

        int hit1 = 0;
        int hit2 = 0;

        boolean gameover = false;

        tank1.drawLives(hit1);
        tank2.drawLives(hit2);

        int t = 0;
        StdDraw.enableDoubleBuffering();

        boolean turn = true;


        double max = .015;
        double min = -.015;
        double range = -.03;
        wind = (Math.random() * range) + max;
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.text(.5, .7, String.format("Wind: %.2f", wind * 100));
            
        while (true){
            if(turn == true){

                if (StdDraw.isMousePressed() && pro == null){


                    vx0 = (StdDraw.mouseX() - dx1) / 2;
                    vy0 = (StdDraw.mouseY() - dy1) / 2;
    
                    rx = dx1;
                    ry = dy1;
    
                    vx = vx0;
                    vy = vy0;
    
                    pro = new Projectile(vx, vy, dx1, dy1);
                }
                if (pro != null){
    
                    rx = (vx * .1) + rx;
                    ry = (vy * .1) + ry;
                    vy -= gravity;
                    vx += wind;
    
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledSquare(0.0, 0.0, 1.0);
                    StdDraw.setPenColor(StdDraw.GREEN);
                    StdDraw.filledRectangle(0.0, 0.0, 1, 0.3 - .05);

                    StdDraw.setPenColor(StdDraw.GREEN);
                    StdDraw.text(.5, .7, String.format("Wind: %.2f", wind * 10));
    
                    tank1.draw();
                    tank2.draw();
                    pro.draw(rx, ry);

                    if((pro.getProX() < dx2 + .065 && pro.getProX() > dx2 - .065)
                            && (pro.getProY() < dy2 + .065 && pro.getProY() > dy2 - .065)){
                        wind = (Math.random() * range) + max;
                        hit2 += 1;
                        pro = null;
                        turn = false;
                    }else if (pro.getProX() > 1 || pro.getProY() <= dy1 -.05){
                        wind = (Math.random() * range) + max;
                        pro = null;
                        turn = false;
                    }

                    tank1.drawLives(hit1);
                    tank2.drawLives(hit2);
                }
            }else{

                if (StdDraw.isMousePressed() && pro == null){
                    

                    vx0 = (StdDraw.mouseX() - dx2) / 2;
                    vy0 = (StdDraw.mouseY() - dy2) / 2;
    
                    rx = dx2;
                    ry = dy2;
    
                    vx = vx0;
                    vy = vy0;

                    pro = new Projectile(vx, vy, dx2, dy2);
                }
                if (pro != null){
        
                    rx = (vx * .1) + rx;
                    ry = (vy * .1) + ry;
                    vy -= gravity;
                    vx += wind;
    
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledSquare(0.0, 0.0, 1.0);
                    StdDraw.setPenColor(StdDraw.GREEN);
                    StdDraw.filledRectangle(0.0, 0.0, 1, 0.3 - .05);

                    StdDraw.setPenColor(StdDraw.GREEN);
                    StdDraw.text(.5, .7, String.format("Wind: %.2f", wind * 10));
    
                    tank1.draw();
                    tank2.draw();
                    pro.draw(rx, ry);

                    if((pro.getProX() < dx1 + .065 && pro.getProX() > dx1 - .065)
                            && (pro.getProY() < dy1 + .065 && pro.getProY() > dy1 - .065)){
                        wind = (Math.random() * range) + max;
                        hit1 += 1;
                        pro = null;
                        turn = true;
                    }else if (pro.getProX() < 0 || pro.getProY() <= dy2 -.05){
                        wind = (Math.random() * range) + max;
                        pro = null;
                        turn = true;
                    }
                    tank1.drawLives(hit1);
                    tank2.drawLives(hit2);
                }
                    
            
            }

                if(hit1 == 3 && !gameover || gameover && hit1 == 3){
                    gameover = true;

                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.text(.8, .5, "Tank 2 Won!");

                    StdDraw.setPenColor(StdDraw.GREEN);
                    StdDraw.text(.5, .7, "Restart");
                    if (StdDraw.mouseX() < 1 && StdDraw.mouseX() > 0 && StdDraw.mouseY() < 1 && StdDraw.mouseY() > 0){
                        hit1 = 0;
                        hit2 = 0;
                        
                        gameover = false;
                    }
                       
                }else if(hit2 == 3 && !gameover || gameover && hit2 == 3){
                    gameover = true;

                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.text(.2, .5, "Tank 1 Won!");

                    StdDraw.setPenColor(StdDraw.GREEN);
                    StdDraw.text(.5, .4, "Click to Restart");
                    if (StdDraw.mouseX() < 1 && StdDraw.mouseX() > 0 && StdDraw.mouseY() < 1 && StdDraw.mouseY() > 0){
                        hit1 = 0;
                        hit2 = 0;
                        gameover = false;
                    }
                }           

            StdDraw.show();
            StdDraw.pause(20);
        }


    }
        
}
