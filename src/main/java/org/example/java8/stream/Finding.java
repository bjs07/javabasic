package org.example.java8.stream;
import org.example.java8.stream.Dish.*;
public class Finding {
    public static void main(String[] args) {
        boolean flag1 = Dish.menu.stream()
                .anyMatch(Dish::isVegetarian);
        ;
        System.out.println("=================");
        boolean flag2 = Dish.menu.stream()
                .anyMatch(d->d.getCalories()<100);
        System.out.println("flag2 = " + flag2);

        //allMatch : 모든 요소가 조건에 일치하는지 확인
        // 요리 목록의 모든 요리가 1000칼로리 미만인가?
        boolean flag3 = Dish.menu.stream()
                .allMatch( d -> d.getCalories()<1000);
        System.out.println("flag3 = "+flag3);

        // nonMatch : allMatch의 반대연산
    }
}
