/*
 * 文件名：BaseVO.java
 * 版权：Copyright 2019-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： BaseVO
 * 修改人：Administrator
 * 修改时间：2019/4/5
 */
package com.app.maggite.service.vo;

import java.io.Serializable;
import java.sql.Timestamp;

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
 * @version maggite 2019/4/5
 */
public abstract class BaseVO implements Serializable
{
    private boolean deleted;

    private String createdBy;

    private Timestamp createdTime;

    private String lastUpdatedBy;

    private Timestamp lastUpdatedTime;

    public boolean isDeleted()
    {
        return deleted;
    }

    public void setDeleted(boolean deleted)
    {
        this.deleted = deleted;
    }

    public String getCreatedBy()
    {
        return createdBy;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedTime()
    {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime)
    {
        this.createdTime = createdTime;
    }

    public String getLastUpdatedBy()
    {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy)
    {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Timestamp getLastUpdatedTime()
    {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Timestamp lastUpdatedTime)
    {
        this.lastUpdatedTime = lastUpdatedTime;
    }
}
