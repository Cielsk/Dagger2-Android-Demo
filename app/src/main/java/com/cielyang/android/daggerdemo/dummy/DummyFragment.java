package com.cielyang.android.daggerdemo.dummy;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cielyang.android.daggerdemo.R;
import com.cielyang.android.daggerdemo.base.BaseFragment;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.support.AndroidSupportInjection;

public final class DummyFragment extends BaseFragment implements DummyContract.View {

    private static final String TAG = "DummyFragment";

    @Inject
    DummyContract.Presenter mPresenter;

    @BindView(R.id.text_view_content)
    TextView mTextViewContent;

    Unbinder unbinder;

    @Inject
    @Named("dummy")
    String mContent;

    // Your presenter is available using the mPresenter variable
    @Inject
    public DummyFragment() {
        // Required empty public constructor
    }

    public static DummyFragment newInstance() {
        return new DummyFragment();
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
        mPresenter.loadContent();
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dummy_layout, container, false);
        unbinder = ButterKnife.bind(this, view);
        AndroidSupportInjection.inject(this);
        return view;
    }

    @Override
    public void showContent() {
        if (mContent != null) {
            mTextViewContent.setText(mContent);
        } else {
            Log.e(TAG, "Injection error");
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
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
