package com.cielyang.android.daggerdemo.dummy;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cielyang.android.daggerdemo.R;
import com.cielyang.android.daggerdemo.base.BaseFragment;

public final class DummyActivityFragment extends BaseFragment
        implements DummyActivityContract.View {

    private DummyActivityContract.Presenter mPresenter;

    // Your presenter is available using the mPresenter variable
    public DummyActivityFragment() {
        // Required empty public constructor
    }

    public static DummyActivityFragment newInstance() {
        return new DummyActivityFragment();
    }

    public void setPresenter(DummyActivityContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void onDestroy() {
        mPresenter.dropView();
        super.onDestroy();
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.takeView(this);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_dummy_layout, container, false);
    }

    /**
     * This interface must be implemented by activities that contain this fragment to allow an
     * interaction in this fragment to be communicated to the activity and potentially other
     * fragments contained in that activity.
     *
     * <p>See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html" >Communicating
     * with Other Fragments</a> for more information.
     */
    public interface OnDummyActivityFragmentInteractionListener {
        void onDummyActivityFragmentInteraction();
    }
}
