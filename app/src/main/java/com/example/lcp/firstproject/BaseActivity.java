package com.example.lcp.firstproject;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import cn.pedant.SweetAlert.SweetAlertDialog;


/**
 * Created by plm on 2016/6/13.
 */
public abstract class BaseActivity extends FragmentActivity {
//    public ProgressDialog dialog;
    public int srceenHeight = 0;//屏幕高
    public int srceenWidth = 0;//屏幕宽

    public Context getContext() {
        return this;
    }



    protected String TAG;
    private SweetAlertDialog mLoadingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = this.getClass().getSimpleName();
        initView(savedInstanceState);
        setListener();
        processLogic(savedInstanceState);
    }

    /**
     * 查找View
     *
     * @param id   控件的id
     * @param <VT> View类型
     * @return
     */
    protected <VT extends View> VT getViewById(@IdRes int id) {
        return (VT) findViewById(id);
    }

    /**
     * 初始化布局以及View控件
     */
    protected abstract void initView(Bundle savedInstanceState);

    /**
     * 给View控件添加事件监听器
     */
    protected abstract void setListener();

    /**
     * 处理业务逻辑，状态恢复等操作
     *
     * @param savedInstanceState
     */
    protected abstract void processLogic(Bundle savedInstanceState);

    /**
     * 需要处理点击事件时，重写该方法
     *
     * @param v
     */
    public void onClick(View v) {
    }

    protected void showToast(String text) {
    }

    public void showLoadingDialog(int type) {
        if (mLoadingDialog == null) {
            mLoadingDialog = new SweetAlertDialog(this, type);
            mLoadingDialog.setCanceledOnTouchOutside(true);
            mLoadingDialog.getProgressHelper().setBarColor(getResources().getColor(R.color.colorAccent));
            mLoadingDialog.setCancelable(true);
            mLoadingDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public void onCancel(DialogInterface dialog) {
//                    dismissLoadingDialog();
//                    mLoadingDialog=null;
                }
            });
            mLoadingDialog.setTitleText("加载中...");
        }
        mLoadingDialog.show();
    }

    public void dismissLoadingDialog() {
        if (mLoadingDialog != null) {
            mLoadingDialog.dismiss();
        }
    }
}

