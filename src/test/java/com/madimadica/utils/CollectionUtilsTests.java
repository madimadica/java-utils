package com.madimadica.utils;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionUtilsTests {

    private static class Person {
        Long id;
        String firstName;
        String lastName;

        public Person(Long id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Long getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(getId(), person.getId()) && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId(), getFirstName(), getLastName());
        }
    }

    @Test
    void getFirst_NullArgument() {
        assertFalse(CollectionUtils.getFirst(null).isPresent());
    }

    @Test
    void getFirst_NullElement() {
        List<Integer> testInput = new ArrayList<>();
        testInput.add(null);
        assertFalse(CollectionUtils.getFirst(testInput).isPresent());
    }

    @Test
    void getFirst_HappyPath() {
        List<String> testInput = new ArrayList<>();
        testInput.add("foo");
        testInput.add("bar");
        assertEquals(CollectionUtils.getFirst(testInput).get(), "foo");
    }

    @Test
    void map() {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1L, "John", "Smith"));
        people.add(new Person(2L, "Bob", "Smith"));
        List<String> firstNames = CollectionUtils.map(people, Person::getFirstName);
        assertEquals(firstNames.size(), 2);
        assertEquals(firstNames.get(0), "John");
        assertEquals(firstNames.get(1), "Bob");
    }

    @Test
    void mapToSet_OneToOne() {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1L, "John", "Smith"));
        people.add(new Person(2L, "Bob", "Smith"));
        Set<String> firstNames = CollectionUtils.mapToSet(people, Person::getFirstName);
        assertEquals(firstNames.size(), 2);
    }

    @Test
    void mapToSet_ManyToOne() {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1L, "John", "Smith"));
        people.add(new Person(2L, "Bob", "Smith"));
        Set<String> firstNames = CollectionUtils.mapToSet(people, Person::getLastName);
        assertEquals(firstNames.size(), 1);
    }

    @Test
    void asMap() {
        Person john = new Person(1L, "John", "Smith");
        Person bob = new Person(2L, "Bob", "Smith");
        List<Person> people = new ArrayList<>();
        people.add(john);
        people.add(bob);
        Map<Long, Person> personLookup = CollectionUtils.asMap(people, Person::getId);
        assertEquals(personLookup.get(1L), john);
        assertEquals(personLookup.get(2L), bob);
    }

    @Test
    void asMap_Duplicates() {
        Person john = new Person(1L, "John", "Smith");
        Person bob = new Person(2L, "Bob", "Smith");
        Person bob2 = new Person(2L, "Bob2", "Smith2");
        List<Person> people = new ArrayList<>();
        people.add(john);
        people.add(bob);
        people.add(bob2);
        assertThrows(IllegalStateException.class, () -> CollectionUtils.asMap(people, Person::getId));
    }

    @Test
    void groupBy() {
        Person john = new Person(1L, "John", "Smith");
        Person bob = new Person(2L, "Bob", "Smith");
        Person bob2 = new Person(2L, "Tim", "Cook");

        List<Person> people = new ArrayList<>();
        people.add(john);
        people.add(bob);
        people.add(bob2);
        Map<String, List<Person>> peopleByLastName = CollectionUtils.groupBy(people, Person::getLastName);
        assertEquals(peopleByLastName.get("Smith").size(), 2);
        assertEquals(peopleByLastName.get("Cook").size(), 1);
        assertEquals(peopleByLastName.size(), 2);
        assertEquals(peopleByLastName.get("Smith").get(0), john);
        assertEquals(peopleByLastName.get("Smith").get(1), bob);
        assertEquals(peopleByLastName.get("Cook").get(0), bob2);
    }

    @Test
    void iterableToList() {
        Person john = new Person(1L, "John", "Smith");
        Person bob = new Person(2L, "Bob", "Smith");
        Person bob2 = new Person(2L, "Tim", "Cook");
        Set<Person> people = new HashSet<>();
        people.add(john);
        people.add(bob);
        people.add(bob2);
        List<Person> result = CollectionUtils.toList(people);
        assertEquals(result.size(), 3);
        for (Person p : result) {
            assertTrue(people.contains(p));
        }
    }
}
