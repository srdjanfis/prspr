package si.unm.fis.prspr.haircut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import si.unm.fis.prspr.haircut.service.UserHService;

@RestController
@RequestMapping("/user")
public class UserHController {

    @Autowired
    private UserHService userHService;
    

    @GetMapping("/authenticate")
	public String authUser(@RequestParam String username,
						   @RequestParam String password) {
		return userHService.authUser(username, password);
	}
}
