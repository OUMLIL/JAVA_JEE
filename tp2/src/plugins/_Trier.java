package plugins;

import interfaces._Algorithme;

import java.util.Arrays;
public class _Trier<T> implements _Algorithme<T> {
    public void appliquer(T d[]) {
        Arrays.sort(d);
        String s = "nouveau Tableau : [";
        for (T e : d) {
            s += e + ", ";
        }
        s += "]";
        System.out.println(s);
    }
}

