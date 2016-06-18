package com.yunbei.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yunbei.app.dubbo.interfaces.IDemoService;

/**
 * @author: mlc
 * @dat: 2016Äê6ÔÂ11ÈÕ
 * @Description: TODO
 */

@Controller
@RequestMapping("/demo")
public class DemoController {

	@Reference(version = "1.0.0")
	private IDemoService demoService;

	@ResponseBody
	@RequestMapping(value = "/showName", method = RequestMethod.GET)
	public String showName(String name) {

		System.out.println(name);

		return demoService.sayHello(name);

	}
}
