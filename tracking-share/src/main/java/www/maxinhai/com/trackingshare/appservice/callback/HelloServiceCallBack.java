package www.maxinhai.com.trackingshare.appservice.callback;

import org.springframework.web.bind.annotation.RequestParam;
import www.maxinhai.com.trackingshare.appservice.HelloService;
import java.util.HashMap;
import java.util.Map;

public class HelloServiceCallBack implements HelloService {

    @Override
    public Map<String, Object> hello(@RequestParam("name") String name) throws Exception {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "tracking模块");
        result.put("success", false);
        result.put("code", 500);
        return null;
    }

    @Override
    public Map<String, Object> test() throws Exception {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "tracking模块");
        result.put("success", false);
        result.put("code", 500);
        return null;
    }
}
