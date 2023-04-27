package com.creativefusion.spring6webclient.client;

import reactor.core.publisher.Flux;

/**
 * @author sm@creativefusion.net
 */
public interface BeerClient {
    Flux<String> listBeer();
}
