package by.ts.task02.dao.parse.build.impl;


import by.ts.task02.dao.parse.build.BuilderCommand;
import by.ts.task02.dao.parse.helpaction.ParseHelper;
import by.ts.task02.entity.ComplexEntity;
import by.ts.task02.entity.Entity;

public class ComplexEntityBuilder implements BuilderCommand {
    @Override
    public Entity build(String tag) {
        ComplexEntity complexEntity = new ComplexEntity();
        complexEntity.setTag(ParseHelper.getNameTag(tag));
        complexEntity.setAttributes(ParseHelper.getAttributes(tag));
        return complexEntity;
    }
}
