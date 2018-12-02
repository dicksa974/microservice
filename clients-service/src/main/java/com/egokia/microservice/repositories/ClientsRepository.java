package com.egokia.microservice.repositories;

import com.egokia.microservice.model.Client;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Aounetse vincent on 28/11/2018.
 */
public interface ClientsRepository extends MongoRepository<Client, String> {

    Client findBy_id(ObjectId _id);
}
