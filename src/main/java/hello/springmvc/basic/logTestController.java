package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class logTestController {

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace(" trace log={}",name); // 더하기 연산으로 하지마. 출력이 안되도 더하기 연산을 해버림. => 낭비
        log.debug(" debug log={}",name);
        log.info(" info log={}", name);
        log.warn(" warn log={}",name);
        log.error(" error log={}",name);

        return "ok"; // restController하면 이거 문자 그냥 반환
    }

}
