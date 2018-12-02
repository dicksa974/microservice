package com.egokia.microservice.api;

import com.egokia.microservice.intercomm.UserClient;
import com.egokia.microservice.model.Client;
import com.egokia.microservice.model.User;
import com.egokia.microservice.repositories.ClientsRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Aounetse vincent on 28/11/2018.
 */
@RestController
@RequestMapping("/")
public class ClientController {

    @Autowired
    private UserClient userClient;

    @Autowired
    private ClientsRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Client> getAllClient() {

        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Client getClientById(@PathVariable("id") ObjectId id) {

        return repository.findBy_id(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyClientById(@PathVariable("id") ObjectId id, @Valid
    @RequestBody Client client) {
        client.set_id(id);
        repository.save(client);
    }


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Client createClient(@Valid @RequestBody Client client) {
        client.set_id(ObjectId.get());
        User user = client.getUser();
        userClient.createUser(user);
        repository.save(client);
        return client;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteClient(@PathVariable ObjectId id) {
        repository.delete(repository.findBy_id(id));
    }
}
