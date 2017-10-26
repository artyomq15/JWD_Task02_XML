package by.ts.task02.entity;

import java.util.Map;

/**
 * Created by Lenovo on 10/25/2017.
 */
public abstract class Entity {
    private String tag;
    private Map<String, String> attributes;

    private int depth;

    public Entity(){}

    public Entity(String tag){
        this.tag = tag;
    }

    public Entity(String tag, Map<String, String> attributes){
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

    public void addAttribute(String name, String value){
        attributes.put(name,value);
    }

    @Override
    public String toString() {
        return  tag;
        /*return "Entity{" +
                "tag='" + tag + '\'' +
                ", attributes=" + attributes +
                ", depth=" + depth +
                '}';*/
    }
}
