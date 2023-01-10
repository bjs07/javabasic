package org.example.basic.inherit;

import org.example.basic.Dancer;

public class IdolDancer extends Dancer {

    private int numberOfFan;
    public IdolDancer(String crewName, String myName) {
        super(crewName, myName);
        this.numberOfFan = 10;
    }
    private void wink(){
        System.out.println("상큼한 윙크");
    }
}
