package ro.digitalnation.Books.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/myFirstApi")
    public String myFirstApi(){
        return "Hello Postman";
    }
}
