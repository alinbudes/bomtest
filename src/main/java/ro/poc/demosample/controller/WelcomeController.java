package ro.poc.demosample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping
    public ResponseEntity<String> welcome(){
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        String format1 = format.format(new Date());
        return ResponseEntity.ok(format1);
    }
}
