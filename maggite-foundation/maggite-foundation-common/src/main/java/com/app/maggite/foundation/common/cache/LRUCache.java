/*
 * 文件名：LRUCache.java
 * 版权：Copyright 2019-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： LRUCache
 * 修改人：Administrator
 * 修改时间：2019/6/16
 */
package com.app.maggite.foundation.common.cache;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * TODO 添加类的一句话简单描述。
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * <pre>
 * </pre>
 *
 * @author Administrator
 * @version maggite 2019/6/16
 */
public class LRUCache<K, V>
{
    private int maxSize;

    private ConcurrentHashMap<K, V> cache;

    private ConcurrentLinkedDeque<K> queue;

    public LRUCache(int maxSize)
    {
        this.maxSize = maxSize;
        cache = new ConcurrentHashMap<>(maxSize);
        queue = new ConcurrentLinkedDeque<>();
    }

    public V put(final K key, final V value)
    {
        if (cache.contains(key))
        {
            queue.remove(key);
        }

        while (queue.size() >= maxSize)
        {
            K oldestKey = queue.poll();
            if (cache.contains(oldestKey))
            {
                cache.remove(oldestKey);
            }
        }

        queue.add(key);
        cache.put(key, value);

        return value;
    }

    public V get(K key)
    {
        if (cache.contains(key))
        {
            queue.remove(key);
            queue.add(key);
        }
        return cache.get(key);
    }
}
