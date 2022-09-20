package creational_design_pattetns.abstract_factory_method;

import creational_design_pattetns.abstract_factory_method.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating auction web site.... ");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
