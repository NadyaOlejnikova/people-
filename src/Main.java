import java.util.*;


public class Main {
    public static void main(String[] args) {
     /*   Ваша задача написать класс-компаратор, который сравнивал бы людей по принципу знатности:

        У кого больше слов в фамилии, тот более знатен

      */
        List<Person> p1 = new ArrayList<>();
        p1.add(new Person("Хатын", "Ив", 25));
        p1.add(new Person("Ребьят", "Ив о ооо", 15));
        p1.add(new Person("Ребьят", "Ив", 16));
        p1.add(new Person("Хатын", "Ив", 50));

// сортировку надо
        p1.sort((o1, o2) -> {
            int wordsLength = (o1.getSurname().split(" ").length);
            int wordsLength2 = (o2.getSurname().split(" ").length);
            if (wordsLength == wordsLength2) {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
            return wordsLength > wordsLength2 ? -1 : 1;
        });
        System.out.println(p1);
    }

}

