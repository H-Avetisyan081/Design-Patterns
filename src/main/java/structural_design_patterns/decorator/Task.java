package structural_design_patterns.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new SeniorJavaDeveloper(new JavaDeveloper());
        Developer teamLead = new JavaTeamLead(new JavaDeveloper());
        System.out.println(developer.makeJob());
        System.out.println(teamLead.makeJob());

    }
}
