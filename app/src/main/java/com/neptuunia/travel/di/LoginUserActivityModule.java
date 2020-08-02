package com.neptuunia.travel.di;

import com.neptuunia.travel.databinding.ActivityLoginUserBinding;
import com.neptuunia.travel.loginuser.LoginUserActivity;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.qualifiers.ActivityContext;

/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version ArmadaSettingActivityModule, v 0.0.1 02/08/20 06.34 by Putra Nugraha
 */
@Module
@InstallIn(ActivityComponent.class)
public class LoginUserActivityModule {

    @Provides
    ActivityLoginUserBinding provideActivityLoginUserBinding(
        @ActivityContext Context context
    ) {
        return ActivityLoginUserBinding.inflate(
            ((LoginUserActivity) context).getLayoutInflater()
        );
    }
}
