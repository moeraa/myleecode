package com.org.moer.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplyDemo {
    public static List<Integer> supply(Integer num, Supplier<Integer> supplier){
        List<Integer> resultList =new ArrayList<>();
        for (int i = 0; i <num ; i++) {
            resultList.add(supplier.get());
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<Integer> list = supply(10,()->(int)Math.random()*100);
        list.forEach(System.out::println);
    }
}
