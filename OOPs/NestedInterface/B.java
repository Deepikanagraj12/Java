package NestedInterface;

public class B implements A.NestedInterface {
    @Override
    public String name(String n) {
        return n;

    }
}
