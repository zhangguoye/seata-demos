package com.boxuegu.demo.reader.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "seata-record-service")
public interface RecordFeignClient {

    @GetMapping("record/create")
    void create(@RequestParam("readerCert")String readerCert, @RequestParam("barcode")String barcode);
}
