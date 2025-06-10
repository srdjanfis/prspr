package si.unm.fis.prspr.haircut.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import si.unm.fis.prspr.haircut.model.UserH;

@Service
public class UserHService {
    ArrayList<UserH> userList = new ArrayList<>();
    
    public UserHService() {
        userList.add(new UserH("janez","janez1"));
        userList.add(new UserH("maja","maja1"));
        userList.add(new UserH("klara","klara2"));
    }

    public String authUser(String username,
                           String password) {
        for(UserH u: userList) {
            if(u.getUsername().equals(username) &&
               u.getPassword().equals(password)){
                return "Uporabnik je uspešno prijavljen.";
            }
        }
        return "Takega uporabnika ni.";
    }
    
}
