package behavior_design_patterns.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills ={"Java","Spring","Hibernate","Maven","PostgeSQL"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Hovhannes Avetisyan", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.print("Skills: ");

        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
