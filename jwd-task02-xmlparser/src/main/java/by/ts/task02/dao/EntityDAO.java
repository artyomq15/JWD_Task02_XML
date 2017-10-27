package by.ts.task02.dao;

import by.ts.task02.entity.Entity;
import by.ts.task02.exception.DAOException;

public interface EntityDAO {
    Entity parse() throws DAOException;
}
