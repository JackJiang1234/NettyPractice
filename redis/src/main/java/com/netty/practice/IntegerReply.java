package com.netty.practice;

import io.netty.buffer.ByteBuf;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IntegerReply implements RedisReply<Integer> {

    public IntegerReply(int data) {
        this.data = data;
    }

    @Override
    public Integer data() {
        return this.data;
    }

    @Override
    public void write(ByteBuf out) throws IOException {
        out.writeByte(MARKER);
        out.writeBytes(String.valueOf(this.data).getBytes(StandardCharsets.UTF_8));
        out.writeBytes(CRLF);
    }

    @Override
    public String toString() {
        return "IntegerReply{" +
                "data=" + data +
                '}';
    }

    private static final char MARKER = ':';
    private final int data;
}
