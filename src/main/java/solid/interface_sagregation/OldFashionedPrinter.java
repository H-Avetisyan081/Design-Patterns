package solid.interface_sagregation;

public class OldFashionedPrinter implements Machine{
    @Override
    public void print(Document d) {

    }

    @Override
    public void fax(Document d) throws Exception {
     throw new Exception();
    }

    @Override
    public void scan(Document d) {

    }
}
