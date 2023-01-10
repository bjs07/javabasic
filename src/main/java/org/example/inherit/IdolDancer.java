package org.example.inherit;

import org.example.basic.Dancer;
import org.example.basic.Rapper;
import org.example.basic.Singer;

public class IdolDancer extends Dancer implements Singer, Rapper {

    private int numberOfFan;
    public IdolDancer(String crewName, String myName) {
        super(crewName, myName);
        this.numberOfFan = 10;
    }

    @Override
    public void dance() {
        wink();
    }

    private void wink(){
        System.out.println("상큼한 윙크");
    }

    @Override
    public void sing() {

    }

    @Override
    public void rap() {

    }
}
