package by.ts.task02.service.impl;

import by.ts.task02.dao.DAOFactory;
import by.ts.task02.dao.EntityDAO;
import by.ts.task02.entity.Entity;
import by.ts.task02.service.EntityService;


public class EntityServiceImpl implements EntityService {
    @Override
    public Entity getStructure() {
        DAOFactory daoFactory = DAOFactory.getInstance();
        EntityDAO entityDAO = daoFactory.getEntityDAO();

        Entity entity = entityDAO.parse();

        return entity;
    }
}
