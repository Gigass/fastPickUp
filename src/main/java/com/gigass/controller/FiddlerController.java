package com.gigass.controller;


import com.gigass.response.ResponseBean;
import com.gigass.service.FiddlerService;
import com.gigass.response.PageRequest;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fiddler")
public class FiddlerController {
    @Autowired
    private FiddlerService fiddlerService;

    @PostMapping("/savePostInfos")
    public ResponseBean savePostInfos(@RequestParam(value = "params", required = false) String params) {
        int count=fiddlerService.savePostInfos(params);
        return count>0?new ResponseBean(false):new ResponseBean(true);
    }

    @PostMapping("/ChangeReadInfo")
    public ResponseBean CRPostInfo(@RequestParam(value = "series", required = true) Integer series) {
        int count=fiddlerService.CRPostInfo(series);
        return count>0?new ResponseBean(false):new ResponseBean(true);
    }
    @PostMapping("/getAllFiddlerInfo")
    public ResponseBean getAllFiddlerInfo(@RequestParam(value = "pageSize", defaultValue = "20") Integer pageSize,@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,@RequestParam(value = "isRead", defaultValue = "0") String isRead) {
        PageRequest pageRequest = new PageRequest(pageNum, pageSize);
        PageInfo info =fiddlerService.getAllFiddlerInfo(pageRequest,isRead);

        return new ResponseBean(true,info);
    }


}
