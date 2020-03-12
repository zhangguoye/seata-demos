package com.boxuegu.demo.record.service;


import com.boxuegu.demo.record.entity.Record;
import com.boxuegu.demo.record.mapper.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;

@Service
public class RecordService {

    @Autowired
    RecordMapper recordMapper;

    @Transactional(rollbackFor = Exception.class)
    public void create(String readerCert, String barcode) {
        Record record = new Record()
                .setReaderCert(readerCert)
                .setBarcode(barcode)
                .setBorrowDate(LocalDateTime.now())
                .setStatus(0);
        recordMapper.insert(record);
    }
}
