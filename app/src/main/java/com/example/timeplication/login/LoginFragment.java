package com.example.timeplication.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import com.example.timeplication.R;
import com.example.timeplication.UserMainActivity;
import com.example.timeplication.entry.EntryFragment;


public class LoginFragment extends Fragment {

    private LoginViewmodel viewModel;
    private EditText userNameText;
    private EditText passwordText;
    private Button loginButton;
    private TextView adminTextView;
    private FragmentTransaction transaction;
    private boolean isAdmin = false;

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        viewModel =
                ViewModelProviders.of(this).get(LoginViewmodel.class);
        View root = inflater.inflate(R.layout.login_fragment, container, false);
        loginButton = root.findViewById(R.id.login_button);
        adminTextView = root.findViewById(R.id.text_view_admin);
        setListener();
        return root;
    }

    private void setListener() {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isAdmin) {
                    Intent i = new Intent(getContext(), UserMainActivity.class);
                    startActivity(i);
                    Fragment fm = new EntryFragment();
                    transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.fragment_container, fm);
                    transaction.addToBackStack(null).commit();
                } else {
                    Fragment fm = new EntryFragment();
                    transaction = getActivity().getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.fragment_container, fm);
                    transaction.addToBackStack(null).commit();
                }
            }
        });

        adminTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isAdmin) {
                    isAdmin = false;
                    adminTextView.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                } else {
                    isAdmin = true;
                    adminTextView.setTextColor(getResources().getColor(R.color.colorPrimary));
                }
            }
        });
    }
}
