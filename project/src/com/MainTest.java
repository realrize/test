package com;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class MainTest {

    @Test
    public void tst() throws Exception{

        /*JSONArray jsonArray = new JSONArray();
        jsonArray.add(new JSONObject().put("name", "John"));
        jsonArray.add(new JSONObject().put("name", "David"));
        List list = (List) jsonArray.stream().map(json -> json.toString()).collect(Collectors.toList());
        System.out.println(list);*/

        //Arrays.asList(1, 2, 3).stream().sorted(Comparator.<Integer>reverseOrder()).forEach(System.out::println); // 1,2,3
        //test abc

        Stream<Integer> s1  = Stream.of(1, 11, 111, 1111)
                .peek(e -> System.out.println("Filtered value: " + e));

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(12);
        intList.add(15);
        intList.add(7);
        intList.add(8);
        intList.add(9);
        intList.add(10);
        Stream<Integer> intStream = intList.stream();
        //System.out.println(intStream.reduce(Integer::min).get().toString());
    }


    @FunctionalInterface
    interface Func {
        public int calc(int a, int b);
    }


    public static void main(String[] args) throws Exception{

/*        JSONArray jsonArray = new JSONArray();
        jsonArray.add(new JSONObject().put("name", "John"));
        jsonArray.add(new JSONObject().put("name", "David"));
        List list = (List) jsonArray.stream().map(json -> json.toString()).collect(Collectors.toList());
        System.out.println(list);*/

        IntStream is1 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);

        is1.filter(s -> s > 3)
                .peek(s -> System.out.println("skip(2) 실행 후 : " + s))
                .map(s -> s * s)
                .filter(s -> s > 30)
                .peek(s -> System.out.println("skip(3) 실행 후 : " + s))
                .forEach(System.out::println);

        is1.peek(s -> System.out.println("skip(4) 실행 후 : " + s));


        //Arrays.asList(1, 2, 3).stream().forEach(System.out::println); // 1,2,3

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(12);
        intList.add(15);
        intList.add(7);
        intList.add(8);
        intList.add(9);
        intList.add(10);
        Stream<Integer> intStream = intList.stream();
        //System.out.println(intStream.reduce(Integer::min).get().toString());

    }
}