package com.iwhalecloud.client.model.param;

/**
 * 分页对象
 * @author leeshaoyu
 * @description
 * @date 2019/8/27
 */
public class PageParam {
    /**
     * 分页索引
     */
    protected int pageIndex;
    /**
     * 分页大小
     */
    protected int pageSize;
    /**
     * 开始页
     */
    protected int start;
    /**
     * 结束页
     */
    protected int end;
    /**
     * 总量
     */
    protected long total;
    /**
     * 总页数
     */
    protected long pages;

    public PageParam(){
        this.pageSize = 20;
    }

    public PageParam(int pageIndex, int pageSize){
        this.pageSize = 20;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.start = (this.pageIndex - 1) * this.pageSize;
        this.end = this.start + this.pageSize;
    }

    public PageParam(int pageIndex, int pageSize, long total) {
        this(pageIndex, pageSize);
        this.total = total;
        this.pages = this.total / (long)this.pageSize;

        if (this.total % (long)this.pageSize != 0L) {
            ++this.pages;
        }
    }

    public PageParam(int pageIndex, int pageSize, long total, int start, int end, long pages) {
        this.pageSize = 20;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.total = total;
        this.pages = pages;
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return this.start;
    }

    public int getEnd() {
        return this.end;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public long getTotal() {
        return this.total;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public long getPages() {
        return this.pages;
    }

    public void setTotal(int total) {
        this.total = (long)total;
        this.pages = this.total / (long)this.pageSize;
        if (this.total % (long)this.pageSize != 0L) {
            ++this.pages;
        }
    }
}
