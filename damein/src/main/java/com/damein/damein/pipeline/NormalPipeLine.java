package com.damein.damein.pipeline;


import org.springframework.stereotype.Component;

@Component
public class NormalPipeLine implements PipeLine {
    private Valve head = null;
    private Valve next = null;

    @Override
    public void addValve(Valve valve) {
        if (head == null) {
            head = valve;
            valve.setNext(next);
        } else {
            Valve current = head;
            while (current != null) {
                if (current.getNext() == next) {
                    current.setNext(valve);
                    valve.setNext(next);
                    break;
                }
                current = current.getNext();
            }
        }
    }

    @Override
    public String start(PipeLineContext pipeLineContext) {
        if (pipeLineContext == null) {
            return "pipeLineContext should be not null!";
        }
        if (head == null) {
            return "there's no valve in current pipeLine!";
        }
        return head.invoke(pipeLineContext);
    }

}
