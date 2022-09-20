package solid.interface_sagregation;

public class MultifunctionPrinter implements Machine {

    private final Printer printer;
    private final Scanner scanner;
    private final Fax fax;

    public MultifunctionPrinter(Printer printer, Scanner scanner, Fax fax) {
        this.printer = printer;
        this.scanner = scanner;
        this.fax = fax;
    }

    @Override
    public void print(Document d) {
        printer.print(d);
    }

    @Override
    public void fax(Document d) {
        fax.fax(d);
    }

    @Override
    public void scan(Document d) {
        scanner.scan(d);
    }
}
