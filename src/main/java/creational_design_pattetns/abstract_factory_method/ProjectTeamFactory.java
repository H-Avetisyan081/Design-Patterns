package creational_design_pattetns.abstract_factory_method;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();

}
