public class InheritanceConceptMain {

    public static void main(String[] args) {

        System.out.println("Multiple and Hybrid Inheritance in Java");
        System.out.println("See comments in the program for explanation.");
    }

    /*
     * MULTIPLE INHERITANCE:
     *
     * Java does not allow a class to extend two classes.
     *
     * Invalid example:
     *
     * class A { }
     * class B { }
     *
     * class C extends A, B { }
     *
     * The above is not allowed in Java.
     *
     * This restriction avoids ambiguity when both parent classes
     * contain methods with the same name.
     *
     * HYBRID INHERITANCE:
     *
     * Hybrid inheritance is a combination of two or more
     * inheritance types, such as hierarchical and multilevel.
     *
     * Java commonly uses interfaces when multiple/hybrid
     * inheritance of type or behavior is required.
     *
     * However, interfaces are NOT implemented in this program
     * because the lab specifically asks for concept only.
     */
}