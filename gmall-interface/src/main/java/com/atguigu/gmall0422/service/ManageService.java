package com.atguigu.gmall0422.service;

import com.atguigu.gmall0422.bean.*;

import java.util.List;

public interface ManageService {
    List<BaseCatalog1> getCatalog1();
    List<BaseCatalog2> getCatalog2(String catalog1Id);
    List<BaseCatalog3> getCatalog3(String catalog2Id);
    List<BaseAttrInfo> getAttrInfoList(String catalog3Id);
    

    List<BaseAttrValue> getAttrValueList(String attrId);

    BaseAttrInfo getAttrInfo(String attrId);

    void saveAttrInfo(BaseAttrInfo baseAttrInfo);
    List<SpuInfo> getSpuInfoList(SpuInfo spuInfo);

    List<BaseSaleAttr> getBaseSaleAttr();

    void saveSpuInfo(SpuInfo spuInfo);

    List<SpuImage> getSpuImage(String spuId);

    List<SpuSaleAttr> getspuSaleAttrList(String spuId);

    void saveSkuInfo(SkuInfo skuInfo);
}
