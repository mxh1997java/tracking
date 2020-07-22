package www.maxinhai.com.trackingmodule.controller;

import java.util.HashMap;
import java.util.Map;

public class AbstractController {

    /**
     * 功能描述: 获得成功响应
     * @Param: [message] 返回消息
     * @Return: java.util.Map<java.lang.String,java.lang.Object>
     * @Author: 15735400536
     * @Date: 2020/7/22 19:32
     */
    protected Map<String, Object> getSuccess(String message) {
        Map<String, Object> result = new HashMap<>();
        result.put("message", message);
        result.put("success", true);
        result.put("code", 200);
        return result;
    }

    /**
     * 功能描述: 获得失败响应
     * @Param: [message] 返回消息
     * @Return: java.util.Map<java.lang.String,java.lang.Object>
     * @Author: 15735400536
     * @Date: 2020/7/22 19:33
     */
    protected Map<String, Object> getFailure(String message) {
        Map<String, Object> result = new HashMap<>();
        result.put("message", message);
        result.put("success", false);
        result.put("code", 500);
        return result;
    }

}
