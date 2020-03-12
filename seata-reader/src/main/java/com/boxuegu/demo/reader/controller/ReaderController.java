package com.boxuegu.demo.reader.controller;

import com.boxuegu.demo.reader.service.ReaderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("reader")
public class ReaderController {

    @Resource
    private ReaderService readerService;

    @GetMapping("/borrow")
    public String borrowBook(String readerCert, String barcode) {
        readerService.borrowBook(readerCert, barcode);
        return "ok";
    }
}
