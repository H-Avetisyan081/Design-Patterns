package structural_design_patterns.facade;

public class SprintRunner {
    public static void main(String[] args) {
        WorkFlow workFlow = new WorkFlow();
        workFlow.solveProblem();
        System.out.println("======================================");
        workFlow.problemSolved();
    }
}
