package creational_design_pattetns.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VisitCardWebsiteBuilder());
//        director.setBuilder(new EnterpriseWebsiteBuilder());
        Website website = director.buildWebsite();
//        Website website1 = director.buildWebsite();

        System.out.println(website);
//        System.out.println(website1);
    }
}
