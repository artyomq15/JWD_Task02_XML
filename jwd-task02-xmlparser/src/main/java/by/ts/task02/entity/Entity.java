package by.ts.task02.entity;

import java.util.Map;

public abstract class Entity {
    private String tag;
    private Map<String, String> attributes;
    private int depth;

    public Entity() {
    }

    public Entity(String tag) {
        this.tag = tag;
    }

    public Entity(String tag, Map<String, String> attributes) {
        this.tag = tag;
        this.attributes = attributes;
    }


    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public void addAttribute(String name, String value) {
        attributes.put(name, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entity)) return false;

        Entity entity = (Entity) o;

        if (depth != entity.depth) return false;
        if (tag != null ? !tag.equals(entity.tag) : entity.tag != null) return false;
        return attributes != null ? attributes.equals(entity.attributes) : entity.attributes == null;

    }

    @Override
    public int hashCode() {
        int result = tag != null ? tag.hashCode() : 0;
        result = 31 * result + (attributes != null ? attributes.hashCode() : 0);
        result = 31 * result + depth;
        return result;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "tag='" + tag + '\'' +
                ", attributes=" + attributes +
                ", depth=" + depth +
                '}';
    }
}
