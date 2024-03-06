package ProgrammingAssignment2;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private long id;

    public Person(String name, String surname, long id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getId() {
        return id;
    }

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}

  
}
