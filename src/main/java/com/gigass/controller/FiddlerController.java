package com.gigass.controller;


import com.gigass.service.FiddlerService;
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
    public String savePostInfos(@RequestParam(value = "params", required = false) String params) {
        int count=fiddlerService.savePostInfos(params);
        return count>0?"SUCCESS":"ERRO";
    }

    @PostMapping("/CRPostInfo")
    public String CRPostInfo(@RequestParam(value = "series", required = true) Integer series) {
        int count=fiddlerService.CRPostInfo(series);
        return count>0?"SUCCESS":"ERRO";
    }


}
