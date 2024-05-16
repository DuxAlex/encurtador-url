package com.tds.encurtadorurl.controller;

import com.tds.encurtadorurl.controller.dto.ShortenUrlRequest;
import com.tds.encurtadorurl.entities.UrlEntity;
import com.tds.encurtadorurl.repository.UrlRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class UrlController {

    private final UrlRepository urlRepository;

    public UrlController(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    @PostMapping(value="/shorten-url")
    public ResponseEntity<Void> shortenUrl(@RequestBody ShortenUrlRequest request){

        String id;
        do{
            id = RandomStringUtils.randomAlphanumeric(5,10);

        }while(urlRepository.existsById(id));

        urlRepository.save(new UrlEntity(id, request.url(), LocalDateTime.now().plusMinutes(1)));




        return ResponseEntity.ok().build();
    }
}
