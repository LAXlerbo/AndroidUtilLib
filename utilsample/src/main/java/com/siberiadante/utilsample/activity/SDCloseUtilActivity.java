package com.siberiadante.utilsample.activity;

import android.os.Bundle;

import com.siberiadante.utilsample.R;
import com.siberiadante.utilsample.activity.base.BaseActivity;

/**
 * @Created： SiberiaDante
 * @Date： 2018/01/01
 * @Describe：
 * @github： https://github.com/SiberiaDante
 * @博客园： http://www.cnblogs.com/shen-hua/
 */
public class SDCloseUtilActivity extends BaseActivity {

    @Override
    public int setLayoutId() {
        return R.layout.activity_sdclose_util;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        actionBar.setTitle(R.string.sd_close_util);
    }
}
