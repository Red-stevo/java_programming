package com.stevemuishwebprojo.myfirstwebprogject.WebContollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class MomController {

    @ResponseBody()
    @GetMapping("/sugar")
    public String giveMeSugar()
    {
        return "sugar";
    }



    @ResponseBody
    @GetMapping("/mangoes")
    public String giveMeMangoes()
    {
        return "Here are Your mangoes.";
    }

    @ResponseBody
    @GetMapping("/books")
    public String giveMeBooks()
    {
        return "There are no books today mr Ndabaci.";
    }
}
