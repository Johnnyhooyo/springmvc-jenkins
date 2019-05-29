package com.hyq.jenkins.controller;

import com.hyq.jenkins.IDemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author dibulidohu
 * @classname Controller
 * @date 2019/5/2913:56
 * @description
 */
@Slf4j
@Controller
@RequestMapping("/jenkins")
public class DemoController {

    @Autowired
    IDemoService demoService;

    @RequestMapping(value = "/hi", method = {RequestMethod.GET})
    @ResponseBody
    public String demoTest(@RequestParam String name) {
        String service = demoService.test();
        return service + name;
    }
}
