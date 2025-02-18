package org.example.core.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * 将 URL 资源封装成一个 Resource 对象，并提供获取该资源内容输入流的方法
 * @author Chloe
 * @date 2025/02/17
 */
public class UrlResource implements Resource{

    private final URL url;//只能通过构造函数赋值，一旦赋值不可改变

    public UrlResource(URL url) {
        this.url = url;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        URLConnection con = this.url.openConnection();
        try{
            return con.getInputStream();
        }catch (IOException ex){
            throw ex;
        }
    }
}
