package org.heida.service.impl;

import org.heida.model.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    Integer makeOrder(Double total,Integer uid);
    List<Category> getCategoryList();
    List<OrderExt> getOrderList(String state, Integer uid);
    PageBeanExt getPageBeanExt(PageBeanExt pageBeanExt);

    Integer getOrderCountByUid(Integer uid);

    Integer getOrderItemCountByOid(Integer oid);

    void delOrderByOid(Integer oid);

    OrderExt getOrderExtByOid(Integer oid);

    void updateOrder(Order order);
}
