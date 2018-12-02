package com.egokia.microservice.intercomm;

import com.egokia.microservice.model.User;
import org.bson.types.ObjectId;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Aounetse vincent on 28/11/2018.
 */
@FeignClient("users-service")
public interface UserClient {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    List<User> getUsers();

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    User getUser(@PathVariable("id") ObjectId id);

    @RequestMapping(method = RequestMethod.POST, value = "/")
    User createUser(@Valid @RequestBody User user);

}
