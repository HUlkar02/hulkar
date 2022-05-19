package hulkar.uz.herukodemo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Hulkar,
 * @time чт 11:09.
 * @project 19.05.2022
 */
@RestController
@RequestMapping("/api/task")
public class AppController {


    public List<String> list;

    @PostMapping
    public String get(@RequestParam String text){
        list.add(text);
        return "Added";
    }

    @GetMapping("/{name}")
    public  String send(@PathVariable String name){
        return "Hello " + name;
    }
}
