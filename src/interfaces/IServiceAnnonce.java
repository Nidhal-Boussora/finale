/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entities.annonce;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author FOCUS
 */
public interface IServiceAnnonce {
    public void addAnnonce(annonce a) throws SQLException;
    
    public ArrayList<annonce> getPersons() throws SQLException;
    
    public void updatePerson(annonce a) throws SQLException;
    
    public void deletePerson(annonce a) throws SQLException;

    
}
