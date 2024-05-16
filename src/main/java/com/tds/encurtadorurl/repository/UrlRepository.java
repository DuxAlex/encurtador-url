package com.tds.encurtadorurl.repository;

import com.tds.encurtadorurl.entities.UrlEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {
}
