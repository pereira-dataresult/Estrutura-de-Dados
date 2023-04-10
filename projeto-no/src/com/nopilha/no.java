package com.nopilha;

public class no {

    private int dado;
    private no reNo = null;

    public no() {

    }
    
    public no(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public no getRefNo() {
        return reNo;
    }

    public void setRefNo(no reNo) {
        this.reNo = reNo;
    }

    @Override
    public String toString() {
        return "" + 
                "" + dado + 
                ""; 
    }
}
