package com.org.gof.pattern.composite.classic.component;

public class Leaf extends Component {

    public Leaf(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return "leaf name: " + getName() + "\n";
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
