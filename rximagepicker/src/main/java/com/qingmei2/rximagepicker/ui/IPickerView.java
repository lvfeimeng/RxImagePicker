package com.qingmei2.rximagepicker.ui;

import android.net.Uri;

import io.reactivex.Observable;

public interface IPickerView {

    Observable<Uri> pickImage();

}