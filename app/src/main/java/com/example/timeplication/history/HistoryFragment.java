package com.example.timeplication.history;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.timeplication.R;

public class HistoryFragment extends Fragment {

    private HistoryViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        viewModel =
                ViewModelProviders.of(this).get(HistoryViewModel.class);
        View root = inflater.inflate(R.layout.history_fragment, container, false);
        return root;
    }
}
