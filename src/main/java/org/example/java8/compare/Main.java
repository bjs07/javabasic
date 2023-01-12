package org.example.java8.compare;

import java.util.List;

import static java.util.Comparator.comparing;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(9,4,3,2,6,7);
        List<Person> pList = List.of(
                new Person("김철수",33)
                , new Person("홍길동",16)
                , new Person("박영희",44)

        );

        pList.sort(comparing(Person::getName));
        pList.sort(comparing(Person::getName).reversed());
        System.out.println("pList = "+pList);
    }
}
