package net.mbc.poc.paas.application.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tri.bui on 1/12/17.
 */
@FeignClient(url = "${user.service.url}")
public interface UserClient {
    @RequestMapping("/api/users/{id}")
    GetUserResponse getUser(@PathVariable("id") String id);
}
