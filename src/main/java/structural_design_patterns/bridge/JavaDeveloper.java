package structural_design_patterns.bridge;

public class JavaDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code");
    }
}
