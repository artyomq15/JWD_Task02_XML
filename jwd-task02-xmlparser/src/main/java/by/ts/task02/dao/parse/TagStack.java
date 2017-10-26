package by.ts.task02.dao.parse;

import by.ts.task02.dao.parse.build.BuilderDirector;
import by.ts.task02.dao.parse.constants.TagConstants;
import by.ts.task02.entity.Entity;

import java.util.Stack;

public class TagStack {
    private final int FIRST_POSITION = 0;
    private final String SPACE = " ";

    private BuilderDirector builderDirector = new BuilderDirector();

    private Stack<String> tags = new Stack<>();
    private int stackDepth = 0;


    public TagStack() {
    }

    public Entity getEntityFromTag(String tag) {
        if (tag.matches(TagConstants.OPEN_TAG)) {
            tags.add(tag);
            stackDepth++;
            return null;
        }
        if (tag.matches(TagConstants.CLOSE_TAG)) {
            String content = concatContent();

            if (isSimpleEntity(content)) {
                Entity entity = builderDirector.getBuilder("SIMPLE_TAG").build(getSimpleOpenTagWithContent(content));
                entity.setDepth(stackDepth--);
                return entity;
            } else {
                Entity entity = builderDirector.getBuilder("COMPLEX_TAG").build(getComplexOpenTag());
                entity.setDepth(stackDepth--);
                return entity;
            }
        }
        if (tag.matches(TagConstants.SELF_CLOSING_TAG)) {
            Entity entity = builderDirector.getBuilder("SELF_CLOSING_TAG").build(tag);
            entity.setDepth(stackDepth + 1);
            return entity;
        }
        if (tag.matches(TagConstants.XML_TAG)) {
            return null;
        } else {
            tags.add(tag);
            return null;
        }
    }

    private boolean isSimpleEntity(String content) {
        return !content.isEmpty();
    }

    private String getSimpleOpenTagWithContent(String content) {
        return tags.pop() + content.trim();
    }

    private String getComplexOpenTag() {
        return tags.pop();
    }


    private String concatContent() {
        StringBuilder content = new StringBuilder();
        while (!tags.peek().matches(TagConstants.OPEN_TAG)) {
            content.insert(FIRST_POSITION, tags.pop() + SPACE);
        }
        return content.toString();
    }
}
