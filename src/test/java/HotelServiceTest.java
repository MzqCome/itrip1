import com.pojo.ItripHotel;
import com.service.HotelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
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
    public void queryAll() throws Exception {
        List<ItripHotel> list=hotelService.queryAllByHotelName("皇冠");
        if(list!=null){
            for (ItripHotel itripHotel : list) {
                System.out.println(itripHotel);
            }
        }
    }

}