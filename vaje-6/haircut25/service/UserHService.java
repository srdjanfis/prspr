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

    public String authUser(UserH userH) {
        for(UserH u: userList) {
            if(u.getUsername().equals(userH.getUsername()) &&
               u.getPassword().equals(userH.getPassword())){
                return "Uporabnik je uspešno prijavljen.";
            }
        }
        return "Takega uporabnika ni.";
    }

    public ArrayList<UserH> getUserHs(){
        return userList;
    }

    public void addUserH(UserH userH){
        userList.add(userH);
    }

    public String updateUserH(String username,
                              UserH userH){
        for (UserH u : userList) {
            if (u.getUsername().equals(username)) {
                u.setPassword(userH.getPassword());
                return "Geslo je uspešno posodobljeno";
            }
        }
        return "Takšnega uporabnika ni.";
    }

    public String deleteUserH(String username){
        if(userList.removeIf(user -> user.getUsername().equals(username))){
            return "Uporabnik je izbrisan.";
        }else{
            return "Takšnega uporabnika ni.";
        }
    }
    
}
