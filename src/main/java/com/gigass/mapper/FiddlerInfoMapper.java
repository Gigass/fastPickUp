package com.gigass.mapper;

import com.gigass.pojo.FiddlerInfo;
import com.gigass.pojo.FiddlerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FiddlerInfoMapper {
    int countByExample(FiddlerInfoExample example);

    int deleteByExample(FiddlerInfoExample example);

    int deleteByPrimaryKey(Integer series);

    int insert(FiddlerInfo record);

    int insertSelective(FiddlerInfo record);

    List<FiddlerInfo> selectByExampleWithBLOBs(FiddlerInfoExample example);

    List<FiddlerInfo> selectByExample(FiddlerInfoExample example);

    FiddlerInfo selectByPrimaryKey(Integer series);

    int updateByExampleSelective(@Param("record") FiddlerInfo record, @Param("example") FiddlerInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") FiddlerInfo record, @Param("example") FiddlerInfoExample example);

    int updateByExample(@Param("record") FiddlerInfo record, @Param("example") FiddlerInfoExample example);

    int updateByPrimaryKeySelective(FiddlerInfo record);

    int updateByPrimaryKeyWithBLOBs(FiddlerInfo record);

    int updateByPrimaryKey(FiddlerInfo record);
}