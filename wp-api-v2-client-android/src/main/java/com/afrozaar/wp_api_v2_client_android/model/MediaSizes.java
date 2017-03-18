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
public class MediaSizes extends BaseModel{
    private MediaSize thumbnail;
    private MediaSize medium;
    private MediaSize medium_large;
    private MediaSize large;

    public MediaSizes(Parcel in) {
        super(in);
        thumbnail = in.readParcelable(MediaSize.class.getClassLoader());
        medium =  in.readParcelable(MediaSize.class.getClassLoader());
        medium_large =  in.readParcelable(MediaSize.class.getClassLoader());
        large =  in.readParcelable(MediaSize.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeParcelable(thumbnail, flags);
        dest.writeParcelable(medium, flags);
        dest.writeParcelable(medium_large, flags);
        dest.writeParcelable(large, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<MediaSizes> CREATOR = new Creator<MediaSizes>() {
        @Override
        public MediaSizes createFromParcel(Parcel source) {
            return new MediaSizes(source);
        }

        @Override
        public MediaSizes[] newArray(int size) {
            return new MediaSizes[size];
        }
    };

    public MediaSize getLarge() {
        return large;
    }

    public MediaSize getThumbnail() {
        return thumbnail;
    }

    public MediaSize getMedium() {
        return medium;
    }

    public MediaSize getMedium_large() {
        return medium_large;
    }

}
