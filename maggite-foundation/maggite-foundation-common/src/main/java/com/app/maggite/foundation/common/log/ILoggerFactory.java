package com.app.maggite.foundation.common.log;

/**
 * Created by Administrator on 2018/4/3.
 */
public interface ILoggerFactory<T>
{
    T getLogger(final String name);
}
