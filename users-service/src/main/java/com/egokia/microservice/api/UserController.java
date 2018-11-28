package com.egokia.microservice.api;

import com.egokia.microservice.model.User;
import com.egokia.microservice.repositories.UsersRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Aounetse vincent on 27/11/2018.
 */
@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UsersRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getAllUser() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") ObjectId id) {
        return repository.findBy_id(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyUserById(@PathVariable("id") ObjectId id, @Valid
    @RequestBody User user) {
        user.setId(id);
        repository.save(user);
    }


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public User createPet(@Valid @RequestBody User user) {
        user.setId(ObjectId.get());
        repository.save(user);
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable ObjectId id) {
        repository.delete(repository.findBy_id(id));
    }
}
