package com.aimer.shd.model;

/**
 * Created by shd on 2016/1/15.
 */
public class School {
    public String schoolId;// 学校编码
    public String schoolNick;// 学校名称
    public String isTeacher;// 是否老师
    public String isGuardian;// 是否家长
    public String groupChatStatus;// 是否开群聊功能 0不开启 1开启
    public String schoolType;
    public String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolNick() {
        return schoolNick;
    }

    public void setSchoolNick(String schoolNick) {
        this.schoolNick = schoolNick;
    }

    public String getIsTeacher() {
        return isTeacher;
    }

    public void setIsTeacher(String isTeacher) {
        this.isTeacher = isTeacher;
    }

    public String getIsGuardian() {
        return isGuardian;
    }

    public void setIsGuardian(String isGuardian) {
        this.isGuardian = isGuardian;
    }

    public String getGroupChatStatus() {
        return groupChatStatus;
    }

    public void setGroupChatStatus(String groupChatStatus) {
        this.groupChatStatus = groupChatStatus;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolId='" + schoolId + '\'' +
                ", schoolNick='" + schoolNick + '\'' +
                ", isTeacher='" + isTeacher + '\'' +
                ", isGuardian='" + isGuardian + '\'' +
                ", groupChatStatus='" + groupChatStatus + '\'' +
                ", schoolType='" + schoolType + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
