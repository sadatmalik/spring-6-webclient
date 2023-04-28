package com.creativefusion.spring6webclient.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author sm@creativefusion.net
 */
@Builder
@Data
public class BeerDTO {
    private String id;
    private Integer version;
    private String beerName;
    private String beerStyle;
    private String upc;
    private Integer quantityOnHand;
    private BigDecimal price;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;
}
