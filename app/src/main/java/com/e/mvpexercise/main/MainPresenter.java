package com.e.mvpexercise.main;

public class MainPresenter implements Contract.Presenter {
    private Contract.MvpView mview;

    public MainPresenter(Contract.MvpView view) {
        this.mview = view;
    }
}
