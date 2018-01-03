package com.service.pre;

import com.pojo.ItripHotelOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/1/2 0002.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ItripHotelOrderServiceImplTest {
    @Resource
    private ItripHotelOrderService itripHotelOrderService;
    @Test
    public void listAllOrderByUserId() throws Exception {
        List<ItripHotelOrder> list=itripHotelOrderService.listAllOrderByUserId(1);
        for (ItripHotelOrder order : list) {
            System.out.println(order);
        }
    }

    @Test
    public void listOradeBySelect() throws Exception {
        List<ItripHotelOrder> list=itripHotelOrderService.listOradeBySelect(0,100001,null,null,null);
        for (ItripHotelOrder hotelOrder : list) {
            System.out.println(hotelOrder);
        }
    }

    @Test
    public void queryOradeById() throws Exception {
      ItripHotelOrder itripHotelOrder=itripHotelOrderService.queryOradeById(104);
        System.out.println(itripHotelOrder);
    }

    @Test
    public void delOrder() throws Exception {
    }

}
