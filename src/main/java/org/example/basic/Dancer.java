package org.example.basic;
import static java.lang.Math.*;
import static java.lang.System.*;
import static org.example.basic.DanceLevel.*;
public abstract class Dancer extends Object{


    private final String crewName;
    private final String myName;
    private boolean stretch;
    private boolean flexible;
    private DanceLevel level = BEGINNER; //춤 수준


    public Dancer(String crewName, String myName) {
        this.crewName = crewName;
        this.myName = myName;

    }
    public Dancer(){
        this("기본크루","이름없음");
    }

    private void makeFlexible() {
        if (!stretch) {
            System.out.println("스트레칭 안해서 죽었습니다.");
            return;
        }
        System.out.println(myName + "님이 유연성 운동을 합니다.");
        this.flexible = true;
    }
    // 스트레칭
    private void stretch() {
        System.out.println(myName + "님이 스트레칭합니다.");
        this.stretch = true;
    }

    // 춤추기
    public abstract void dance();

    public String getCrewName() {
        return crewName;
    }

    public String getMyName() {
        return myName;
    }


}
