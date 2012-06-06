package com.example;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: kiki
 * Date: 06/06/12
 * Time: 11:54
 * To change this template use File | Settings | File Templates.
 */
public class CompressionDecompression {

    public static String compress(String input) throws IOException {
        byte[] blockCopy = ByteBuffer
                .allocate(4)
                .order(ByteOrder.LITTLE_ENDIAN)
                .putInt(input.length())
                .array();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(input.length());
        GZIPOutputStream gzipOutputStream = new GZIPOutputStream(outputStream);
        gzipOutputStream.write(input.getBytes());
        gzipOutputStream.close();
        outputStream.close();
        byte[] compressedOutput = new byte[4 + outputStream.toByteArray().length];
        System.arraycopy(blockCopy, 0, compressedOutput, 0, 4);
        System.arraycopy(outputStream.toByteArray(), 0, compressedOutput, 4, outputStream.toByteArray().length);
        return Base64.encodeBytes(compressedOutput);

    }

    public static String decompress(byte[] compressedInput) throws IOException {
        byte[] base64compressedInput = Base64.decode(compressedInput);
        ByteArrayInputStream inputStream = new ByteArrayInputStream(base64compressedInput, 4, base64compressedInput.length - 4);
        GZIPInputStream gzipInputStream = new GZIPInputStream(inputStream);
        int value;
        StringBuilder output = new StringBuilder();
        while ((value = gzipInputStream.read()) != -1) {
            output.append(value);
        }
        inputStream.close();
        gzipInputStream.close();
        return output.toString();
    }
}
