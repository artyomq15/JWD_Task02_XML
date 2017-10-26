package by.ts.task02.dao.parse;

import by.ts.task02.entity.Entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private TagStack tagStack = new TagStack();

    private Map<Integer, Entity> entities = new HashMap<>();


    public void parseLine(String line){
        Pattern pattern = Pattern.compile(TagConstants.FINDER);
        Matcher matcher = pattern.matcher(line.trim());

        while (matcher.find()){
            String tag = matcher.group();
            Entity entity = tagStack.handleTag(tag);
            if (entity!=null){
                System.out.println(entity.toString());

                //проверка по мапе
            }

        }


    }



    public void addEntity(int depth, Entity entity){

    }

    public Entity getEntity(){
        return null;
    }
}
