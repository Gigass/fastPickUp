package com.gigass.service;

import com.alibaba.fastjson.JSON;
import com.gigass.mapper.FiddlerInfoMapper;
import com.gigass.pojo.FiddlerInfo;
import com.gigass.pojo.FiddlerInfoExample;
import com.gigass.response.PageRequest;
import com.gigass.util.SendmailUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FiddlerService {

    @Autowired
    private FiddlerInfoMapper fiddlerInfoMapper;

    public int savePostInfos(String params) {
        FiddlerInfo record=new FiddlerInfo();
        record.setCreatTime(new Date());
        record.setIsread("0");
        record.setDetail(params);
        int c=fiddlerInfoMapper.insertSelective(record);
        try {
            SendmailUtil.sendEmail("395650058@qq.com","闲鱼捡漏(未读1)",params);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }

    public int CRPostInfo(Integer series) {
        FiddlerInfo record=new FiddlerInfo();
        record.setIsread("1");
        record.setSeries(series);
        record.setUpTime(new Date());
        return fiddlerInfoMapper.updateByPrimaryKeySelective(record);
    }

    public PageInfo getAllFiddlerInfo(PageRequest pageRequest) {
        FiddlerInfoExample exp=new FiddlerInfoExample();
        exp.createCriteria().andIsreadEqualTo("1");
        if(pageRequest!=null){
            PageHelper.startPage(pageRequest.getPageNum(), pageRequest.getPageSize());
        }
        List<FiddlerInfo> list= fiddlerInfoMapper.selectByExample(exp);
        String json=JSON.toJSONString(list);
        try {
            for(FiddlerInfo l:list){
                int c=CRPostInfo(l.getSeries());
            }
            SendmailUtil.sendEmail("395650058@qq.com","闲鱼捡漏(未读"+list.size()+")",json);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(pageRequest!=null) {
            return new PageInfo(list);
        }else{
            return null;
        }
    }
}
