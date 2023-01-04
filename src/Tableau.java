import java.lang.Object;
import java.util.Arrays;
import java.util.Objects;

public class Tableau<O> {
    private int capacite;
    private int taille;
    private O[] list;

    @SuppressWarnings("unchecked")
    public Tableau() {
        capacite = 1;
        taille = 0;
        list = (O[]) new Object[capacite];
    }
    @SuppressWarnings("unchecked")
    public Tableau(int n) {
        capacite = n;
        taille = 0;
        list =(O[]) new Object[n];
    }

    public int getCapacite() {
        return capacite;
    }

    public int getTaille() {
        return taille;
    }
    @SuppressWarnings("unchecked")
    public void agrandir() {
        O[] arr = (O[]) new Object[capacite*2];
        capacite *= 2;
        System.arraycopy(list,0, arr, 0, taille);
        list = arr;
    }
    public void addElement(O o) {
        if(taille == capacite) {
            agrandir();
        }
        list[taille] = o;
        taille++;
    }

    public O getElementAt(int i) throws MyArrayOutOfBoundsException {
        if (i<0 || i>= taille) {
            throw new MyArrayOutOfBoundsException("Out Of Bounds");
        }
        return list[i];
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(capacite, taille);
        result = 31 * result + Arrays.hashCode(list);
        return result;
    }

    @Override
    public String toString() {
        return "Tableau{" +
                "capacite=" + capacite +
                ", taille=" + taille +
                ", hashcode=" + hashCode() +
                '}';
    }
}
