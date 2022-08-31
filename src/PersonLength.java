import java.util.Comparator;

public class PersonLength implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        int wordsLength = (o1.getSurname().split(" ").length);
        int wordsLength2 = (o2.getSurname().split(" ").length);

        if (wordsLength == wordsLength2) {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
        return wordsLength > wordsLength2 ? -1 : 1;

    }
}
