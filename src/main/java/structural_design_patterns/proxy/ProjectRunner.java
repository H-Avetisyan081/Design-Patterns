package structural_design_patterns.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/H-Avetisyan081/Design-Patterns");
        project.run();
    }
}
