package com.creativefusion.spring6webclient.client;

import com.creativefusion.spring6webclient.model.BeerDTO;
import com.fasterxml.jackson.databind.JsonNode;
import reactor.core.publisher.Flux;

import java.util.Map;

/**
 * @author sm@creativefusion.net
 */
public interface BeerClient {
    Flux<String> listBeer();

    Flux<Map> listBeerMap();
    Flux<JsonNode> listBeersJsonNode();

    Flux<BeerDTO> listBeerDtos();
}
