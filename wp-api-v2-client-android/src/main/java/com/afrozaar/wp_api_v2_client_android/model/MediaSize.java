package com.afrozaar.wp_api_v2_client_android.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * This file is part of the Modulio template
 * For license information, please check the LICENSE
 * file in the root of this project
 *
 * @author Sherdle
 * Copyright 2016
 */
public class MediaSize extends BaseModel {
    private int width;
    private int height;
    private String source_url;

    protected MediaSize(Parcel in) {
        width = in.readInt();
        height = in.readInt();
        source_url = in.readString();
    }

    public static final Creator<MediaSize> CREATOR = new Creator<MediaSize>() {
        @Override
        public MediaSize createFromParcel(Parcel in) {
            return new MediaSize(in);
        }

        @Override
        public MediaSize[] newArray(int size) {
            return new MediaSize[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(width);
        parcel.writeInt(height);
        parcel.writeString(source_url);
    }

    public String getSourceUrl(){
        return source_url;
    }
}