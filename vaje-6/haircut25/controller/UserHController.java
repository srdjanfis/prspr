package si.unm.fis.prspr.haircut.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import si.unm.fis.prspr.haircut.model.UserH;
import si.unm.fis.prspr.haircut.service.UserHService;

@RestController
@RequestMapping("/user")
public class UserHController {

    private final UserHService userHService;
    
	public UserHController(UserHService userHService){
		this.userHService = userHService;
	}

    @PostMapping("/auth")
	public String authUser(@RequestBody UserH userH) {
		return userHService.authUser(userH);
	}

	@GetMapping("/getUsers")
	public ArrayList<UserH> getUsers() {
		return userHService.getUserHs();
	}

	@PostMapping("/addUser")
	public void addUser(@RequestBody UserH userH) {
		userHService.addUserH(userH);
	}

	@PutMapping("updateUser/{username}")
	public String updateUserH(@PathVariable String username, 
								@RequestBody UserH userH) {
		return userHService.updateUserH(username, userH);
	}

	@DeleteMapping("/deleteUser/{username}")
	public String getMethodName(@PathVariable String username) {
		return userHService.deleteUserH(username);
	}

}
