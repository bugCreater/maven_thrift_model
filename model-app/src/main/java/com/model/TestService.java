package com.model;

import com.model.message.Request;
import com.model.message.Response;
import com.model.message.ThriftTestService;
import com.model.service.ITestService;
import org.apache.thrift.TException;

/**
 * thrift的服务端代码
 */
public class TestService implements ThriftTestService.Iface {
    private ITestService testService;

    public TestService(ITestService testService) {
        this.testService = testService;
    }

    public ITestService getTestService() {
        return testService;
    }

    public void setTestService(ITestService testService) {
        this.testService = testService;
    }

    @Override
    public Response test(Request request) throws TException {
        return testService.test(request);
    }
}
