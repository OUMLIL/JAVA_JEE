package plugins;

import interfaces.Algorithme;

public class Afficher implements Algorithme {
    public void appliquer(double d[]) {
        String s = "nouveau Tableau : [";
        for(double e: d) {
            s += e + ", ";
        }
        s += "]";
        System.out.println(s);
    }
}
