/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 * Represents a person in the application
 * @author fredtriest
 */
public class Person {

    String id;

    // Creates a new person with the id
    public Person(String id) {

        this.id = id;
    }

    // Returns the person's id
    public String getPersonId() {
        return id;
    }

    // Returns true if id matches
    public boolean isMatch(String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }
    
    //Update persons Id/name
    public void setPersonId(String id) {
        if (id == null || id.isEmpty())
            return;
        this.id = id;
    }

    // Returns person's id as a string
    @Override
    public String toString() {
        return getPersonId();
    }
}
