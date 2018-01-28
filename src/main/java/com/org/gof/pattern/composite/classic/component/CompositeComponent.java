package com.org.gof.pattern.composite.classic.component;

import java.util.ArrayList;
import java.util.List;

public class CompositeComponent extends Component {
    List<Component> components = null;

    public CompositeComponent() {
        components = new ArrayList<>();
    }

    public CompositeComponent(String name) {
        this();
        setName(name);
    }

    public void addChild(Component component) {
        this.components.add(component);
    }

    public void removeChild(Component component) {
        this.components.remove(component);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("composite component: " + getName() + "\n");
        for (Component component : components) {
            sb.append(component.toString());
        }

        return sb.toString();
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}
