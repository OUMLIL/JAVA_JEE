import java.lang.Object;
import java.util.Arrays;
import java.util.Objects;

public class Tableau<O> {
    private int capacite;
    private int taille;
    private Object[] list;

    public Tableau() {
        capacite = 1;
        taille = 0;
        list = new Object[capacite];
    }

    public Tableau(int n) {
        capacite = n;
        taille = 0;
        list = new Object[n];
    }

    public int getCapacite() {
        return capacite;
    }

    public int getTaille() {
        return taille;
    }

    public void agrandir() {
        Object[] arr = new Object[capacite*2];
        capacite *= 2;
        System.arraycopy(list,0, arr, 0, taille);
        list = arr;
    }
    public void addElement(Object o) {
        if(taille == capacite) {
            agrandir();
        }
        list[taille] = o;
        taille++;
    }

    public Object getElementAt(int i) throws MyArrayOutOfBoundsException {
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
