package creational_design_pattetns.abstract_factory_method.banking;

import creational_design_pattetns.abstract_factory_method.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {

        System.out.println("Banking PM manages banking project...");
    }
}
