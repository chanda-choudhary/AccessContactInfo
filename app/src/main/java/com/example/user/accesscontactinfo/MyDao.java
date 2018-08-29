package com.example.user.accesscontactinfo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface MyDao {

    @Insert
    public void addContact(Contacts contacts);

    @Query("select * from contacts")
    public List<Contacts> getContact();
}
