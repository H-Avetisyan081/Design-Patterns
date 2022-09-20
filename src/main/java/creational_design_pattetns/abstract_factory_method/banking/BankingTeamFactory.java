package creational_design_pattetns.abstract_factory_method.banking;

import creational_design_pattetns.abstract_factory_method.Developer;
import creational_design_pattetns.abstract_factory_method.ProjectManager;
import creational_design_pattetns.abstract_factory_method.ProjectTeamFactory;
import creational_design_pattetns.abstract_factory_method.Tester;


public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
