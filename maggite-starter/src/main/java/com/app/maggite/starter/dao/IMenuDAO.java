/*
 * 文件名：IMenuDAO.java
 * 版权：Copyright 2018-2020 foundation Tech. Co. Ltd. All Rights Reserved.
 * 描述： IMenuDAO.java
 * 修改人：Administrator
 * 修改时间：2018/5/15
 */
package com.app.maggite.starter.dao;

import com.app.maggite.starter.domain.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TODO 添加类的一句话简单描述。
 * <p>
 * TODO 详细描述
 * <pre>
 * </pre>
 *
 * @author Administrator
 * @version foundation V001R001 2018/5/15
 */
@Repository
@Mapper
public interface IMenuDAO
{
    Menu add(Menu menu);

    Menu delete(int id);

    Menu find(String name);

    int batchDelete(List<Integer> ids);

    List<Menu> listAll();

}
