package com.wisedoo.bd.service.model;

import java.util.Date;

/**
 * @ClassName: CorpModel
 * @Description:  公司模型
 * @Auther: liujn
 * @Date: 2019/4/23 4:55 PM
 * @Version 1.0
 */
public class CorpModel {

    /**
     * 公司主键
     * @mbg.generated
     */
    private String pkCorp;

    /**
     * 公司编码
     * @mbg.generated
     */
    private String corpCode;

    /**
     * 公司名称
     * @mbg.generated
     */
    private String corpName;

    /**
     * 上级公司
     * @mbg.generated
     */
    private String fathercorp;

    /**
     * 公司类别
     * @mbg.generated
     */
    private String corpType;

    /**
     * 国家
     * @mbg.generated
     */
    private String country;

    /**
     * 行政区划
     * @mbg.generated
     */
    private String region;

    /**
     * 省-自治区
     * @mbg.generated
     */
    private String province;

    /**
     * 城市
     * @mbg.generated
     */
    private String city;

    /**
     * 县区
     * @mbg.generated
     */
    private String vsection;

    /**
     * 联系地址
     * @mbg.generated
     */
    private String saleaddr;

    /**
     * 通讯地址
     * mbg.generated
     */
    private String postaddr;

    /**
     * 邮政编码
     * @mbg.generated
     */
    private String zipcode;

    /**
     * 网址
     * @mbg.generated
     */
    private String url;

    //联系人
    private String linkman1;

    private String linkman2;

    private String linkman3;

    // 联系电话
    private String phone1;

    private String phone2;

    private String phone3;

    // email
    private String email1;

    private String email2;

    private String email3;

    /**
     * 法人代表
     * @mbg.generated
     */
    private String legalbodycode;

    /**
     * 所属行业
     * @mbg.generated
     */
    private String pkIndustry;

    /**
     * 业务开始日期
     * @mbg.generated
     */
    private String begindate;

    /**
     * 业务结束日期
     * @mbg.generated
     */
    private String enddate;

    /**
     * 封存日期
     * @mbg.generated
     */
    private String sealeddate;

    /**
     * 是否封存
     * @mbg.generated
     */
    private Boolean isseal;

    /**
     * 备注
     * @mbg.generated
     */
    private String memo;

    /**
     * 创建人
     * @mbg.generated
     */
    private String creator;

    /**
     * 创建时间
     * @mbg.generated
     */
    private Date creationtime;

    /**
     * 修改人
     * @mbg.generated
     */
    private String modifier;

    /**
     * 修改时间
     * @mbg.generated
     */
    private Date modifiedtime;

    public String getPkCorp() {
        return pkCorp;
    }
    public void setPkCorp(String pkCorp) {
        this.pkCorp = pkCorp;
    }
    public String getCorpCode() {
        return corpCode;
    }
    public void setCorpCode(String corpCode) {
        this.corpCode = corpCode;
    }
    public String getCorpName() {
        return corpName;
    }
    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }
    public String getFathercorp() {
        return fathercorp;
    }
    public void setFathercorp(String fathercorp) {
        this.fathercorp = fathercorp;
    }
    public String getCorpType() {
        return corpType;
    }
    public void setCorpType(String corpType) {
        this.corpType = corpType;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getVsection() {
        return vsection;
    }
    public void setVsection(String vsection) {
        this.vsection = vsection;
    }
    public String getSaleaddr() {
        return saleaddr;
    }
    public void setSaleaddr(String saleaddr) {
        this.saleaddr = saleaddr;
    }
    public String getPostaddr() {
        return postaddr;
    }
    public void setPostaddr(String postaddr) {
        this.postaddr = postaddr;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getLinkman1() {
        return linkman1;
    }
    public void setLinkman1(String linkman1) {
        this.linkman1 = linkman1;
    }
    public String getLinkman2() {
        return linkman2;
    }
    public void setLinkman2(String linkman2) {
        this.linkman2 = linkman2;
    }
    public String getLinkman3() {
        return linkman3;
    }
    public void setLinkman3(String linkman3) {
        this.linkman3 = linkman3;
    }
    public String getPhone1() {
        return phone1;
    }
    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }
    public String getPhone2() {
        return phone2;
    }
    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }
    public String getPhone3() {
        return phone3;
    }
    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }
    public String getEmail1() {
        return email1;
    }
    public void setEmail1(String email1) {
        this.email1 = email1;
    }
    public String getEmail2() {
        return email2;
    }
    public void setEmail2(String email2) {
        this.email2 = email2;
    }
    public String getEmail3() {
        return email3;
    }
    public void setEmail3(String email3) {
        this.email3 = email3;
    }
    public String getLegalbodycode() {
        return legalbodycode;
    }
    public void setLegalbodycode(String legalbodycode) {
        this.legalbodycode = legalbodycode;
    }
    public String getPkIndustry() {
        return pkIndustry;
    }
    public void setPkIndustry(String pkIndustry) {
        this.pkIndustry = pkIndustry;
    }
    public String getBegindate() {
        return begindate;
    }
    public void setBegindate(String begindate) {
        this.begindate = begindate;
    }
    public String getEnddate() {
        return enddate;
    }
    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }
    public String getSealeddate() {
        return sealeddate;
    }
    public void setSealeddate(String sealeddate) {
        this.sealeddate = sealeddate;
    }
    public Boolean getIsseal() {
        return isseal;
    }
    public void setIsseal(Boolean isseal) {
        this.isseal = isseal;
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }
    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }
    public Date getCreationtime() {
        return creationtime;
    }
    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }
    public String getModifier() {
        return modifier;
    }
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }
    public Date getModifiedtime() {
        return modifiedtime;
    }
    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

}
