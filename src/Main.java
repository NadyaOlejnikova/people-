import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
     /*   Ваша задача написать класс-компаратор, который сравнивал бы людей по принципу знатности:

        У кого больше слов в фамилии, тот более знатен

      */
        List<Person> p1 = new ArrayList<>();
        p1.add(new Person("Хатын", "Ив Зира Бор кызы", 25));
        p1.add(new Person("Ребьят", "Ив Зира Бор", 15));
        p1.add(new Person("Ребьят", "Ив Зира Бо кызы кызы ", 18));
        p1.add(new Person("Хатын", "Ив Зира Бора кызы кызы кызы", 12));


        Collections.sort(p1, new PersonLength());
        System.out.println(p1);
        List<Person> copy = new ArrayList<>(p1);
        copy.removeIf(p -> p.getAge() < 18);
        System.out.println(copy);
    }
}
