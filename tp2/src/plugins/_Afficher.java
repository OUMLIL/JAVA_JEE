package plugins;

import interfaces._Algorithme;

public class _Afficher<T> implements _Algorithme<T> {
    public void appliquer(T d[]) {
        String s = "nouveau Tableau : [";
        for(T e: d) {
            s += e.toString() + ", ";
        }
        s += "]";
        System.out.println(s);
    }
}
