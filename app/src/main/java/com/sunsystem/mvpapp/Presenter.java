package com.sunsystem.mvpapp;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by steve on 6/15/16.
 */
public class Presenter implements PresenterContract {
    private ViewContract mViewContract;

    @Inject JSONParser mJSONParser;

    public Presenter(ViewContract viewContract) {
        this.mViewContract = viewContract;

        if(mViewContract != null) {
            Timber.d("mViewContract != null");
        }
        else {
            Timber.w("mViewContract == null");
        }

        MvpAppApplication.DaggerInjector().inject(Presenter.this);

        if(mJSONParser != null) {
            Timber.d("mJSONParser != null");
        }
        else {
            Timber.e("mJSONParser == null");
        }
    }

    @Override
    public void getJSONResponse() {
        mViewContract.onShowMessageSuccess();
    }
}
