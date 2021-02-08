package com.gigass.service;

import com.gigass.mapper.FiddlerInfoMapper;
import com.gigass.pojo.FiddlerInfo;
import com.gigass.pojo.FiddlerInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class FiddlerService {

    @Autowired
    private FiddlerInfoMapper fiddlerInfoMapper;

    public int savePostInfos(String params) {
        FiddlerInfo record=new FiddlerInfo();
        record.setCreatTime(new Date());
        record.setIsread("FALSE");
        record.setDetail(params);
        return fiddlerInfoMapper.insertSelective(record);
    }

    public int CRPostInfo(Integer series) {
        FiddlerInfo record=new FiddlerInfo();
        record.setIsread("TRUE");
        record.setSeries(series);
        return fiddlerInfoMapper.updateByPrimaryKeySelective(record);
    }
}
