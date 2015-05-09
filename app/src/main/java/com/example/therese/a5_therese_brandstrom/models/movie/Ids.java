package com.example.therese.a5_therese_brandstrom.models.movie;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

/**
 * Created by isak on 2015-04-24.
 */
@Parcel
public class Ids {

    @SerializedName("slug")
    public String slug;

    public String getSlug() {
        return slug;
    }
}