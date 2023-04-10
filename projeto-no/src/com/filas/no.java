package com.filas;

public class no {
    private Object object;
    private no refNo;

    public no () {

    }

    // public no(String object) {
    //     this((Object)object);
    // }

    public no (Object object) {
        refNo.object = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public no getRefNo() {
        return refNo;
    }

    public void setRefNo(no refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "no{" + 
                "objetct = '" + object + "'\'" +
                "}"; 
    }

}
