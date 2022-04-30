import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Person> people = getPeople();

    // Declarative approach ✅
    // Filter
    List<Person> females = people.stream()
            .filter(person -> person.getGender().equals((Gender.FEMALE)))
            .collect(Collectors.toList());
//    females.forEach(System.out::println);

    // Sort
    List<Person> sorted = people.stream()
                    .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
                    .collect(Collectors.toList());
    sorted.forEach(System.out::println);

    // All match
    boolean allMatch = people.stream()
            .allMatch(person -> person.getAge() >= 7);
    System.out.println(allMatch);

    // Any match
    boolean anyMatch = people.stream()
            .anyMatch(person -> person.getAge() > 121);
    System.out.println(anyMatch);


    // None match




    // Max


    // Min


    // Group


  }

  private static List<Person> getPeople() {
    return List.of(
        new Person("James Bond", 20, Gender.MALE),
        new Person("Alina Smith", 33, Gender.FEMALE),
        new Person("Helen White", 57, Gender.FEMALE),
        new Person("Alex Boz", 14, Gender.MALE),
        new Person("Jamie Goa", 99, Gender.MALE),
        new Person("Anna Cook", 7, Gender.FEMALE),
        new Person("Zelda Brown", 120, Gender.FEMALE)
    );
  }

}
