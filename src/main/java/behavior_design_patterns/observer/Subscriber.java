package behavior_design_patterns.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear" + name + "\n We have some changes in vacancies: \n" + vacancies );
        System.out.println();
    }
}
