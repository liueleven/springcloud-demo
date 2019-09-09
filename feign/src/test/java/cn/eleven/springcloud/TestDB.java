package cn.eleven.springcloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description: 一定要写注释啊
 * @date: 2019-09-09 16:39
 * @author: 十一
 */
@SpringBootTest(classes = FeignApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDB {

    @Autowired
    private ApiService apiService;

    @Test
    public void test(){
        for (int i=0; i<10; i++) {
            try {
                System.out.println("<====== " + apiService.index());
                Thread.sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
