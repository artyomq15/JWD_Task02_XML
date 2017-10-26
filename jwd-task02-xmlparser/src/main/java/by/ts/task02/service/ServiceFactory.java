package by.ts.task02.service;


import by.ts.task02.service.impl.EntityServiceImpl;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final EntityService entityService = new EntityServiceImpl();

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public EntityService getEntityService() {
        return entityService;
    }
}
