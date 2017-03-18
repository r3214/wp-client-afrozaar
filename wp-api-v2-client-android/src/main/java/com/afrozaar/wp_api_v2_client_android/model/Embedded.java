package com.afrozaar.wp_api_v2_client_android.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * This file is part of the Modulio template
 * For license information, please check the LICENSE
 * file in the root of this project
 *
 * @author Sherdle
 * Copyright 2016
 */
public class Embedded extends BaseModel {

    @SerializedName("author")
    private List<User> author;

    public List<User> getAuthor(){
        return author;
    }

    @SerializedName("wp:term")
    private List<Taxonomy> term;

    public List<Taxonomy> getTerm(){
        return term;
    }

    public Embedded(Parcel in) {
        super(in);
        in.readTypedList(author, User.CREATOR);
        in.readTypedList(term, Taxonomy.CREATOR);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeTypedList(author);
        dest.writeTypedList(term);
    }

    public static Parcelable.Creator<Embedded> CREATOR = new Creator<Embedded>() {
        @Override
        public Embedded createFromParcel(Parcel source) {
            return new Embedded(source);
        }

        @Override
        public Embedded[] newArray(int size) {
            return new Embedded[size];
        }
    };
}
