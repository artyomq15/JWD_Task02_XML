package by.ts.task02.dao.impl;

import by.ts.task02.dao.EntityDAO;
import by.ts.task02.dao.parse.Parser;
import by.ts.task02.entity.Entity;
import by.ts.task02.exception.DAOException;
import by.ts.task02.exception.message.DAOExceptionMessage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class EntityDAOImpl implements EntityDAO {
    private final String FILE_PATH = "/resources.xml";
    private final InputStream UNIQUE_FILE_PATH = EntityDAOImpl.class.getResourceAsStream(FILE_PATH);

    @Override
    public Entity parse() throws DAOException {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(UNIQUE_FILE_PATH))) {
            String line;
            Parser parser = new Parser();
            while ((line = reader.readLine()) != null) {
                parser.parseLine(line);
            }
            return parser.getEntity();
        } catch (IOException e) {
            throw new DAOException(DAOExceptionMessage.IO_EXCEPTION, e);
        } catch (Exception e) {
            throw new DAOException(DAOExceptionMessage.EXCEPTION, e);
        }

    }
}
