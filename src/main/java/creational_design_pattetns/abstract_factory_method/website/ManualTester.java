package creational_design_pattetns.abstract_factory_method.website;

import creational_design_pattetns.abstract_factory_method.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website....");
    }
}
