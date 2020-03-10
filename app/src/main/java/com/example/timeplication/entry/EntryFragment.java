package com.example.timeplication.entry;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.timeplication.R;

public class EntryFragment extends Fragment {

    private EntryViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        viewModel =
                ViewModelProviders.of(this).get(EntryViewModel.class);
        View root = inflater.inflate(R.layout.entry_fragment, container, false);
        return root;
    }
}
