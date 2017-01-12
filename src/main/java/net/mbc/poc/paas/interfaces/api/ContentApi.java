package net.mbc.poc.paas.interfaces.api;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

/**
 * Created by tri.bui on 9/12/16.
 */
@RestController
@Configuration
public class ContentApi {
    @RequestMapping(value = "/api/contents", method = RequestMethod.POST)
    public @ResponseBody CreateContentResponse createContent() {
        return new CreateContentResponse();
    }

    @RequestMapping(value = "/api/contents/{id}", method = RequestMethod.GET)
    public @ResponseBody GetContentResponse getContent(@PathVariable("id") String id) {
        return new GetContentResponse(id);
    }
}

