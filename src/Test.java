import java.util.Random;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        TreeSet<Integer> set = new TreeSet<>();

        int number = 0;
        int sum = 0;

        while (set.size() != 50) {
            set.add(number += random.nextInt(1000));
            sum += number;
            number = 0;

        }

        int average = sum / set.size();

        System.out.println(set);
        System.out.println("Najmniejsza liczba: " + set.first());
        System.out.println("Największa liczba: " + set.last());
        System.out.println("Srednia ze wszystkich liczb: " + average);
        System.out.println("Liczby większe od średniej:");
        int holder = set.higher(average);
        while (set.iterator().hasNext()) {
            System.out.print(holder + ", ");
            if (set.higher(holder) == null) {
                break;
            }
            holder = set.higher(holder);
        }

    }
}
