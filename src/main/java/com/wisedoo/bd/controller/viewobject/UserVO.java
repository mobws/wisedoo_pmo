package com.wisedoo.bd.controller.viewobject;

import java.util.Date;

/**
 * @ClassName: UserVO
 * @Description: 供前台显示的VO
 * @Auther: liujn
 * @Date: 2019/4/12 4:25 PM
 * @Version 1.0
 */
public class UserVO {

    /**
     * 用户主键
     */
    private String pkUser;

    /**
     * 用户编码
     */
    private String userCode;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户类型
     * 0=员工，1=客户，2=供应商，3=审计，4=外部系统，5=开发者
     */
    private Integer userType;

    /**
     * 用户所属组织
     */
    private String pkOrg;

    /**
     * 业务员（人员基本档案主键）
     */
    private String pkPsnbasdoc;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 1=未启用，2=已启用，3=已停用，
     */
    private Integer enablestate;

    /**
     * 锁定
     */
    private Boolean islocled;

    /**
     * 生效日期
     */
    private Date begindate;

    /**
     * 失效日期
     */
    private Date enddate;

    /**
     * 所属用户组
     */
    private String pkUsergroup;

    /**
     * 备注
     */
    private String memo;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建日期
     */
    private Date creationtime;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改日期
     */
    private Date modifiedtime;


    public String getPkUser() {
        return pkUser;
    }
    public void setPkUser(String pkUser) {
        this.pkUser = pkUser;
    }
    public String getUserCode() {
        return userCode;
    }
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Integer getUserType() {
        return userType;
    }
    public void setUserType(Integer userType) {
        this.userType = userType;
    }
    public String getPkOrg() {
        return pkOrg;
    }
    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg;
    }
    public String getPkPsnbasdoc() {
        return pkPsnbasdoc;
    }
    public void setPkPsnbasdoc(String pkPsnbasdoc) {
        this.pkPsnbasdoc = pkPsnbasdoc;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getEnablestate() {
        return enablestate;
    }
    public void setEnablestate(Integer enablestate) {
        this.enablestate = enablestate;
    }
    public Boolean getIslocled() {
        return islocled;
    }
    public void setIslocled(Boolean islocled) {
        this.islocled = islocled;
    }
    public Date getBegindate() {
        return begindate;
    }
    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }
    public Date getEnddate() {
        return enddate;
    }
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
    public String getPkUsergroup() {
        return pkUsergroup;
    }
    public void setPkUsergroup(String pkUsergroup) {
        this.pkUsergroup = pkUsergroup;
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
