package com.boxuegu.demo.reader.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("seata_reader")
public class Reader {

    @TableId(type= IdType.AUTO)
    private Integer id;
    /**
     * 读者证号
     */
    private String readerCert;
    /**
     * 读者姓名
     */
    private String readerName;
    /**
     * 剩余可借阅数
     */
    private Integer count;

}
