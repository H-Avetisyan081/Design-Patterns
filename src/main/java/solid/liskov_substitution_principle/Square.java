package solid.liskov_substitution_principle;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(int size) {
        width = height = size;
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setWidth(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setHeight(height);
    }

}
