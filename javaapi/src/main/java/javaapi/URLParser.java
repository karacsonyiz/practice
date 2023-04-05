package javaapi;

import java.net.URI;
import java.net.URISyntaxException;

public class URLParser {

    // The java.net.URL constructors are deprecated, use URI instead.
    public String readHost(String uriINput){
        String host;
        try{
            URI uri = new URI(uriINput);
            host = uri.getHost();
        } catch (URISyntaxException e){
            throw new IllegalArgumentException("Invalid uri: " + uriINput);
        }
        return host;
    }
}
