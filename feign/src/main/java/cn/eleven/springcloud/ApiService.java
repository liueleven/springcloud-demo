package cn.eleven.springcloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @description: 一定要写注释啊
 * @date: 2019-09-09 16:32
 * @author: 十一
 */
@FeignClient(value = "eurekaclient",fallback = ApiServiceError.class)
@Service
public interface ApiService {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String index();
}