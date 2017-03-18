package com.afrozaar.wp_api_v2_client_android.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author Jan-Louis Crafford
 *         Created on 2016/01/07.
 */
public class MediaDetails extends BaseModel {

    private int width;

    private int height;

    private String file;

    private String mime_type;

    private MediaSizes sizes;

    // TODO add 'image_meta' data

    public MediaDetails() {
    }

    public MediaDetails(Parcel in) {
        super(in);
        width = in.readInt();
        height = in.readInt();
        file = in.readString();
        mime_type = in.readString();
        sizes = in.readParcelable(MediaSizes.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(width);
        dest.writeInt(height);
        dest.writeString(file);
        dest.writeString(mime_type);
        dest.writeParcelable(sizes, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<MediaDetails> CREATOR = new Creator<MediaDetails>() {
        @Override
        public MediaDetails createFromParcel(Parcel source) {
            return new MediaDetails(source);
        }

        @Override
        public MediaDetails[] newArray(int size) {
            return new MediaDetails[size];
        }
    };

    public String getMimeType(){
        return mime_type;
    }

    public MediaSizes getMediaSizes() {
        return sizes;
    }

}
