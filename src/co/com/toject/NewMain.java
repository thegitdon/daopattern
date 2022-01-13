/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.toject;

import co.com.toject.dao.PTestDao;
import co.com.toject.dao.impl.PTestDaoImpl;
import co.com.toject.model.PTest;

/**
 *
 * @author ronald.giron
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        PTest p = new PTest();
        //p.setId(5);
        //p.setName("Mireya");

        PTestDao pT = new PTestDaoImpl();
        //pT.toAdd(p);
        //pT.toDel(p);

        for (PTest pp : pT.toList()) {
            System.out.println(pp.getId() + ", " + pp.getName() + ", " + pp.getEmail());
        }
    }

    //https://www.tutorialspoint.com/design_pattern/data_access_object_pattern.htm
    //https://www.baeldung.com/java-dao-pattern
    //https://www.roseindia.net/tutorial/java/jdbc/dao-in-java.html
    //https://www.oracle.com/java/technologies/data-access-object.html
    //https://stackoverflow.com/questions/19154202/data-access-object-dao-in-java
}
