package solid.open_closed_principle;

public class AndSpecification <T> implements Specification<T>{

    private Specification<T> first,second;

    public AndSpecification(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean IsSatisfied(T item) {
        return first.IsSatisfied(item) && second.IsSatisfied(item);
    }
}
