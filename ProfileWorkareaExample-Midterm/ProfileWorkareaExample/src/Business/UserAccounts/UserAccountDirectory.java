/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import Business.Profiles.Profile;

import java.util.ArrayList;

/**
 * Stores all UserAccount objects
 * @author fredtriest
 */
public class UserAccountDirectory {
    
      ArrayList<UserAccount> useraccountlist ;
    
      public UserAccountDirectory (){
          
       useraccountlist = new ArrayList();

    }

    // Creates new user account and adds to directory
    public UserAccount newUserAccount(Profile p, String un, String pw) {

        UserAccount ua = new UserAccount (p,  un,  pw);
        useraccountlist.add(ua);
        return ua;
    }

    // Finds and returns a user account by person id
    public UserAccount findUserAccount(String id) {

        for (UserAccount ua : useraccountlist) {

            if (ua.isMatch(id)) {
                return ua;
            }
        }
            return null; //not found after going through the whole list
         }
    
    // Returns user account if login details are valid, null otherwise
    public UserAccount AuthenticateUser(String un, String pw) {
         
        if (un == null || pw == null)
             return null;
        for (UserAccount ua : useraccountlist) {

            if (ua.IsValidUser(un, pw)) {
                return ua;
            }
        }
            return null; //not found after going through the whole list
         } 
    
    // Returns list of all user accounts
    public ArrayList<UserAccount> getUserAccountList()
     {
         return useraccountlist;
     }
     
     // Removes a user from the directory
    public void removeUserAccount(UserAccount ua) {
         if (ua == null)
             return;
         useraccountlist.remove(ua);
     }
}
