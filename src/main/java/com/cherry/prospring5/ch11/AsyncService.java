package com.cherry.prospring5.ch11;

import java.util.concurrent.Future;

public interface AsyncService {
    void asyncTask();

    Future<String> asyncWithReturn(String name);
}
