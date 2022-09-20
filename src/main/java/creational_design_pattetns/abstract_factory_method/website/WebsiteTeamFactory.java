package creational_design_pattetns.abstract_factory_method.website;

import creational_design_pattetns.abstract_factory_method.Developer;
import creational_design_pattetns.abstract_factory_method.ProjectManager;
import creational_design_pattetns.abstract_factory_method.ProjectTeamFactory;
import creational_design_pattetns.abstract_factory_method.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
