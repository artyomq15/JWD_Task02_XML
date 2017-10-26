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

       /* StringBuilder string = new StringBuilder("dima");
        string.insert(0, "hyi");
        System.out.println(string);
        ComplexEntity complexEntity= new ComplexEntity("www");
        SimpleEntity simpleEntity = new SimpleEntity("eee", "ddd");
        ComplexEntity c = new ComplexEntity("dudko");

        complexEntity.addEntity(c);
        complexEntity.addEntity(simpleEntity);
        Entity siii = complexEntity.getEntities().get(0);
        if (siii instanceof SimpleEntity){
            SimpleEntity si =(SimpleEntity) siii;
            System.out.println(si);
        } else if (siii instanceof ComplexEntity){
            ComplexEntity co = (ComplexEntity)siii;
            System.out.println(co);
        } else {
            EmptyElementEntity eee = (EmptyElementEntity)siii;
            System.out.println(eee);
        }
*/
        DAOFactory instance = DAOFactory.getInstance();
        EntityDAO entityDAO = instance.getEntityDAO();
        System.out.println(entityDAO.parse());

        /*System.out.println(ParseHelper.getAttributes("<tag ddd=\"123\" dd=\"23\" d=\"   \">"));
        System.out.println(ParseHelper.getNameTag("<tag ddd=\"123\">"));
        System.out.println(ParseHelper.getContent("<tag ddd=\"123\">    666KEKEKE   KEKEK50"));*/

    }
}
