package cn.eleven.springcloud;

import org.springframework.stereotype.Component;

/**
 * @description: 一定要写注释啊
 * @date: 2019-09-09 16:51
 * @author: 十一
 */
@Component
public class ApiServiceError implements ApiService {

    @Override
    public String index() {
        return "服务发生故障！";
    }
}
