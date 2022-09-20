package solid.dependency_inversion_principle;

import java.util.List;

//  high-level
public class Research {
//    public Research(Relationships relationships) {
//        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
//        relations.stream()
//                .filter(x -> x.getValue0().name.equals("John")
//                        && x.getValue1() == Relationship.PARENT)
//                .forEach(ch-> System.out.println(
//                        "John has a child called " + ch.getValue2().name
//                ));
//    }

    public Research(RelationshipBrowser browser){
        List<Person> children = browser.findAllChildrenOf("John");
        for (Person child : children) {
            System.out.println("John has a child called " + child.name);
        }
    }

    public static void main(String[] args) {
        Person parent = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Camilla");

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent,child1);
        relationships.addParentAndChild(parent,child2);

        new Research(relationships);
    }
}
