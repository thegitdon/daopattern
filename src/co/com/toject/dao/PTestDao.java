/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.toject.dao;

import co.com.toject.model.PTest;
import java.util.List;

/**
 *
 * @author ronald.giron
 */
public interface PTestDao {

    //CRUD
    public void toAdd(PTest x);

    public List<PTest> toList();

    public void toUpd(PTest x);

    public void toDel(PTest x);

}
