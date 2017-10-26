package by.ts.task02.runner;


import by.ts.task02.dao.DAOFactory;
import by.ts.task02.dao.EntityDAO;
import by.ts.task02.dao.parse.helpaction.ParseHelper;
import by.ts.task02.entity.ComplexEntity;
import by.ts.task02.entity.EmptyElementEntity;
import by.ts.task02.entity.Entity;
import by.ts.task02.entity.SimpleEntity;

import java.util.Deque;
import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {

        DAOFactory instance = DAOFactory.getInstance();
        EntityDAO entityDAO = instance.getEntityDAO();

        System.out.println(entityDAO.parse());

    }
}
