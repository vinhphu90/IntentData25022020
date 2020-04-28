package com.examplevinhphutvp.intentdata25022020;

import android.os.Parcel;
import android.os.Parcelable;

public class Animal implements Parcelable {
    String Name;
    int Weight;

    public Animal() {
    }

    protected Animal(Parcel in) {
        Name = in.readString();
        Weight = in.readInt();
    }

    public static final Creator<Animal> CREATOR = new Creator<Animal>() {
        @Override
        public Animal createFromParcel(Parcel in) {
            return new Animal(in);
        }

        @Override
        public Animal[] newArray(int size) {
            return new Animal[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeInt(Weight);
    }
}
