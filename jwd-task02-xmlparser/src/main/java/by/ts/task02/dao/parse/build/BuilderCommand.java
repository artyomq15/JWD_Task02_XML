package by.ts.task02.dao.parse.build;

import by.ts.task02.entity.Entity;


public interface BuilderCommand {
    Entity build(String tag);
}
