package com.example.shristi.nss_bvcoe;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.persistence.BackendlessDataQuery;

import java.io.Serializable;


public class Users implements Serializable {

    private String name1;
    private String ownerId;
    private String objectId;
    private String link;
    private String classes;
    private java.util.Date updated;
    private java.util.Date created;
    //private java.util.List<Location> locations;
    private BackendlessUser owner;

    public String getName1()
    {
        return name1;
    }

    public void setName( String name1 )
    {
        this.name1 = name1;
    }

    public String getOwnerId()
    {
        return ownerId;
    }

    public String getObjectId()
    {
        return objectId;
    }

    public String getLink()
    {
        return link;
    }

    public void setLink( String link)
    {
        this.link = link;
    }

    public String getClasses()
    {
        return classes;
    }

    public void setClasses( String classes )
    {
        this.name1 = name1;
    }

    public java.util.Date getUpdated()
    {
        return updated;
    }

    public java.util.Date getCreated()
    {
        return created;
    }

    public static void findAsync( BackendlessDataQuery query, AsyncCallback<BackendlessCollection<Users>> callback )
    {
        Backendless.Data.of(Users.class ).find( query, callback );
    }
}
