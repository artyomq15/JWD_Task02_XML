package by.ts.task02.entity;


public class SimpleEntity extends Entity {
    String content;

    public SimpleEntity(){}

    public SimpleEntity(String name, String content){
        super(name);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + content;
    }
}
