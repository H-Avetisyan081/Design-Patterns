package behavior_design_patterns.strategy;

public class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Reading book...");
    }
}
