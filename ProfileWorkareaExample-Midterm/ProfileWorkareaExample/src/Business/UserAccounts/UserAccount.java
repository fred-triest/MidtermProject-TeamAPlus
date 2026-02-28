/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import Business.Profiles.Profile;



/**
 * Represents a user account with login details and related profile
 * @author fredtriest
 */
public class UserAccount {
    
    Profile profile;
    String username;
    String password;
    
    // Creates user account with profile, username, and password
    public UserAccount (Profile profile, String un, String pw){
        
        username = un;
        password = pw;
        this.profile = profile;

    }

    // Returns the person's id from the related profile
    public String getPersonId(){
        return profile.getPerson().getPersonId();
    }
    
    // Returns username
    public String getUserLoginName(){
        return username;
    }

    // Returns true if person id matches
    public boolean isMatch(String id){
        
        if(getPersonId().equals(id)) return true;
            return false;
    }
    
    // Returns true if username and pw are valid
    public boolean IsValidUser(String un, String pw){
        
        if (username.equalsIgnoreCase(un) && password.equals(pw)) return true;
            else return false;
        
    }
    
    // Returns the role from related profile
    public String getRole(){
        
        return profile.getRole();
    }
        
    // Returns the profile linked to this account
    public Profile getAssociatedPersonProfile(){
        
        return profile;
    }
    
    // Updates login username
    public void setUserLoginName(String newUsername) {
        
        this.username = newUsername;
    }
    
    // Updates user password
    public void setPassword(String newPassword) {
        if (newPassword == null || newPassword.isEmpty())
            return;
        this.password = newPassword;
    }
    
    // Gets password for admin view to update password
    public String getPassword() {
        return password;
    }
       
    // Returns the username as string
    @Override
    public String toString(){
            
        return getUserLoginName();
    }
        
}

