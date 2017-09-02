package com.curioustake.pwj;

import java.util.Arrays;

public class ConcurrentCollectionsActivity implements Activity{
    public void invoke(String[] args) {
        System.out.println( "Execute => " + Arrays.toString(args) );
    }
}
