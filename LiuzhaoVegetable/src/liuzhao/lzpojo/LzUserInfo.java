package liuzhao.lzpojo;

import java.util.Date;

/**
 * @author 刘昭
 * 用户实体类
 */
public class LzUserInfo {
    private int liuzhaoUserID;
    private String liuzhaoLoginName;
    private String liuzhaoLoginPassword;
    private int liuzhaoUserGender;
    private String liuzhaoUserPhone;
    private String liuzhaoUserEmail;
    private int liuzhaoUserAge;
    private String liuzhaoUserName;
    private Date liuzhaoUserCreateDate;

    @Override
    public String toString() {
        return "LzUserInfo{" +
                "liuzhaoUserID=" + liuzhaoUserID +
                ", liuzhaoLoginName='" + liuzhaoLoginName + '\'' +
                ", liuzhaoLoginPassword='" + liuzhaoLoginPassword + '\'' +
                ", liuzhaoUserGender=" + liuzhaoUserGender +
                ", liuzhaoUserPhone='" + liuzhaoUserPhone + '\'' +
                ", liuzhaoUserEmail='" + liuzhaoUserEmail + '\'' +
                ", liuzhaoUserAge=" + liuzhaoUserAge +
                ", liuzhaoUserName='" + liuzhaoUserName + '\'' +
                ", liuzhaoUserCreateDate=" + liuzhaoUserCreateDate +
                '}';
    }

    public int getLiuzhaoUserID() {
        return liuzhaoUserID;
    }

    public void setLiuzhaoUserID(int liuzhaoUserID) {
        this.liuzhaoUserID = liuzhaoUserID;
    }

    public String getLiuzhaoLoginName() {
        return liuzhaoLoginName;
    }

    public void setLiuzhaoLoginName(String liuzhaoLoginName) {
        this.liuzhaoLoginName = liuzhaoLoginName;
    }

    public String getLiuzhaoLoginPassword() {
        return liuzhaoLoginPassword;
    }

    public void setLiuzhaoLoginPassword(String liuzhaoLoginPassword) {
        this.liuzhaoLoginPassword = liuzhaoLoginPassword;
    }

    public int getLiuzhaoUserGender() {
        return liuzhaoUserGender;
    }

    public void setLiuzhaoUserGender(int liuzhaoUserGender) {
        this.liuzhaoUserGender = liuzhaoUserGender;
    }

    public String getLiuzhaoUserPhone() {
        return liuzhaoUserPhone;
    }

    public void setLiuzhaoUserPhone(String liuzhaoUserPhone) {
        this.liuzhaoUserPhone = liuzhaoUserPhone;
    }

    public String getLiuzhaoUserEmail() {
        return liuzhaoUserEmail;
    }

    public void setLiuzhaoUserEmail(String liuzhaoUserEmail) {
        this.liuzhaoUserEmail = liuzhaoUserEmail;
    }

    public int getLiuzhaoUserAge() {
        return liuzhaoUserAge;
    }

    public void setLiuzhaoUserAge(int liuzhaoUserAge) {
        this.liuzhaoUserAge = liuzhaoUserAge;
    }

    public String getLiuzhaoUserName() {
        return liuzhaoUserName;
    }

    public void setLiuzhaoUserName(String liuzhaoUserName) {
        this.liuzhaoUserName = liuzhaoUserName;
    }

    public Date getLiuzhaoUserCreateDate() {
        return liuzhaoUserCreateDate;
    }

    public void setLiuzhaoUserCreateDate(Date liuzhaoUserCreateDate) {
        this.liuzhaoUserCreateDate = liuzhaoUserCreateDate;
    }


    public LzUserInfo() {

    }

    public LzUserInfo(int liuzhaoUserID, String liuzhaoLoginName, String liuzhaoLoginPassword, int liuzhaoUserGender, String liuzhaoUserPhone, String liuzhaoUserEmail, int liuzhaoUserAge, String liuzhaoUserName, Date liuzhaoUserCreateDate) {
        this.liuzhaoUserID = liuzhaoUserID;
        this.liuzhaoLoginName = liuzhaoLoginName;
        this.liuzhaoLoginPassword = liuzhaoLoginPassword;
        this.liuzhaoUserGender = liuzhaoUserGender;
        this.liuzhaoUserPhone = liuzhaoUserPhone;
        this.liuzhaoUserEmail = liuzhaoUserEmail;
        this.liuzhaoUserAge = liuzhaoUserAge;
        this.liuzhaoUserName = liuzhaoUserName;
        this.liuzhaoUserCreateDate = liuzhaoUserCreateDate;
    }
}

