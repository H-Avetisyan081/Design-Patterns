package creational_design_pattetns.abstract_factory_method.banking;

import creational_design_pattetns.abstract_factory_method.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
