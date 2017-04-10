package io.unicorn.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Abderrazak BOUADMA
 * on 10/04/2017.
 */

@RestController
@RequestMapping("/v1")
public class PingController {

    @GetMapping("/ping")
    ResponseEntity<String> ping() {
        return ResponseEntity.ok().body("pong");
    }
}
