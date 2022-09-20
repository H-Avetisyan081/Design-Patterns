package creational_design_pattetns.abstract_factory_method.website;

import creational_design_pattetns.abstract_factory_method.Developer;

public class PhpDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes php code...");
    }
}
