package net.mbc.poc.paas.interfaces.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tri.bui on 9/12/16.
 */
@RestController
public class ContentApi {
    @RequestMapping(value = "/api/contents/{id}", method = RequestMethod.GET)
    public @ResponseBody GetContentResponse getContent(@PathVariable("id") String id) {
        return new GetContentResponse(id);
    }
}

