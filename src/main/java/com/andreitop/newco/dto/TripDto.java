package com.andreitop.newco.dto;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TripDto implements AbstractDto {

    private static final long serialVersionUID = 5914366185889783660L;

    private Long id;

    @NotNull
    @Size(min = 2, max = 32)
    private String origin;

    @NotNull
    @Size(min = 2, max = 32)
    private String destination;

    @NotNull
    @Min(1000)
    private Integer price;

    public TripDto(Long id, String origin, String destination, Integer price) {
        setId(id);
        setDestination(destination);
        setOrigin(origin);
        setPrice(price);
    }

    public TripDto() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
