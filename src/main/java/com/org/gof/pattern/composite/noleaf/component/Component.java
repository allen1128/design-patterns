package com.org.gof.pattern.composite.noleaf.component;

import java.util.ArrayList;
import java.util.List;

public class Component {
    private List<Component> components;
    private String name;

    public Component() {
        components = new ArrayList<>();
        name = "";
    }

    public Component(String name) {
        this();
        this.name = name;
    }

    public void addChild(Component component){
        components.add(component);
    }

    public void removeChild(Component component) {
        components.remove(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        String title = "";
        if (components.size() == 0) {
            title = "leaf name";
        } else {
            title = "component name";
        }
        sb.append( title + ": " + name + "\n");

        for (Component comp : components) {
            sb.append(comp.toString());
        }

        return sb.toString();
    }
}
