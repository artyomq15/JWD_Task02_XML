package by.ts.task02.runner;


import by.ts.task02.entity.Entity;
import by.ts.task02.service.EntityService;
import by.ts.task02.service.ServiceFactory;

public class Runner {
    public static void main(String[] args) {

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        EntityService entityService = serviceFactory.getEntityService();

        Entity entity = entityService.getStructure();

        PrintEntityStructure.printStructureToConsole(entity);

    }
}
