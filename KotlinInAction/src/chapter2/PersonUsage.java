package chapter2;

import chapter2.person.Person;

/* Java */

public class PersonUsage {
    public static void main(String[] args) {
        Person person = new Person("Bob", true);
        System.out.println(person.getName());
        System.out.println(person.isMarried());
    }
}
