/**
 * Circles.java
 * @author Nathan Branson
 */

 public class Circles{
    public static void main(String[] args){
        int n = 50;
        double p = .5;
        double minR = .1;
        double maxR = .5;
        double scaleNum = 3;
        double radius = 0;

        if(args.length == 4){
            n = Integer.parseInt(args[0]);
            p = Double.parseDouble(args[1]);
            minR = Double.parseDouble(args[2]);
            maxR = Double.parseDouble(args[3]);
        }
        if(args.length == 5){
            scaleNum = Double.parseDouble(args[4]);
        }
        
        StdDraw.setXscale(0, scaleNum);
        StdDraw.setYscale(0, scaleNum);

        for (int i = 0; i < n; i++){
            double rand = Math.random();

            // color of circle i
            if (p < rand){
                StdDraw.setPenColor(StdDraw.BLACK);
            }
            else{
                StdDraw.setPenColor(StdDraw.WHITE);
            }

            // radius of circle i
            if(minR == maxR){
                radius = Math.random() * (maxR);
            }
            else{
                radius = Math.random() * (maxR - minR);
            }

            // draw circle i
            double x = Math.random() * scaleNum;
            double y = Math.random() * scaleNum;

            StdDraw.filledCircle(x, y, radius);

        }
    }
 }