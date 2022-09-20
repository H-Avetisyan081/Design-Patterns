package creational_design_pattetns.factoryMethod;

public class PythonDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer1 createDeveloper() {
        return new PythonDeveloper1();
    }
}
