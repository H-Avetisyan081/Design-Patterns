package creational_design_pattetns.factoryMethod;

public class Program {
    public static void main(String[] args) {
      DeveloperFactory developerFactory = createDeveloperBySpeciality("python");
      Developer1 developer = developerFactory.createDeveloper();

      developer.writeCode();

    }
    static DeveloperFactory createDeveloperBySpeciality(String spec){
       if (spec.equalsIgnoreCase("java")){
           return new JavaDeveloperFactory();
       }else if (spec.equalsIgnoreCase("c++")){
           return new CppDeveloperFactory();
       } else if (spec.equalsIgnoreCase("python")){
        return new PythonDeveloperFactory();
    }
       else {
           throw new RuntimeException(spec + " is unknown");
       }
    }
}
