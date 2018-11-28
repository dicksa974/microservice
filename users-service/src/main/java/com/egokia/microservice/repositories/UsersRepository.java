package com.egokia.microservice.repositories;

import com.egokia.microservice.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Aounetse vincent on 27/11/2018.
 */
public interface UsersRepository extends MongoRepository<User, String> {

    User findBy_id(ObjectId _id);
}
