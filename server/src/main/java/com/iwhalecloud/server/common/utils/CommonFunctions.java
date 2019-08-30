package com.iwhalecloud.server.common.utils;

/**
 * @description
 * @date 2019/8/27
 */
import com.github.pagehelper.PageInfo;
import com.iwhalecloud.server.common.model.ResponseMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.Supplier;

public class CommonFunctions {
    private static final Logger log = LoggerFactory.getLogger(CommonFunctions.class);

    public CommonFunctions() {
    }

    public static <T> ResponseMsg<List<T>> runSupplierByPage(Supplier<PageInfo<T>> supplier, String errorMsg) {
        ResponseMsg<List<T>> responseMsg = new ResponseMsg();
        PageInfo<T> page = (PageInfo)supplier.get();
        responseMsg.setData(page.getList());
        responseMsg.setPageIndex(page.getPageNum());
        responseMsg.setPageSize(page.getPageSize());
        responseMsg.setTotal(page.getTotal());
        responseMsg.setSuccess(true);
        return responseMsg;
    }

    public static <T> ResponseMsg<List<T>> runSupplierByList(Supplier<List<T>> supplier, String errorMsg) {
        ResponseMsg<List<T>> responseMsg = new ResponseMsg();
        List<T> data = (List)supplier.get();
        responseMsg.setData(data);
        responseMsg.setSuccess(true);
        return responseMsg;
    }

    public static <T> ResponseMsg<T> runSupplier(Supplier<T> supplier, String errorMsg) {
        ResponseMsg<T> responseMsg = new ResponseMsg();
        T data = supplier.get();
        responseMsg.setData(data);
        responseMsg.setSuccess(true);
        return responseMsg;
    }

    public static ResponseMsg runSupplierByVoid(Supplier supplier, String errorMsg) {
        ResponseMsg responseMsg = new ResponseMsg();
        supplier.get();
        responseMsg.setSuccess(true);
        return responseMsg;
    }

    public static <S, T> ResponseMsg<List<T>> runTranslateByPage(ResponseMsg<PageInfo<S>> responseMsg, Supplier<List<T>> translate) {
        ResponseMsg<List<T>> data = new ResponseMsg();
        PageInfo<S> page = (PageInfo)responseMsg.getData();
        List<T> vos = (List)translate.get();
        data.setData(vos);
        data.setPageIndex(page.getPageNum());
        data.setPageSize(page.getPageSize());
        data.setTotal(page.getTotal());
        data.setSuccess(true);
        return data;
    }

    public static <S, T> ResponseMsg<List<T>> runTranslateByList(ResponseMsg<List<S>> responseMsg, Supplier<List<T>> translate) {
        ResponseMsg<List<T>> data = new ResponseMsg();
        List<T> vos = (List)translate.get();
        data.setData(vos);
        data.setPageIndex(responseMsg.getPageIndex());
        data.setPageSize(responseMsg.getPageSize());
        data.setTotal(responseMsg.getTotal());
        data.setSuccess(true);
        return data;
    }
}
