package com.yunbei.app.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yunbei.app.dubbo.interfaces.IDemoService;

/**
 * @author: mlc
 * @dat: 2016年6月11日
 * @Description: TODO
 */

@Service(version = "1.0.0")
public class DemoServiceImpl implements IDemoService {

	@Override
	public String sayHello(String name) {
		return name;
		// return "Hello " + name + ", response form provider: " +
		// RpcContext.getContext().getLocalAddress();

	}

}
