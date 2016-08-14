package com.model;

import com.model.beam.ModelRequestVO;
import com.model.beam.ModelResponseVO;
import com.model.message.Request;
import com.model.message.Response;
import com.model.message.ThriftTestService;

/**
 * Created by Administrator on 2016/8/14.
 */
public class ModelClient {

    private ThriftTestService.Iface rpcTestService;

    public ModelClient(ThriftTestService.Iface rpcTestService) {
        this.rpcTestService = rpcTestService;
    }

    public ThriftTestService.Iface getRpcTestService() {
        return rpcTestService;
    }

    public void setRpcTestService(ThriftTestService.Iface rpcTestService) {
        this.rpcTestService = rpcTestService;
    }

    public ModelResponseVO testService(ModelRequestVO modelRequestVO){
        Request request = null;
        Response response = null;
        ModelResponseVO modelResponseVO = null;
        // 将modelrequestvo的数据写入到request中
        try {
            response = rpcTestService.test(request);
            //将response的数据写入到modelResponseVO中
        } catch (org.apache.thrift.TException e) {
            e.printStackTrace();
        }
        return modelResponseVO;
    }
}
