package com.example.therese.a5_therese_brandstrom.api.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

/**
 * Created by isak on 2015-04-24.
 */

@Parcel
public class RootApiResponse {

    @SerializedName("movie")
    public ApiResponse apiResponse;
}