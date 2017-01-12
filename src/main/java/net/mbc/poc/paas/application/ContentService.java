package net.mbc.poc.paas.application;

import com.google.inject.Inject;
import net.mbc.poc.paas.application.client.UserClient;
import org.springframework.stereotype.Service;

/**
 * Created by tri.bui on 11/7/16.
 */
@Service
public class ContentService {
    @Inject
    UserClient userClient;

    public String getContent(String id) {
        return "Content of user " + userClient.getUser("demo");
    }
}
