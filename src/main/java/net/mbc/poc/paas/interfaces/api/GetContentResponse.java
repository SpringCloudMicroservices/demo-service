package net.mbc.poc.paas.interfaces.api;

/**
 * Created by tri.bui on 1/12/17.
 */
public class GetContentResponse {
    public String message;

    public GetContentResponse(String id) {
        this.message = "Content, updated #" + id;
    }
}
