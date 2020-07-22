package www.maxinhai.com.trackingshare.appservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import www.maxinhai.com.trackingshare.appservice.callback.HelloServiceCallBack;
import java.util.Map;

@FeignClient(value = "tracking", fallback = HelloServiceCallBack.class)
public interface HelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Map<String, Object> hello(@RequestParam("name") String name) throws Exception;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Map<String, Object> test() throws Exception;

}
