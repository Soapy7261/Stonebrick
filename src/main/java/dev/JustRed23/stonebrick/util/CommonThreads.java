package dev.JustRed23.stonebrick.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class CommonThreads {

    public static ExecutorService networkThread = Executors.newFixedThreadPool(10, r -> {
        Thread t = new Thread(r);
        t.setName("Network Thread");
        t.setDaemon(true);
        return t;
    });
}
