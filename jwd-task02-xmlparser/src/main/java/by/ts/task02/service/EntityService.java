package by.ts.task02.service;

import by.ts.task02.entity.Entity;
import by.ts.task02.exception.ServiceException;

public interface EntityService {
    Entity getStructure() throws ServiceException;
}
