package structural_design_patterns.facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("Developer is solving problem...");
        }else {
            System.out.println("Developer is reading materials...");
        }
    }
}
