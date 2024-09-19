import java.util.Random;

public class SortCup {
    int size;
    int[] table;

    public SortCup(int s) {
        this.size = s;
        table = new int[s];
    }

    public void RandomTableInts() {
        for (int i = 0; i < size; i++) {
            Random rand = new Random();
            table[i] = rand.nextInt(size);
            System.out.print(table[i] + " ");
        }
    }

    public void sortCup() {
        System.out.print("\n");

        int[] pom = new int[size];
        for (int i = 0; i < size; i++) {
            pom[table[i]]++;
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Liczba:" + i + " tyle razy: " + pom[i]);
        }

        System.out.print("\n");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < pom[i]; j++) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
    }
}