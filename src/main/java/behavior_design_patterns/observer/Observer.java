package behavior_design_patterns.observer;

import java.util.List;

public interface Observer {
    public void handleEvent(List<String> vacancies);
}
