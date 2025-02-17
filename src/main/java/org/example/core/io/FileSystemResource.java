package org.example.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Chloe
 * @date 2025/02/17
 */
public class FileSystemResource implements Resource{
    private final String filePath;
    public FileSystemResource(String filePath) {
        this.filePath = filePath;
    }
    @Override
    public InputStream getInputStream() throws IOException {
        return null;
    }
}
