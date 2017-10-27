package by.ts.task02.runner;


import by.ts.task02.entity.ComplexEntity;
import by.ts.task02.entity.Entity;
import by.ts.task02.entity.SimpleEntity;

public class PrintEntityStructure {
    public static void printStructureToConsole(Entity entity){
        String result = getTagAndAttributesToString(entity);

        if (entity instanceof SimpleEntity){
            result+=" : " + ((SimpleEntity) entity).getContent();
            System.out.println(result);
        } else {
            System.out.println(result);
            if (entity instanceof ComplexEntity){
                for (Entity entireComplexEntity : ((ComplexEntity) entity).getEntities()){
                    printStructureToConsole(entireComplexEntity);
                }
            }
        }
    }

    private static String getTagAndAttributesToString(Entity entity){
        String result = printTabs(entity.getDepth());
        result+=entity.getTag();
        String attributes = "";
        for (String key:entity.getAttributes().keySet()){
            attributes += "[ " + key + "=\"" + entity.getAttributes().get(key) + "\" ]";
        }
        result+=attributes;
        return result;
    }

    private static String printTabs(int depth) {
        String result = "";
        for (int i = 0; i < depth - 1; i++) {
            result += "\t";
        }
        return result;
    }
}
