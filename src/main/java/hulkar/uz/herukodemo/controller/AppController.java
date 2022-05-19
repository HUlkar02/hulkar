package hulkar.uz.herukodemo.controller;

import hulkar.uz.herukodemo.entity.User;
import hulkar.uz.herukodemo.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Hulkar,
 * @time чт 11:09.
 * @project 19.05.2022
 */
@RestController
@RequestMapping("/api/task")
public class AppController {

    @Autowired
    UserRepository repository;



    @PostMapping
    public HttpEntity<?> add(@RequestBody User user) {
        repository.save(user);
        return ResponseEntity.ok("Student Added");
    }

    @GetMapping("/getStudent/{id}")
    public HttpEntity<?> send(@PathVariable Long id) {
        Optional<User> byId = repository.findById(id);
        if (byId.isPresent())
            return ResponseEntity.ok(byId.get());
        return ResponseEntity.ok("Not found");
    }
}
