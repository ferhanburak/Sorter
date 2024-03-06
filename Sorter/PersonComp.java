package ProgrammingAssignment2;

import java.util.Comparator;
import java.util.*;


public class PersonComp {
    public static Comparator<Person> nameComparator = Comparator.comparing(Person::getName).reversed();
    public static Comparator<Person> surnameComparator = Comparator.comparing(Person::getSurname).reversed();
    public static Comparator<Person> idComparator = Comparator.comparing(Person::getId).reversed();
}
