package org.example.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 资源的抽象和访问接口
 *
 * @author Chloe
 * @date 2025/02/13
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
