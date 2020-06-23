package com.bila.init.springmvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Magician
 * @Desc:
 * @Date: 2020/06/23
 * @Modify By:
 */
@RestController
public class DemoController {

    @RequestMapping("/test")
    public String test() {
        return "Hello WebApplicationInitializer";
    }
}
