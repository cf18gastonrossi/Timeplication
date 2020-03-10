package com.example.timeplication.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.timeplication.R;
import com.example.timeplication.databinding.LoginFragmentBinding;

public class LoginFragment extends Fragment {

    private LoginViewmodel viewModel;

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        LoginFragmentBinding binding = DataBindingUtil.inflate(inflater, R.layout.login_fragment, container, false);
        binding.setLifecycleOwner(this);
        binding.setViewModel(viewModel);
        return binding.getRoot();
    }

}
