package com.example.lcp.firstproject;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends BaseActivity {

    @BindView(R.id.Tv_Title1)
    TextView TvTitle1;
    @BindView(R.id.Tv_Title2)
    TextView TvTitle2;
    @BindView(R.id.Tv_Title3)
    TextView TvTitle3;
    @BindView(R.id.Tv_Title4)
    TextView TvTitle4;
    @BindView(R.id.Tv_Title5)
    TextView TvTitle5;
    @BindView(R.id.Tv_Title6)
    TextView TvTitle6;
    Unbinder bind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        bind = ButterKnife.bind(this);
    }

    @Override
    protected void setListener() {

    }

    @Override
    protected void processLogic(Bundle savedInstanceState) {

    }


    @OnClick({R.id.Tv_Title1, R.id.Tv_Title2, R.id.Tv_Title3, R.id.Tv_Title4, R.id.Tv_Title5, R.id.Tv_Title6})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Tv_Title1:
                Toast.makeText(this,"1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Tv_Title2:
                break;
            case R.id.Tv_Title3:
                break;
            case R.id.Tv_Title4:
                break;
            case R.id.Tv_Title5:
                break;
            case R.id.Tv_Title6:
                break;
        }
    }

    @Override
    protected void onDestroy() {
        this.bind.unbind();
        super.onDestroy();
       
    }
}
