package com.ClearTrip;

import cucumber.api.java.Before;

public class Hook extends BaseMain {

    BaseMain BM = new BaseMain();

    @Before
    public void setup() {
        BM.OpenBrowser("Chrome");
    }


    public void teardown() {
        BM.Closebrowser();
    }
}
