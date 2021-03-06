package com.wisedoo.bd.dataobject;

import java.util.Date;

public class UserDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bd_user.pk_user
     *
     * @mbg.generated
     */
    private String pkUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bd_user.user_code
     *
     * @mbg.generated
     */
    private String userCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bd_user.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bd_user.user_type
     *
     * @mbg.generated
     */
    private Integer userType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bd_user.pk_org
     *
     * @mbg.generated
     */
    private String pkOrg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bd_user.pk_psnbasdoc
     *
     * @mbg.generated
     */
    private String pkPsnbasdoc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bd_user.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bd_user.enablestate
     *
     * @mbg.generated
     */
    private Integer enablestate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bd_user.islocled
     *
     * @mbg.generated
     */
    private Boolean islocled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bd_user.begindate
     *
     * @mbg.generated
     */
    private Date begindate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bd_user.enddate
     *
     * @mbg.generated
     */
    private Date enddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bd_user.pk_usergroup
     *
     * @mbg.generated
     */
    private String pkUsergroup;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bd_user.memo
     *
     * @mbg.generated
     */
    private String memo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bd_user.creator
     *
     * @mbg.generated
     */
    private String creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bd_user.creationtime
     *
     * @mbg.generated
     */
    private Date creationtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bd_user.modifier
     *
     * @mbg.generated
     */
    private String modifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bd_user.modifiedtime
     *
     * @mbg.generated
     */
    private Date modifiedtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bd_user.ts
     *
     * @mbg.generated
     */
    private Date ts;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bd_user.dr
     *
     * @mbg.generated
     */
    private Boolean dr;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bd_user.pk_user
     *
     * @return the value of bd_user.pk_user
     *
     * @mbg.generated
     */
    public String getPkUser() {
        return pkUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bd_user.pk_user
     *
     * @param pkUser the value for bd_user.pk_user
     *
     * @mbg.generated
     */
    public void setPkUser(String pkUser) {
        this.pkUser = pkUser == null ? null : pkUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bd_user.user_code
     *
     * @return the value of bd_user.user_code
     *
     * @mbg.generated
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bd_user.user_code
     *
     * @param userCode the value for bd_user.user_code
     *
     * @mbg.generated
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bd_user.user_name
     *
     * @return the value of bd_user.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bd_user.user_name
     *
     * @param userName the value for bd_user.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bd_user.user_type
     *
     * @return the value of bd_user.user_type
     *
     * @mbg.generated
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bd_user.user_type
     *
     * @param userType the value for bd_user.user_type
     *
     * @mbg.generated
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bd_user.pk_org
     *
     * @return the value of bd_user.pk_org
     *
     * @mbg.generated
     */
    public String getPkOrg() {
        return pkOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bd_user.pk_org
     *
     * @param pkOrg the value for bd_user.pk_org
     *
     * @mbg.generated
     */
    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg == null ? null : pkOrg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bd_user.pk_psnbasdoc
     *
     * @return the value of bd_user.pk_psnbasdoc
     *
     * @mbg.generated
     */
    public String getPkPsnbasdoc() {
        return pkPsnbasdoc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bd_user.pk_psnbasdoc
     *
     * @param pkPsnbasdoc the value for bd_user.pk_psnbasdoc
     *
     * @mbg.generated
     */
    public void setPkPsnbasdoc(String pkPsnbasdoc) {
        this.pkPsnbasdoc = pkPsnbasdoc == null ? null : pkPsnbasdoc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bd_user.email
     *
     * @return the value of bd_user.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bd_user.email
     *
     * @param email the value for bd_user.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bd_user.enablestate
     *
     * @return the value of bd_user.enablestate
     *
     * @mbg.generated
     */
    public Integer getEnablestate() {
        return enablestate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bd_user.enablestate
     *
     * @param enablestate the value for bd_user.enablestate
     *
     * @mbg.generated
     */
    public void setEnablestate(Integer enablestate) {
        this.enablestate = enablestate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bd_user.islocled
     *
     * @return the value of bd_user.islocled
     *
     * @mbg.generated
     */
    public Boolean getIslocled() {
        return islocled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bd_user.islocled
     *
     * @param islocled the value for bd_user.islocled
     *
     * @mbg.generated
     */
    public void setIslocled(Boolean islocled) {
        this.islocled = islocled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bd_user.begindate
     *
     * @return the value of bd_user.begindate
     *
     * @mbg.generated
     */
    public Date getBegindate() {
        return begindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bd_user.begindate
     *
     * @param begindate the value for bd_user.begindate
     *
     * @mbg.generated
     */
    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bd_user.enddate
     *
     * @return the value of bd_user.enddate
     *
     * @mbg.generated
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bd_user.enddate
     *
     * @param enddate the value for bd_user.enddate
     *
     * @mbg.generated
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bd_user.pk_usergroup
     *
     * @return the value of bd_user.pk_usergroup
     *
     * @mbg.generated
     */
    public String getPkUsergroup() {
        return pkUsergroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bd_user.pk_usergroup
     *
     * @param pkUsergroup the value for bd_user.pk_usergroup
     *
     * @mbg.generated
     */
    public void setPkUsergroup(String pkUsergroup) {
        this.pkUsergroup = pkUsergroup == null ? null : pkUsergroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bd_user.memo
     *
     * @return the value of bd_user.memo
     *
     * @mbg.generated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bd_user.memo
     *
     * @param memo the value for bd_user.memo
     *
     * @mbg.generated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bd_user.creator
     *
     * @return the value of bd_user.creator
     *
     * @mbg.generated
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bd_user.creator
     *
     * @param creator the value for bd_user.creator
     *
     * @mbg.generated
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bd_user.creationtime
     *
     * @return the value of bd_user.creationtime
     *
     * @mbg.generated
     */
    public Date getCreationtime() {
        return creationtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bd_user.creationtime
     *
     * @param creationtime the value for bd_user.creationtime
     *
     * @mbg.generated
     */
    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bd_user.modifier
     *
     * @return the value of bd_user.modifier
     *
     * @mbg.generated
     */
    public String getmodifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bd_user.modifier
     *
     * @param modifier the value for bd_user.modifier
     *
     * @mbg.generated
     */
    public void setmodifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bd_user.modifiedtime
     *
     * @return the value of bd_user.modifiedtime
     *
     * @mbg.generated
     */
    public Date getModifiedtime() {
        return modifiedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bd_user.modifiedtime
     *
     * @param modifiedtime the value for bd_user.modifiedtime
     *
     * @mbg.generated
     */
    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bd_user.ts
     *
     * @return the value of bd_user.ts
     *
     * @mbg.generated
     */
    public Date getTs() {
        return ts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bd_user.ts
     *
     * @param ts the value for bd_user.ts
     *
     * @mbg.generated
     */
    public void setTs(Date ts) {
        this.ts = ts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bd_user.dr
     *
     * @return the value of bd_user.dr
     *
     * @mbg.generated
     */
    public Boolean getDr() {
        return dr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bd_user.dr
     *
     * @param dr the value for bd_user.dr
     *
     * @mbg.generated
     */
    public void setDr(Boolean dr) {
        this.dr = dr;
    }
}