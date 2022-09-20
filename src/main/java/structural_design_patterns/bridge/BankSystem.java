package structural_design_patterns.bridge;

public class BankSystem extends Program{
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system in progress");
        developer.writeCode();
    }
}
