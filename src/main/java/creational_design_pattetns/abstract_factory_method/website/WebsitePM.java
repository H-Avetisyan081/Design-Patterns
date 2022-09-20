package creational_design_pattetns.abstract_factory_method.website;

import creational_design_pattetns.abstract_factory_method.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages Website project....");
    }
}
