package io.unicorn.web.rest;

import io.unicorn.service.GitHubServiceClient;
import io.unicorn.service.dto.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Abderrazak BOUADMA
 * on 10/04/2017.
 */

@RestController
@RequestMapping("/v1")
@EnableFeignClients(clients = {GitHubServiceClient.class})
public class QuartersBackController {

    @Autowired
    GitHubServiceClient gitHubServiceClient;

    @GetMapping("/ping")
    ResponseEntity<String> ping() {
        return ResponseEntity.ok().body("pong");
    }

    @GetMapping("/issues")
    ResponseEntity<List<Issue>> findAllIssues() {
        return ResponseEntity.ok().body(gitHubServiceClient.getAllIssues());
    }
}
