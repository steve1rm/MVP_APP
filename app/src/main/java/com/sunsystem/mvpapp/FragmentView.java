package com.sunsystem.mvpapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.sunsystem.mvpapp.di.AppComponent;
import com.sunsystem.mvpapp.di.AppModule;
import com.sunsystem.mvpapp.di.DaggerAppComponent;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentView extends Fragment implements ViewContract {
    @Inject Presenter mPresenter;

    public FragmentView() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        AppComponent appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(FragmentView.this))
                .build();

        appComponent.inject(FragmentView.this);

        if(mPresenter != null) {
            Timber.d("mPresenter != null");
        }
        else {
            Timber.w("mPresenter == null");
        }
    }

    @Override
    public void onShowMessageFailure() {
        Toast.makeText(getActivity(), "onShowMessageFailure", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onShowMessageSuccess() {
        Toast.makeText(getActivity(), "onShowMessageSuccess", Toast.LENGTH_SHORT).show();
    }
}
