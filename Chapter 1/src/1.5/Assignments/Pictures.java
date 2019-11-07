/**
 * Pictures.java
 * @author Nathan Branson
 */

public class Pictures{
    public static void main(String[] args){

        // This program will work no matter the scale!

        double scaleNum = 3;

        if(args.length == 1){
            scaleNum = Double.parseDouble(args[0]);
        }
        
        StdDraw.setXscale(-scaleNum,scaleNum);
        StdDraw.setYscale(-scaleNum,scaleNum);

        StdDraw.filledRectangle(0, 0, scaleNum * .5, scaleNum);
        StdDraw.filledRectangle(0, 0, scaleNum, scaleNum * .5);

        double[] x = {-scaleNum, 0, scaleNum, 0};
        double[] y = {0, scaleNum, 0, -scaleNum};


        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.filledPolygon(x, y);

    }
}