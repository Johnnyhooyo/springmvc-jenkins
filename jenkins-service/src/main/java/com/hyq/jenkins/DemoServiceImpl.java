package com.hyq.jenkins;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dibulidohu
 * @classname DemoServiceImpl
 * @date 2019/5/2914:08
 * @description
 */
@Slf4j
@Service
public class DemoServiceImpl implements IDemoService {

    @Autowired
    DemoFacade facade;

    @Override
    public String test() {
        return facade.getString();
    }
}
