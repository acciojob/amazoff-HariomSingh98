package com.driver;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class OrderService {
    @Autowired
    OrderRepository repo;


    public void addOrder( Order order){
        repo.saveOrder(order);
    }

    public void addPartner( String partnerId){

     repo.savePartner(partnerId);
    }

    public void addOrderPartnerPair( String orderId, String partnerId){

       repo.saveOrderPartnerPair(orderId,partnerId);
    }

    public Order getOrderById(String orderId){
        return repo.getOrder(orderId);
    }


    public DeliveryPartner getPartnerById( String partnerId){
       return repo.getPartner(partnerId);
    }

    public int  getOrderCountByPartnerId( String partnerId){
        return repo.getOrderCountByPartnerId(partnerId);
    }

    public List<String> getOrdersByPartnerId( String partnerId) {
      return  repo.getOrdersByPartnerId(partnerId);
    }

    public List<String> getAllOrders(){
      return repo.getAllOrders();
    }

    public int getCountOfUnassignedOrders(){
        return  repo.countOfUnassignedOrders();
    }


    public  int getOrdersLeftAfterGivenTimeByPartnerId( String time, String partnerId){

       return repo.OrdersLeftAfterGivenTimeByPartnerId(time,partnerId);
    }


    public String  getLastDeliveryTimeByPartnerId( String partnerId){
        return repo.LastDeliveryTimeByPartnerId(partnerId);
    }


    public void  deletePartnerById( String partnerId){

        repo.deletePartner(partnerId);
    }


    public  void  deleteOrderById( String orderId){

        repo.deleteOrder(orderId);

    }
}
