package com.boxuegu.demo.record.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
@TableName("seata_record")
public class Record {

    @TableId(type= IdType.AUTO)
    private Integer id;
    /**
     * 读者证号
     */
    private String readerCert;
    /**
     * 图书条码号
     */
    private String barcode;
    /**
     * 借阅日期
     */
    private LocalDateTime borrowDate;
    /**
     * 借阅状态
     */
    private int status;


}
