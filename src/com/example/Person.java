package com.example;

/**
 * Created with IntelliJ IDEA.
 * User: kiki
 * Date: 06/06/12
 * Time: 10:43
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private int mID;
    private String mLastName;
    private String mFirstName;
    private String mTel;
    private String mAddress;
    private String mNumBlueCard;
    private String mNumHealthCard;

    public Person(int mID, String mLastName, String mFirstName, String mTel, String mAddress, String mNumBlueCard, String mNumHealthCard) {
        this.mID = mID;
        this.mLastName = mLastName;
        this.mFirstName = mFirstName;
        this.mTel = mTel;
        this.mAddress = mAddress;
        this.mNumBlueCard = mNumBlueCard;
        this.mNumHealthCard = mNumHealthCard;
    }

    public Person(String mLastName, String mFirstName, String mTel, String mAddress, String mNumBlueCard, String mNumHealthCard) {
        this.mLastName = mLastName;
        this.mFirstName = mFirstName;
        this.mTel = mTel;
        this.mAddress = mAddress;
        this.mNumBlueCard = mNumBlueCard;
        this.mNumHealthCard = mNumHealthCard;
    }

    public int getID() {
        return mID;
    }

    public void setID(int ID) {
        this.mID = ID;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        this.mLastName = lastName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        this.mFirstName = firstName;
    }

    public String getTel() {
        return mTel;
    }

    public void setTel(String tel) {
        this.mTel = tel;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        this.mAddress = address;
    }

    public String getNumBlueCard() {
        return mNumBlueCard;
    }

    public void setNumBlueCard(String numBlueCard) {
        this.mNumBlueCard = numBlueCard;
    }

    public String getNumHealthCard() {
        return mNumHealthCard;
    }

    public void setNumHealthCard(String numHealthCard) {
        this.mNumHealthCard = numHealthCard;
    }
}
