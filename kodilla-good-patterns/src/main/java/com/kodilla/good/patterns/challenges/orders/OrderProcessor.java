package com.kodilla.good.patterns.challenges.orders;

public class OrderProcessor {

    private InformationService informationService;
    private OrderRepository orderRepository;
    private OrderService orderService;

    public OrderProcessor(InformationService informationService, OrderRepository orderRepository, OrderService orderService) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    public void process(OrderRequest request) {
        Order order = orderService.createOrder(request);
        orderRepository.addOrder(order);
        informationService.inform(order);
    }
}