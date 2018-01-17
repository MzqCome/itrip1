package com.controller.hotel;

import com.github.pagehelper.PageInfo;
import com.pojo.ItripHotel;
import com.service.HotelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dell on 2018/1/16.
 */
@Controller
@RequestMapping("hotel")
public class HotelController {
    @Resource
    private HotelService hotelService;

    @RequestMapping(value = "queryAllByName",method = RequestMethod.POST)
    public String queryAllByName(Integer pageNum, Integer pageSize, Model model, Integer cityId, String Name, String checkInDate,String checkOutDate, HttpSession session){
        if(pageSize == null){
            pageSize = 2;
        }
        if (pageNum == null) {
            pageNum = 1;
        }
        Date startDate = new Date();
        Date endDate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            startDate = simpleDateFormat.parse(checkInDate);
            endDate = simpleDateFormat.parse(checkOutDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        PageInfo<ItripHotel> pageInfo = hotelService.queryAllByName(pageNum, pageSize, cityId, Name, startDate, endDate);
        session.setAttribute("checkInDate",checkInDate);
        session.setAttribute("checkOutDate",checkOutDate);
        model.addAttribute("pageInfo", pageInfo);
        return "test";
    }


}
