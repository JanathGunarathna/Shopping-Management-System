package Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/User")
@CrossOrigin
public class UserController {
    @GetMapping("/getUser")
    public String getUser(){
        return "hello";

    }
}
