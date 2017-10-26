package by.ts.task02.entity;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ComplexEntity extends Entity {
    List<Entity> entities = new ArrayList<Entity>();

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

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public void addEntity(Entity entity){
        entities.add(entity);
    }

    @Override
    public String toString() {
        return super.toString() + "ComplexEntity{" +
                "entities=" + entities +
                '}';
    }
}
