import java.util.Random;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        TreeSet<Integer> set = new TreeSet<>();


        while (set.size() != 50) {
            set.add(random.nextInt(1000));
        }

        System.out.println(set);

        int min = minimal(set);
        int max = maximal(set);
        int avg = average(set);

        System.out.println("Miminalna wartość: " + min);
        System.out.println("Maksymalna wartość: " + max);
        System.out.println("Srednia: " + avg);
        greatersThanAverage(set);

        System.out.println(set);


    }

    static int minimal(TreeSet<Integer> set) {

        return set.first();
    }

    static int maximal(TreeSet<Integer> set) {

        return set.last();
    }

    static int average(TreeSet<Integer> set) {

        int sum = 0;
        int sizeOfSet = set.size();
        TreeSet<Integer> setHolder = new TreeSet<>();
        setHolder.addAll(set);

        for (int i = 0; i < sizeOfSet; i++) {
            sum += setHolder.first();
            setHolder.remove(setHolder.first());
        }
        int average = sum / sizeOfSet;

        return average;
    }

    static void greatersThanAverage(TreeSet<Integer> set) {

        int avarageHolder = average(set);
        int sizeOfSet = set.size();
        TreeSet<Integer> setHolder = new TreeSet<>();
        setHolder.addAll(set);
        System.out.println("Wszystkie liczby większe od sredniej " + avarageHolder + ":");
        for (int i = 0; i < sizeOfSet; i++) {
            if (setHolder.first() >= avarageHolder) {
                System.out.print(setHolder.first() + " ");
                setHolder.remove(setHolder.first());
            } else {
                setHolder.remove(setHolder.first());
            }
        }
        System.out.println("\n");
    }

}
