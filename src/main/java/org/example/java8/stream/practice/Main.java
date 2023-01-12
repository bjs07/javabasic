package org.example.java8.stream.practice;

import java.util.List;
import java.util.Optional;

import org.example.java8.stream.practice.Trader;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import static org.example.java8.stream.practice.Trader.*;
import static org.example.java8.stream.practice.Transaction.*;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2022, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        // List<Transaction>

        // 연습 2: 거래자가 근무하는 모든 도시를 중복 없이 나열하시오
        // List<String>
        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 이름순으로 오름차정렬.
        // List<Trader>
        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차정렬하여 반환
        // List<String>
        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean isMillan = transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equalsIgnoreCase("Milan"));
        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        int totalTransactionValue = transactions.stream()
                .filter(t -> t.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .mapToInt(t -> t.getValue())
                .sum();
        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
        int maxValue = transactions.stream()
                .mapToInt(t -> t.getValue())
                .max()
                .getAsInt();
        System.out.println("maxValue = " + maxValue);

        // 가장 작은 거래액을 가진 거래정보 탐색
        Optional<Transaction> smallestTransaction =
                transactions.stream()
                        .min(comparing(Transaction::getValue));
        smallestTransaction.ifPresent(st-> System.out.println(st));
    }
}

