package com.oneteam.advanceandroid.base;

import android.app.Activity;

import com.oneteam.advanceandroid.home.MainActivity;
import com.oneteam.advanceandroid.home.MainActivityComponents;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
        MainActivityComponents.class
})
public abstract class ActivityBindingModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity.class)
   // @ActivityKey(MainActivity.class)
   // abstract AndroidInjector.Factory<? extends Activity> provideMainActivityInjector(MainActivityComponents.Builder builder);
    abstract AndroidInjector.Factory<?> provideMainActivityInjector(MainActivityComponents.Builder builder);
}
