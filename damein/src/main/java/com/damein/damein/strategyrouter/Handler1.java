package com.damein.damein.strategyrouter;

/**
 * @program: damein
 * @description: test
 * @author: lidongmin
 * @create: 2021-01-27 17:03
 */
public class Handler1 implements StrategyHandler<String, String> {
    @Override
    public String apply(String param) {

        if ("one".equals(param)) {
            return "ok";
        }
        return "no";
    }
}