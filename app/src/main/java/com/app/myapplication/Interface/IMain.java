package com.app.myapplication.Interface;


import com.app.myapplication.retrofit.Response.ResponseGame;

public class IMain {

    public interface View {

        void init();

        void onGetResult(final ResponseGame responseGame);

        void onErrorLoading(String message);

        void hideLoading();

        void showLoading();

        void finishApp();

        void showAppExitInfo();

    }

    public interface Presenter {

        void getGameData();

        void created();

        void onBackPressed();
    }
}
