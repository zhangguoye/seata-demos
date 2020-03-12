package com.boxuegu.demo.record.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.boxuegu.demo.record.entity.Record;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface RecordMapper extends BaseMapper<Record> {

}
