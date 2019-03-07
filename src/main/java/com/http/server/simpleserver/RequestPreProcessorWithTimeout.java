package com.http.server.simpleserver;

import io.netty.handler.codec.http.FullHttpMessage;
import io.netty.handler.codec.http.HttpRequest;

public abstract interface RequestPreProcessorWithTimeout {
    public abstract FullHttpMessage preprocessRequest(String paramString1, String paramString2, HttpRequest paramHttpRequest)
    throws Exception;

}
