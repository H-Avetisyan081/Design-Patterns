package structural_design_patterns.decorator;

public class JavaTeamLead extends DeveloperDecorator{
    @Override
    public String makeJob() {
        System.out.println("Team lead ");
        return super.makeJob()+ sendWeekReport();
    }

    public JavaTeamLead(Developer developer) {
        super(developer);
    }
    public String sendWeekReport(){
        return " Send week report to customer";
    }

}
