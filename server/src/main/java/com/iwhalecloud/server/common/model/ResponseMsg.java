package com.iwhalecloud.server.common.model;

import com.google.common.collect.Maps;
import com.iwhalecloud.client.model.param.PageParam;
import org.apache.commons.lang3.StringUtils;
import java.util.Map;

/**
 * @description
 * @date 2019/8/22
 */

public class ResponseMsg<T> {
    private Boolean succ;
    private T data;
    private String code;
    private String message;
    private Integer pageIndex;
    private Integer pageSize;
    private Long pages;
    private Long total;
    private Map<String, Object> extInfo;
    private ResponseMsg<T> result;

    public static <T> ResponseMsg<T> build(T data) {
        return new ResponseMsg(data);
    }

    public static <T> ResponseMsg<T> build(T data, PageParam pageParam) {
        return (new ResponseMsg(data)).buildPageParam(pageParam);
    }

    public static <T> ResponseMsg<T> buildSuccess() {
        return build((String)null, (String)null, true, (T)null);
    }

    public static <T> ResponseMsg<T> buildSuccess(String msg) {
        return build((String)null, msg, true, (T)null);
    }

    public static <T> ResponseMsg<T> buildSuccess(String msg, T data) {
        return build((String)null, msg, true, data);
    }

    public static <T> ResponseMsg<T> buildFail(String code, String msg) {
        return build(code, msg, false, (T)null);
    }

    private static <T> ResponseMsg<T> build(String code, String msg, boolean success, T data) {
        return (new ResponseMsg())
                .setSuccess(success)
                .setCode(code)
                .setMessage(msg)
                .setData(data);
    }

    public ResponseMsg(T data) {
        this.data = data;
    }

    public ResponseMsg() {
    }

    public ResponseMsg<T> buildPageParam(PageParam pageParam) {
        this.setPageIndex(pageParam.getPageIndex())
                .setPageSize(pageParam.getPageSize())
                .setTotal(pageParam.getTotal())
                .setPages(pageParam.getPages());
        return this;
    }

    public Boolean isSuccess() {
        return this.succ;
    }

    public ResponseMsg<T> setSuccess(Boolean success) {
        this.succ = success;
        return this;
    }

    public ResponseMsg<T> success() {
        this.succ = true;
        return this;
    }

    public ResponseMsg<T> success(String msg) {
        this.succ = true;
        this.message = msg;
        return this;
    }

    public ResponseMsg<T> success(String msg, T data) {
        this.succ = true;
        this.message = msg;
        this.data = data;
        return this;
    }

    public ResponseMsg<T> fail() {
        this.succ = false;
        return this;
    }

    public ResponseMsg<T> fail(String msg) {
        this.succ = false;
        this.message = msg;
        return this;
    }

    public T getData() {
        return this.data;
    }

    public ResponseMsg<T> setData(T data) {
        this.data = data;
        return this;
    }

    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ResponseMsg<T> setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public ResponseMsg<T> setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Long getPages() {
        return this.pages;
    }

    public ResponseMsg<T> setPages(Long pages) {
        this.pages = pages;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public ResponseMsg<T> setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public ResponseMsg<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public Long getTotal() {
        return this.total;
    }

    public ResponseMsg<T> setTotal(Long total) {
        this.total = total;
        return this;
    }

    public Boolean getSuccess() {
        return this.succ;
    }

    public ResponseMsg<T> getResult() {
        return this.result;
    }

    public void setResult(ResponseMsg<T> result) {
        if (result != null) {
            if (StringUtils.isBlank(this.code)) {
                this.code = result.getCode();
            }

            if (StringUtils.isBlank(this.message)) {
                this.message = result.getMessage();
            }

            if (this.data == null) {
                this.data = result.getData();
            }

            if (this.succ == null) {
                this.succ = result.getSuccess();
            }

            if (this.pageIndex == null) {
                this.pageIndex = result.getPageIndex();
            }

            if (this.pageSize == null) {
                this.pageSize = result.getPageSize();
            }

            if (this.pages == null) {
                this.pages = result.getPages();
            }

            if (this.total == null) {
                this.total = result.getTotal();
            }
        }

    }

    public Map<String, Object> getExtInfo() {
        return this.extInfo;
    }

    public void setExtInfo(Map<String, Object> extInfo) {
        this.extInfo = extInfo;
    }

    public ResponseMsg<T> appendExtInfo(String key, Object value) {
        this.extInfo = (Map)(this.extInfo == null ? Maps.newHashMap() : this.extInfo);
        this.extInfo.put(key, value);
        return this;
    }
}
