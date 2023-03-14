package week11;
@FunctionalInterface
public interface TestFunctionalInterface {

    int apply(int n); // ==> it is abstract method without curly braces

    // String print (String s); we can not add second abstract method to functional interface.
    //in regular interface we can add as much as we want.

}
