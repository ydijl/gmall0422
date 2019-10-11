package com.atguigu.gmall0422.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0422.bean.BaseSaleAttr;
import com.atguigu.gmall0422.bean.SpuInfo;
import com.atguigu.gmall0422.service.ManageService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class SpuManageController {
    @Reference
    private ManageService manageService;
    //http://localhost:8082/baseSaleAttrList
    @RequestMapping("baseSaleAttrList")
    List<BaseSaleAttr> getBaseSaleAttr(){
        return manageService.getBaseSaleAttr();
    }
    //http://localhost:8082/saveSpuInfo
    @RequestMapping("saveSpuInfo")
    void saveSpuInfo(@RequestBody  SpuInfo spuInfo){
        manageService.saveSpuInfo(spuInfo);
    }
}
