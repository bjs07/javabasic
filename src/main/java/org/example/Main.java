package org.example;

import org.example.basic.Dancer;
import org.example.basic.inherit.IdolDancer;
import org.example.basic.inherit.StreetDancer;

public class Main {
    public static void main(String[] args) {
        Dancer dancer = new Dancer("총알탄소년단","춤신춤왕");
        dancer.dance();
        IdolDancer idolDancer = new IdolDancer("르세라핌","김채원");
        StreetDancer streetDancer = new StreetDancer("길거리 춤꾼들","박격포");
        idolDancer.dance();
        System.out.println();
        streetDancer.dance();
        System.out.println();

    }
}