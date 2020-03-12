package com.boxuegu.demo.reader.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.boxuegu.demo.reader.entity.Reader;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ReaderMapper extends BaseMapper<Reader> {

}
