package creational_design_pattetns.factoryMethod;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer1 createDeveloper() {
        return new CppDeveloper1();
    }
}
