package by.ts.task02.dao.parse;

import by.ts.task02.dao.parse.constants.TagConstants;
import by.ts.task02.entity.ComplexEntity;
import by.ts.task02.entity.Entity;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private final int ALLOWABLE_DIFFERENCE_IN_DEPTH = 1;
    private TagStack tagStack = new TagStack();
    private Stack<Entity> entities = new Stack<>();


    public void parseLine(String line) {
        Pattern pattern = Pattern.compile(TagConstants.ANY_TAG_OR_CONTENT);
        Matcher matcher = pattern.matcher(line.trim());

        while (matcher.find()) {
            String tag = matcher.group();
            Entity entity = tagStack.getEntityFromTag(tag);
            if (entity != null) {
                handleEntity(entity);
            }
        }
    }

    private void handleEntity(Entity entity) {
        if (entities.isEmpty() || entity.getDepth() == entities.peek().getDepth()) {
            entities.add(entity);
        } else {
            while (!entities.isEmpty() && entities.peek().getDepth() - entity.getDepth() == ALLOWABLE_DIFFERENCE_IN_DEPTH) {
                ((ComplexEntity) entity).addEntity(entities.pop());
            }
            entities.add(entity);
        }
    }

    public Entity getEntity() {
        return entities.pop();
    }
}
