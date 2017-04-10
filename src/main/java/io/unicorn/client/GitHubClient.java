package io.unicorn.client;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by Abderrazak BOUADMA
 * on 10/04/2017.
 */

@FeignClient(name = "https://api.github.com")
public interface GitHubClient {


}
