package com.boxuegu.demo.reader.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.boxuegu.demo.reader.entity.Reader;
import com.boxuegu.demo.reader.feign.RecordFeignClient;
import com.boxuegu.demo.reader.mapper.ReaderMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 读者业务接口
 * <p>
 * Description:
 * <p>
 *
 * @author zhangguoye
 * @version 1.0
 * @date 2020/3/11
 */
@Service
public class ReaderService{

    @Resource
    ReaderMapper readerMapper;

    @Resource
    RecordFeignClient recordFeignClient;

    /**
     * 借阅：借出图书、添加借阅记录、减少读者可借阅数
     *
     * @param readerCert
     * @param barcode
     */
    @GlobalTransactional
    @Transactional(rollbackFor = Exception.class)
    public void borrowBook(String readerCert, String barcode){
        recordFeignClient.create(readerCert, barcode);
        deduct(readerCert, 1);
    }

    /**
     * 减少读者可借阅数
     *
     * @param readerCert
     * @param count
     */
    @Transactional(rollbackFor = Exception.class)
    public void deduct(String readerCert, int count) {
        QueryWrapper<Reader> wrapper = new QueryWrapper<>();
        wrapper.setEntity(new Reader().setReaderCert(readerCert));
        Reader reader = readerMapper.selectOne(wrapper);
        reader.setCount(reader.getCount() - count);

        readerMapper.updateById(reader);
    }


}
