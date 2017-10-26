package by.ts.task02.dao.impl;

import by.ts.task02.dao.EntityDAO;
import by.ts.task02.dao.parse.Parser;
import by.ts.task02.entity.Entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntityDAOImpl implements EntityDAO {

    private BufferedReader FILE_PATH = new BufferedReader(
            new InputStreamReader(EntityDAOImpl.class.getResourceAsStream("/resources.xml")));

    @Override
    public Entity parse() {
        try (BufferedReader reader = FILE_PATH) {
            String line;
            Parser parser = new Parser();
            while ((line = reader.readLine()) != null) {
                parser.parseLine(line);
            }
            return parser.getEntity();


        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
