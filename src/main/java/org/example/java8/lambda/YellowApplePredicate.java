package org.example.java8.lambda;

import org.example.java8.Color;

public class YellowApplePredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor() == Color.YELLOW;
    }
}
