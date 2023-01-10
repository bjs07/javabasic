package org.example;

import org.example.basic.Dancer;
import org.example.inherit.IdolDancer;
import org.example.inherit.StreetDancer;
import org.example.poly.PerformanceTeam;

public class Main {
    public static void main(String[] args) {


        Dancer idolDancer1 = new IdolDancer("아이돌팀1","아이돌1");
        Dancer idolDancer2 = new IdolDancer("아이돌팀1","아이돌1");
        Dancer idolDancer3 = new IdolDancer("아이돌팀1","아이돌1");

        Dancer streetDancer1 = new StreetDancer("스트릿팀1","스트릿댄서1");
        Dancer streetDancer2 = new StreetDancer("스트릿팀1","스트릿댄서1");
        Dancer streetDancer3 = new StreetDancer("스트릿팀1","스트릿댄서1");

        PerformanceTeam team = new PerformanceTeam();
        team.joinDancer(idolDancer1);
        team.joinDancer(streetDancer3);
        team.joinDancer(streetDancer2);

    }
}