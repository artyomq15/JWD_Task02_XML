package by.ts.task02.entity;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ComplexEntity extends Entity {
    LinkedList<Entity> entities = new LinkedList<>();

    public ComplexEntity(){}

    public ComplexEntity(String name){
        super(name);
    }

    public ComplexEntity(String tag, Map<String, String> attributes) {
        super(tag, attributes);

    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(LinkedList<Entity> entities) {
        this.entities = entities;
    }

    public void addEntity(Entity entity){
        entities.addFirst(entity);
    }

    @Override
    public String toString() {
        return super.toString() + entities;
    }
}
