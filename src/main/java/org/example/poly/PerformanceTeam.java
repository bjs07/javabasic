package org.example.poly;

import org.example.basic.Dancer;

import java.util.ArrayList;
import java.util.List;

public class PerformanceTeam {

    private List<Dancer> dancers = new ArrayList<>();

    public void joinDancer(Dancer dancer){
        dancers.add(dancer);
        System.out.println(dancer.getMyName()+"을 영입했습니다.");
        System.out.println("현재 팀원 수:" + dancers.size());

    }   
    
    public void groupDance(){
        for (Dancer dancer : dancers) {

        }
    }

}
