package com.damein.damein.pipeline;

public class NormalValve implements Valve {

    protected Valve next = null;

    @Override
    public Valve getNext() {
        return next;
    }

    @Override
    public void setNext(Valve valve) {
        this.next = valve;
    }

    @Override
    public String invoke(PipeLineContext pipeLineContext) {
        return processContinue(pipeLineContext);
    }

    protected String processContinue(PipeLineContext pipeLineContext) {
        return next == null ? "ok" : getNext().invoke(pipeLineContext);
    }

}
