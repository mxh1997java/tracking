package www.maxinhai.com.trackingmodule.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import www.maxinhai.com.trackingshare.appservice.HelloService;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("tracking")
@RestController
public class HelloController implements HelloService {

    @RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.POST})
    @Override
    public Map<String, Object> hello(@RequestParam("name") String name) throws Exception {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "tracking模块");
        result.put("success", true);
        result.put("code", 200);
        return result;
    }

    @RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
    @Override
    public Map<String, Object> test() throws Exception {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "tracking模块");
        result.put("success", true);
        result.put("code", 200);
        return result;
    }
}
