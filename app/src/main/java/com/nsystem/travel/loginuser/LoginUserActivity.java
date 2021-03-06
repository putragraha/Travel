package com.nsystem.travel.loginuser;

import com.nsystem.travel.R;
import com.nsystem.travel.base.BaseActivity;
import com.nsystem.travel.databinding.ActivityLoginUserBinding;
import com.nsystem.travel.homeuser.HomeUserActivity;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;

import androidx.annotation.NonNull;

public class LoginUserActivity extends BaseActivity {

    private ActivityLoginUserBinding activityLoginUserBinding;

    @Override
    public View getView() {
        activityLoginUserBinding = ActivityLoginUserBinding.inflate(getLayoutInflater());
        return activityLoginUserBinding.getRoot();
    }

    @Override
    public void setup() {
        setupRegisterTextView();
        setupButtonLogin();
    }

    private void setupButtonLogin() {
        activityLoginUserBinding.btnLogin.setOnClickListener(view ->
            startActivity(HomeUserActivity.class)
        );
    }

    private void setupRegisterTextView() {
        activityLoginUserBinding.tvRegisterLabel.setText(getRegisterSpannableText());
        activityLoginUserBinding.tvRegisterLabel.setMovementMethod(LinkMovementMethod.getInstance());
        activityLoginUserBinding.tvRegisterLabel.setHighlightColor(Color.TRANSPARENT);
    }

    private SpannableString getRegisterSpannableText() {
        String registerHere = getString(R.string.register_here);
        SpannableString registerSpannableText = new SpannableString(
            String.format(getString(R.string.have_no_account), registerHere)
        );
        int startIndex = registerSpannableText.length() - registerHere.length();

        registerSpannableText.setSpan(new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                // TODO Move to User Register
            }
        }, startIndex, registerSpannableText.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return registerSpannableText;
    }
}
