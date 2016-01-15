package com.aimer.shd.api;

import com.aimer.shd.model.School;

import java.util.List;

/**
 * Created by shd on 2016/1/15.
 */
public interface Api {
    // 学校列表
    public static final String SERVICEID_LST_SCHOOL = "DataSyncService$$LstSchool$$V01";

    public ApiResponse<List<School>> listSchool(String username,String authCode);
}
