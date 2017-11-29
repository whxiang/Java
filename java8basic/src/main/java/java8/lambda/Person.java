package java8.lambda;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Supplier;

/**
 * @author whxiang
 * @date 2017/11/29
 */
public class Person {
    public enum Sex {
        MALE,
        FEMALE
    }

    private String name;

    private LocalDate birthday;

    private Sex gender;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }


    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                '}';
    }

    public static <T, Source extends Collection<T>, Dest extends Collection<T>> Dest transferElements(Source source, Supplier<Dest> supplier) {
        Dest dest = supplier.get();
        dest.addAll(source);
        return dest;
    }


    public void personJava8() {
        List<Person> peopleList = new ArrayList<>();

        Person person = new Person();
        person.setBirthday(LocalDate.of(2007, 12, 12));
        person.setGender(Sex.MALE);
        person.setName("a");
        peopleList.add(person);

        Person person2 = new Person();
        person2.setBirthday(LocalDate.of(8, 12, 12));
        person2.setGender(Sex.MALE);
        person2.setName("b");
        peopleList.add(person2);

        System.out.println(peopleList);

        peopleList.sort(Person::compareByAge);

        String[] strings = {"Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda"};
        Arrays.sort(strings, String::compareToIgnoreCase);

        HashSet<Person> people = transferElements(peopleList, HashSet::new);
        people.forEach(x -> System.out.println(x));


        InterfaceDemo demo = this::print;
        demo.get();

        InterfaceDemo demo1=()->print();


    }

    private void print() {
        System.out.println(String.format("%s", "hello world"));
    }
}
