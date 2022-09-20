package creational_design_pattetns.factoryMethod;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer1 createDeveloper() {
        return new JavaDeveloper1();
    }
}
