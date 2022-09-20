package solid.open_closed_principle;

public interface Specification <T>{
    boolean IsSatisfied(T item);
}
