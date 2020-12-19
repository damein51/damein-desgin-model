package com.damein.damein.pipeline;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Validator extends NormalValve {
    @Override
    public String invoke(PipeLineContext pipeLineContext) {
        System.out.println("参数校验阀门");
        pipeLineContext.put("param", "1");
        return processContinue(pipeLineContext);
    }

}
