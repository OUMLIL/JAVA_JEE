package plugins;

import interfaces.Algorithme;

import java.util.Arrays;

public class Trier implements Algorithme {
    public void appliquer(double d[]) {
        Arrays.sort(d);
        String s = "nouveau Tableau : [";
        for(double e: d) {
            s += e + ", ";
        }
        s += "]";
        System.out.println(s);
    }
}
