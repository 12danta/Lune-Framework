package org.example.core.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * classPath下的资源
 * @author Chloe
 * @date 2025/02/17
 */
public class ClassPathResource implements Resource{
    private final String path;

    public ClassPathResource(String path) {
        this.path = path;
    }
    @Override
    public InputStream getInputStream() throws IOException {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(this.path);
        if (is == null) {
            throw new FileNotFoundException(this.path + " can not be opened because it doesn't exist");
        }
        return is;
    }
}
