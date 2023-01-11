import interfaces.Algorithme;
import interfaces._Algorithme;

public class Main {

    public static void main(String[] argv) {
        Double[] d = new Double[10];
        String s = "Tableau : [";
        for(int i=0; i<10; ++i) {
            d[i] = Math.random()*100;
        }
        for(double e: d) {
            s += e + ", ";
        }
        s += "]";
        System.out.println(s);
        try {
            Class classe = Class.forName(argv[0]);
            _Algorithme<Double> o = (_Algorithme<Double>) classe.getDeclaredConstructor().newInstance();
            System.out.println("******* Application de l'algorithme *******");
            o.appliquer(d);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

}
