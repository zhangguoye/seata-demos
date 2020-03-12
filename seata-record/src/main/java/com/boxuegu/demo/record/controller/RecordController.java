package com.boxuegu.demo.record.controller;

import com.boxuegu.demo.record.service.RecordService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("record")
public class RecordController {

    @Resource
    private RecordService recordService;

    /**
     * 添加记录
     * @param readerCert 读者证号
     * @param barcode 图书条码号
     * @return
     */
    @RequestMapping(path = "/create")
    public Boolean create(String readerCert, String barcode) {
        recordService.create(readerCert, barcode);
        return true;
    }
}
