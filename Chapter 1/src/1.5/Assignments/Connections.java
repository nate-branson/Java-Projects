/**
 * Connections.java
 * @author Nathan Branson
 */

public class Connections{
    public static void main(String[] args){
        int n = 12;
        double p = .5;
        if(args.length == 2){
            n = Integer.parseInt(args[0]);
            p = Double.parseDouble(args[1]);
        }

        double a = 0;

        StdDraw.setXscale(-1.1,1.1);
        StdDraw.setYscale(-1.1,1.1);
        StdDraw.setPenRadius(0.03);

        for (int i = 0; i < n; i ++){
            double x = Math.cos(a);
            double y = Math.sin(a);

            StdDraw.point(x, y);

            a = a + 2 * Math.PI / n;
        }
        
        a = 0;
        double b = 0;
        StdDraw.setPenRadius(0.007);

        for (int k = 0; k < n; k++){
            
            double x = Math.cos(a);
            double y = Math.sin(a);
            for (int j = 0; j < n; j++){
                double x2 = Math.cos(b);
                double y2 = Math.sin(b);

                double rand = Math.random();
                if (p < rand){
                    StdDraw.line(x, y, x2, y2);
                }
                b = b + 2 * Math.PI / n;
            }
            a = a + 2 * Math.PI / n;
            b = 0;            
        }

    }
}
