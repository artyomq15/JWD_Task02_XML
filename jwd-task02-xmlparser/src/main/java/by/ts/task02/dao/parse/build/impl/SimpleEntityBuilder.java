package by.ts.task02.dao.parse.build.impl;

import by.ts.task02.dao.parse.build.BuilderCommand;
import by.ts.task02.dao.parse.helpaction.ParseHelper;
import by.ts.task02.entity.Entity;
import by.ts.task02.entity.SimpleEntity;

/**
 * Created by Lenovo on 10/26/2017.
 */
public class SimpleEntityBuilder implements BuilderCommand {
    @Override
    public Entity build(String tag) {
        SimpleEntity simpleEntity = new SimpleEntity();
        simpleEntity.setTag(ParseHelper.getNameTag(tag));
        simpleEntity.setAttributes(ParseHelper.getAttributes(tag));
        simpleEntity.setContent(ParseHelper.getContent(tag));
        return simpleEntity;
    }
}
