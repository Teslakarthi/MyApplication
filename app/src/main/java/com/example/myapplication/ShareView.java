package com.example.myapplication;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShareView extends ViewModel {
    private MutableLiveData<CharSequence> text=new MutableLiveData<>();

    public void setText(CharSequence input) {
        text.setValue(input);
    }
    public LiveData<CharSequence> getText(){
        return text;
    }
}
