package com.marinic;

import java.io.Serializable;
import java.util.List;

public class Asteranks implements Serializable {

    private List<Asterank> asterankList;

    public Asteranks() {

    }

    public List<Asterank> getAsterankList() {
        return asterankList;
    }

    public void setAsterankList(List<Asterank> asterankList) {
        this.asterankList = asterankList;
    }
}
