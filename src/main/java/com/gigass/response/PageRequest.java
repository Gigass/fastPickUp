package com.gigass.response;


/**
 * 分页请求
 */
public class PageRequest {
    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;

    public int getPageNum() {
        return pageNum==0? 1:pageNum;
    }
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
    public int getPageSize() {
        return pageSize==0? 20 :pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public PageRequest(int pageNum, int pageSize) {
        this.pageNum = pageNum==0? 1:pageNum;
        this.pageSize = pageSize==0? 20:pageSize;
    }

    public PageRequest() {
    }
}
