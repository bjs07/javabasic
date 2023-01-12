package org.example.java8.lambda;
@FunctionalInterface
public interface GenericPredicate<T> {
    public boolean test(T t);
}
