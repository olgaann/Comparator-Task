import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person p1 = new Person("Фридрих", "Гольштейн Готторпский", 16); // 2 cлова в фамилии
        Person p2 = new Person("Анри", "Луи Огюст Рикар де Монферран", 25); // 5
        Person p3 = new Person("Мария", "Антония Йозефа Иоганна Габсбург-Лотарингская", 22); // 4
        Person p4 = new Person("Альбус", "Персиваль Вульфрик Брайан Дамблдор", 200); // 4
        Person p5 = new Person("Иоганн", "Себастьян Бах", 30); // 2
        Person p6 = new Person("Граф", "де Ла Фер", 70); // 3
        Person p7 = new Person("Александр", "Пушкин", 17); // 1

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);

        System.out.println(list);

        Predicate<Person> predicate = person -> person.getAge() < 18;

        list.removeIf(predicate);

        System.out.println(list);


    }
}
