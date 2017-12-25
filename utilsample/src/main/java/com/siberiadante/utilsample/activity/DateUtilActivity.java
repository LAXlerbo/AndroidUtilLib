//package com.siberiadante.utilsample.util;
//
//import android.os.Bundle;
//import android.widget.TextView;
//
//import com.sample.R;
//import com.sample.ui.activity.BaseActivity;
//import com.siberiadante.util.utils.SDDateUtil;
//
//public class DateUtilActivity extends BaseActivity {
//
//    @Override
//    public int setLayoutId() {
//        return R.layout.activity_date_util;
//    }
//
//    @Override
//    public void initView(Bundle savedInstanceState) {
//        TextView mTvDateUtil = (TextView) findViewById(R.id.tv_date_util);
//        final String timeStamp = SDDateUtil.getTimeStamp();
//        StringBuilder builder = new StringBuilder();
//        builder.append("显示当前时间：");
//        builder.append("\n");
//        builder.append(timeStamp);
//        builder.append("\n");
//
//        builder.append(SDDateUtil.getStrToTime(timeStamp));
//        builder.append("\n");
//        builder.append(SDDateUtil.getStrToTimeHm(timeStamp));
//        builder.append("\n");
//        builder.append(SDDateUtil.getStrToTimeHms(timeStamp));
//        builder.append("\n");
//        builder.append(SDDateUtil.getStrToTimeYMdHm(timeStamp));
//        builder.append("\n");
//        builder.append(SDDateUtil.getSDFTimeHmA());
//        builder.append("\n");
//        builder.append(SDDateUtil.getSDFTimeHms());
//        builder.append("\n");
//        builder.append(SDDateUtil.getSDFTimeYMd());
//        builder.append("\n");
//        builder.append(SDDateUtil.getSDFTimeYMdHm());
//        builder.append("\n");
//        builder.append(SDDateUtil.getSDFTimeYMdHms());
//        builder.append("\n");
//        builder.append(SDDateUtil.getSDFTimeYMDHSM());
//        builder.append("\n");
//        builder.append(SDDateUtil.getStrToTime());
//        builder.append("\n");
//        builder.append(SDDateUtil.getStrToSDFTime(timeStamp, "yyyy年MM月dd日"));
//        builder.append("\n");
//        mTvDateUtil.setText(builder);
//    }
//
//    @Override
//    public void initData() {
//
//    }
//}
