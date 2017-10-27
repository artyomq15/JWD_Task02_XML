package by.ts.task02.service.impl;

import by.ts.task02.dao.DAOFactory;
import by.ts.task02.dao.EntityDAO;
import by.ts.task02.entity.Entity;
import by.ts.task02.exception.DAOException;
import by.ts.task02.exception.ServiceException;
import by.ts.task02.exception.message.ServiceExceptionMessage;
import by.ts.task02.service.EntityService;


public class EntityServiceImpl implements EntityService {
    @Override
    public Entity getStructure() throws ServiceException{
        DAOFactory daoFactory = DAOFactory.getInstance();
        EntityDAO entityDAO = daoFactory.getEntityDAO();

        Entity entity;
        try{
            entity = entityDAO.parse();
        } catch (DAOException e){
            throw new ServiceException(e.getMessage(), e);
        } catch (Exception e){
            throw new ServiceException(ServiceExceptionMessage.SERVICE_EXCEPTION, e);
        }
        return entity;
    }
}
