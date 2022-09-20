package structural_design_patterns.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make code review.";
    }

    @Override
    public String makeJob() {
        System.out.println("Senior developer");
        return super.makeJob()+makeCodeReview();
    }

}
