package com.creativefusion.spring6webclient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author sm@creativefusion.net
 */
@Configuration
public class WebClientConfig implements WebClientCustomizer {

    private final String rootUrl;

    public WebClientConfig(@Value("${webclient.rooturl}") String rootUrl) {
        this.rootUrl = rootUrl;
    }

    @Override
    public void customize(WebClient.Builder webClientBuilder) {
        webClientBuilder.baseUrl(rootUrl);
    }
}
