package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class ItemModel implements Parcelable{

    private String name;
    private String type;
    private String detail;
    private int image;
    public ItemModel() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public ItemModel(String name, String type,String detail, int image) {
        this.name = name;
        this.type = type;
        this.detail = detail;
        this.image=image;
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(type);
        parcel.writeString(detail);
        parcel.writeInt(image);
    }

    protected ItemModel(Parcel in) {
        name = in.readString();
        type = in.readString();
        detail = in.readString();
        image = in.readInt();
    }

    public static final Parcelable.Creator<ItemModel> CREATOR = new Parcelable.Creator<ItemModel>() {
        @Override
        public ItemModel createFromParcel(Parcel in) {
            return new ItemModel(in);
        }

        @Override
        public ItemModel[] newArray(int size) {
            return new ItemModel[size];
        }
    };

}
