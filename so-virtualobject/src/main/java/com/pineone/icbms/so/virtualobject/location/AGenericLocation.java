package com.pineone.icbms.so.virtualobject.location;

import com.pineone.icbms.so.virtualobject.common.AGenericIdNameOwner;

/**
 * abstract Generic location.<BR/>
 * Created by uni4love on 2016. 11. 27..
 */
abstract class AGenericLocation extends AGenericIdNameOwner implements IGenericLocation {
    /**
     * location uri
     */
    protected String uri;

    /**
     * constructor<BR/>
     *
     * @param id id
     * @param name name
     */
    public AGenericLocation(String id, String name) {
        super(id, name);
    }

    @Override
    public String getUri() {
        return uri;
    }

    /**
     * set location uri.<BR/>
     * @param uri uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("\nid = ").append(id);
        sb.append("\nname = ").append(name);
        sb.append("\nuri = ").append(uri);
        return sb.toString();
    }
}
