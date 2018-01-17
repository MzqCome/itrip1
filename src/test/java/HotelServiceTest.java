import com.github.pagehelper.PageInfo;
import com.pojo.ItripHotel;
import com.service.HotelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by dell on 2018/1/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class HotelServiceTest {
    @Resource
    private HotelService hotelService;
    @Test
    public void queryAllHotleName() throws Exception {
        Date startDate = new Date();
        Date endDate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-DD");
        startDate = simpleDateFormat.parse("2018-1-13");
        endDate = simpleDateFormat.parse("2018-1-14");
        PageInfo<ItripHotel> pageInfo = hotelService.queryAllByName(1, 1, 3662, "西单",startDate,endDate);
        if (pageInfo != null) {
            System.out.println(pageInfo);
            List<ItripHotel> list1 = pageInfo.getList();
            if (list1 != null) {
                for (ItripHotel itripHotel : list1) {
                    System.out.println(itripHotel);
                }
            }
        }
    }


    @Test
    public void queryAllByAddress() throws Exception {
        List<ItripHotel> list = hotelService.queryAllByAddress("大豆");
        if(list!=null){
            for (ItripHotel itripHotel : list) {
                System.out.println(itripHotel);
            }
        }
    }
    @Test
    public void queryAll(){
        List<ItripHotel> list = hotelService.queryAll();
        if (list != null) {
            for (ItripHotel itripHotel1 : list) {
                System.out.println(itripHotel1);
            }
        }
    }
    @Test
    public void queryAllByCityId(){
        List<ItripHotel> list = hotelService.queryAllByCity(3662);
        if (list != null) {
            for (ItripHotel itripHotel : list) {
                System.out.println(itripHotel);
            }
        }
    }
}