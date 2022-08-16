package co.develhope.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@ResponseBody
public class NameController {

@GetMapping("/name")
    public String getName(){
    return "OMAIMA";
}


            @PostMapping("/reversedName")
            public String postName(){
    StringBuilder builder = new StringBuilder("omaima");
           StringBuilder reverse = builder.reverse();
           return"Reversed string :" + reverse;
        }
    }



