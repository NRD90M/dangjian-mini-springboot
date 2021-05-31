package com.cqut.building.util;

import java.util.List;

/**
 * 数据封装，将数据的list和总条数封装成一个对象
 * @param <T>
 */
public class PageResult<T>{
    private Integer total;
    private List<T> list;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
