package com.yueban.qiniu_lib;

/**
 * @author yueban
 * @date 2019/1/25
 * @email fbzhh007@gmail.com
 */
public interface UploadCallback {
    void onStart();

    void onSuccess(int status_code, String result);

    void onFailed(Exception e);
}
