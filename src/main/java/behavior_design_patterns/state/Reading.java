package behavior_design_patterns.state;

public class Reading implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Reading book...");
    }
}