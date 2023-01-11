import java.util.Scanner;

public class Main {

    public static void main(String[] argv) {
        double[] d = new double[10];
        String s = "";
        for(int i=0; i<10; ++i) {
            d[i] = Math.random()*100;
        }
        System.out.println("Tableau :");
        for(double e: d) {
            s += e + " ";
        }
        System.out.println(s);
        try {
            Class classe = Class.forName(argv[0]);
            Algorithme o = (Algorithme) classe.getDeclaredConstructor().newInstance();
            o.appliquer(d);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

}
