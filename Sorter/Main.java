package ProgrammingAssignment2;
import java.util.*;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        
        Person[] persons = {
                new Person("Burak", "Ozkan",123),
                new Person("Anderson","Talisca",947),
                new Person("Ricardo","Quaresma",794),
                new Person("Mario","Gomez",333),
                new Person("Ekin", "Celik",456),
                new Person("Ayhan Tan", "Acar",789),
                new Person("Osman Emre","Kaya",234),
                new Person("Emrah","Horkar",567),
                new Person("Furkan","Arslan",890),
                new Person("Beste","Sakar",393),
                
                
              
        };

       
        MergeSort.mergeSortDescending(persons, PersonComp.idComparator);
        System.out.println("Merge Sort (Descending) by ID:");
        printPersons(persons);

       
        MergeSort.mergeSortDescending(persons, PersonComp.nameComparator);
        System.out.println("Merge Sort (Descending) by Name using Comparator:");
        printPersons(persons);

       
        QuickSort.quickSortDescending(persons, PersonComp.idComparator);
        System.out.println("Quick Sort (Descending) by ID:");
        printPersons(persons);

        
        QuickSort.quickSortDescending(persons, PersonComp.surnameComparator);
        System.out.println("Quick Sort (Descending) by Surname using Comparator:");
        printPersons(persons);
    }

    private static void printPersons(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person.getName() + " " + person.getSurname() + " - ID: " + person.getId());
        }
        System.out.println();
    }
}
