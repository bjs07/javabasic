package org.example.java8.lambda;

import lombok.Getter;
import org.example.java8.Color;

import java.util.ArrayList;
import java.util.List;
@Getter
public class FilteringApple {
    /*
    * @solution1 - try1 : 녹색 사과를 필터링하는 메서드를 만들어야 함.
    * @problem
    * -만약 다른 색깔 사과를 필터링 해야하는 경우에는 메서드를 또 만들어야 함.
    * */

    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if(apple.getColor() == Color.GREEN){
                result.add(apple);
            }

        }
        return result;
    }
    /**
     * @solution - try 2 : 색상을 파라미터화 한다.
     */
    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor() == color) {
                result.add(apple);
            }
        }
        return result;
    }
        /*
        * @solution - try3 : 동작을 파라미터와 한다 - 추상화 조건으로 필터링
        *
*        */
    /**
     * @solution - try 3 : 동작을 파라미터화 한다. - 추상적 조건으로 필터링
     * @problem
     * - 과일이 사과가 아니라 오렌지면?
     * - 과일이 아니라 가전제품이면??
     */
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * @solution - try 4: 제네릭 필터 메서드 생성
     */
    public static <T> List<T> filter(List<T> inventory, GenericPredicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T t : inventory) {
            if (p.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public static <T, R> List<R> map(List<T> list, GenericFunction<T, R> mapper) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            R r = mapper.apply(t);
            result.add(r);
        }
        return result;
    }
}
