package com.practicasemana6.practicasemana6;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/intro")
public class WebController {
    @GetMapping()
    public String index(){
        return "index";
    }
}
