package com.damein.damein;

import com.alibaba.fastjson.JSON;
import com.damein.damein.pipeline.NormalPipeLine;
import com.damein.damein.pipeline.OrderPreviewValidator;
import com.damein.damein.pipeline.PipeLineContext;
import com.damein.damein.pipeline.Validator;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DameinApplication.class)
public class PipelineTest {

    @Autowired
    private NormalPipeLine normalPipeLine;
    @Autowired
    private Validator validator;
    @Autowired
    private OrderPreviewValidator orderPreviewValidator;
//    @Autowired
//    private Processor processor;

    @Test
    public void testUserController() {
        // 定义上下文
        PipeLineContext pipeLineContext = new PipeLineContext(0);
        pipeLineContext.put("index", "0");
        // 增加阀门
        // 参数校验阀门
        normalPipeLine.addValve(validator);
        // 业务校验阀门
        normalPipeLine.addValve(orderPreviewValidator);
        // 业务处理阀门
//        normalPipeLine.addValve(processor);
        // 管道执行
        String flowResult = normalPipeLine.start(pipeLineContext);
        log.info(JSON.toJSONString(flowResult));
    }

}
