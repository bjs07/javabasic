package org.example.java8.stream.practice;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class Trader {

    private final String name;
    private final String city;
    @Override
    public String toString() {
        return String.format("Trader: %s in %s", name, city);
    }
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

}
