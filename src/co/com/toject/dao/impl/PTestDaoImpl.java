/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.toject.dao.impl;

import co.com.toject.Conn;
import co.com.toject.dao.PTestDao;
import co.com.toject.model.PTest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ronald.giron
 */
public class PTestDaoImpl extends Conn implements PTestDao {

    @Override
    public void toAdd(PTest x) {

        try {
            PreparedStatement pS = toConnect().prepareStatement("INSERT INTO ptest (name, email) VALUES(?, ?)");
            pS.setString(1, x.getName());
            pS.setString(2, x.getEmail());
            pS.executeUpdate();
            System.out.println(":)");
            pS.close();
        } catch (SQLException ex) {
            Logger.getLogger(PTestDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<PTest> toList() {

        List<PTest> lTest = new ArrayList<>();

        //List<PTest> lTest = null;
        try {
            PreparedStatement pS = toConnect().prepareStatement("SELECT * FROM ptest");
            //lTest = new ArrayList<>();

            ResultSet rS = pS.executeQuery();
            while (rS.next()) {
                PTest pT = new PTest();
                pT.setId(rS.getInt(1));
                pT.setName(rS.getString(2));
                pT.setEmail(rS.getString(3));
                lTest.add(pT);

            }
            pS.close();
        } catch (SQLException ex) {
            Logger.getLogger(PTestDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lTest;
    }

    @Override
    public void toUpd(PTest x) {

        try {
            PreparedStatement pS = toConnect().prepareStatement("UPDATE ptest SET name = ?, email = ? WHERE id = ?");
            pS.setString(1, x.getName());
            pS.setString(2, x.getEmail());
            pS.setInt(3, x.getId());
            pS.executeUpdate();
            System.out.println(":)");
            pS.close();
        } catch (SQLException ex) {
            Logger.getLogger(PTestDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void toDel(PTest x) {

        try {
            PreparedStatement pS = toConnect().prepareStatement("DELETE FROM ptest WHERE id = ?");
            pS.setInt(1, x.getId());
            pS.executeUpdate();
            System.out.println(":)");
            pS.close();
        } catch (SQLException ex) {
            Logger.getLogger(PTestDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
