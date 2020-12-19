package com.damein.damein.pipeline;


public interface PipeLine {

    /**
     * 添加阀门
     *
     * @param valve 阀门
     */
    void addValve(Valve valve);

    /**
     * 开启管道
     *
     * @param pipeLineContext 管道上下文
     * @return FlowResult
     */
    String start(PipeLineContext pipeLineContext);

}
