package by.ts.task02.entity;


public class SimpleEntity extends Entity {
    String content;

    public SimpleEntity() {
    }

    public SimpleEntity(String name, String content) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleEntity)) return false;
        if (!super.equals(o)) return false;

        SimpleEntity that = (SimpleEntity) o;

        return content != null ? content.equals(that.content) : that.content == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SimpleEntity{" +
                "content='" + content + '\'' +
                '}';
    }
}
