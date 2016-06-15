package com.sunsystem.mvpapp;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by steve on 6/15/16.
 */
public class Presenter implements PresenterContract {
    private ViewContract mViewContract;

    @Inject JSONParser mJSONParser;

    /* The constructor that will accept the contract */
    public Presenter(ViewContract viewContract) {
        this.mViewContract = viewContract;

        /* Check that the contract is valid */
        if(mViewContract != null) {
            Timber.d("mViewContract != null");
        }
        else {
            Timber.w("mViewContract == null");
        }

        /* Inject the dependency */
        MvpAppApplication.DaggerInjector().inject(Presenter.this);

        if(mJSONParser != null) {
            Timber.d("mJSONParser != null");
            mViewContract.onShowMessageSuccess();
        }
        else {
            Timber.e("mJSONParser == null");
            mViewContract.onShowMessageFailure();
        }
    }

    @Override
    public void getJSONResponse() {
        mJSONParser.parseJSONString();
    }
}
