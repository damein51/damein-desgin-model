package com.damein.damein.strategyrouter;

/**
 * @program: damein
 * @description: StrategyHandler 接口
 * @author: lidongmin
 * @create: 2021-01-27 16:40
 */
public interface StrategyHandler<T, R> {

    @SuppressWarnings("rawtypes")
    StrategyHandler DEFAULT = t -> null;

    /**
     * apply strategy
     *
     * @param param
     * @return
     */
    R apply(T param);
}