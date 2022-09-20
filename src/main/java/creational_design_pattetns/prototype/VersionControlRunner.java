package creational_design_pattetns.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1,"SuperProject","SourceCode = new SourceCode");
        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println("===========================");
        System.out.println(masterClone);
    }
}
