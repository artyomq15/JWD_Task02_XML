package by.ts.task02.entity;


import java.util.Map;

public class EmptyElementEntity extends Entity {
    public EmptyElementEntity() {
    }

    public EmptyElementEntity(String tag) {
        super(tag);
    }

    public EmptyElementEntity(String tag, Map<String, String> attributes) {
        super(tag, attributes);
    }

    @Override
    public String toString() {
        return "EmptyElementEntity{}";
    }
}
