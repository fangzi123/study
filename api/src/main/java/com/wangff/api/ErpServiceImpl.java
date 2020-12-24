package com.wangff.api;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wangff
 * @desc TODO
 * @createTime 2020年12月12日 12:00:00
 */
@MyType("12")
@Component
public class ErpServiceImpl implements ErpService {
    @Override
    public String support() {
        return null;
    }

    @Override
    public <T> List<T> getErp() {
        return null;
    }
}
