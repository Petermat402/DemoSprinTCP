package com.test.demo.connection;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.serializer.Deserializer;
import org.springframework.core.serializer.Serializer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class CustomSerializerDeserializer implements Serializer<byte[]>, Deserializer<byte[]> {

    Logger logger = LoggerFactory.getLogger(getClass());

    @NotNull
    @Override
    public byte[] deserialize(InputStream inputStream) throws IOException {
        byte[] message = new byte[0];
        if (inputStream.available() > 0) {
            message = inputStream.readAllBytes();
        }
        logger.debug("Deserialized message {}", new String(message, StandardCharsets.UTF_8));
        return message;
    }

    @Override
    public void serialize(@NotNull byte[] message, OutputStream outputStream) throws IOException {
        logger.info("Serializing {}", new String(message, StandardCharsets.UTF_8));
        outputStream.write(message);
        outputStream.flush();
    }
}