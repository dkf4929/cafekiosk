package sample.cafekiosk.spring.api.controller.order.request;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class OrderCreateRequest {
    private List<String> productNumbers = new ArrayList<String>();

    @Builder
    public OrderCreateRequest(List<String> productNumbers) {
        this.productNumbers = productNumbers;
    }
}
