package de.neuefische;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<List<String>> strings = List.of(
                List.of("Test1", "Test2", "Test3"),
                List.of("Test4", "Test5", "Test6"),
                List.of("Test7", "Test8", "Test9"));

        List<String> flatenedList = strings.stream()// eröffnen den Stream
                .map(List::stream)//Streamen der Liste in der Liste
                .collect(Collectors.toList())//StreamList
                .stream()
                .flatMap(element -> element)//sieht elemente OHNE Listenzugehörigkeit
                .collect(Collectors.toList()); //Sammelt Elemente in neuer Liste

        List<String> flatenedList2 = strings.stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList());

        System.out.println("Before FlatMap= " + strings);
        System.out.println("After FlatMap= " + flatenedList);
        System.out.println("After FlatMap2= " + flatenedList2);

        List<String> fruits = List.of("Apple", "Banana", "Pear", "Grape");



        fruits.stream()
                .filter(fruit -> fruit.length()>=5) //"identisch" mit Methode unten
                .forEach(System.out::println);

    }

    //Diese Methode ist gleich der Pfeilmethode in unserem Filter
    public static boolean isFruitLongEnough(String fruit){
        return fruit.length()>=5;
    }
}