package com.example.demokotlin.model

import com.google.gson.annotations.SerializedName

class PojoClass {

    @SerializedName("name")
    var name:String?=null
    var realname:String?=null
    var team:String?=null
    var firstappearance:String?=null
    var createdby:String?=null
    var publisher:String?=null
    var imageurl:String?=null
    var bio:String?=null


    constructor(name:String?, realname:String?, team:String?, firstappearance:String?, createdby:String?, publisher:String?, imageurl:String?,  bio:String?) {
        this.name = name;
        this.realname = realname;
        this.team = team;
        this.firstappearance = firstappearance;
        this.createdby = createdby;
        this.publisher = publisher;
        this.imageurl = imageurl;
        this.bio = bio;
    }



}