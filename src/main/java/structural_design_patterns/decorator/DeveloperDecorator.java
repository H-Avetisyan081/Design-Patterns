package structural_design_patterns.decorator;

public class DeveloperDecorator implements Developer{
    Developer developer;
    @Override
    public String makeJob() {
        return developer.makeJob();
    }

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }
}
