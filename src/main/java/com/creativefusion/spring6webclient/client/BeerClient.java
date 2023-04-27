package com.creativefusion.spring6webclient.client;

import reactor.core.publisher.Flux;

import java.util.Map;

/**
 * @author sm@creativefusion.net
 */
public interface BeerClient {
    Flux<String> listBeer();

    Flux<Map> listBeerMap();
}
