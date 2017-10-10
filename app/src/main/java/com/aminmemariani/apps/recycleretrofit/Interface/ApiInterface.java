package com.aminmemariani.apps.recycleretrofit.Interface;

import com.aminmemariani.apps.recycleretrofit.model.Contact;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by amin on 09.10.17.
 */

public interface ApiInterface {

    @POST("data.json")
    Call<List<Contact>> getContacts();

}
