package behavior_design_patterns.state;

public class Sleeping implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Sleeping......");
    }
}
