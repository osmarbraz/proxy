package com.proxy.medialibrary;

/**
 * Arquivo de vídeo.
 */
public class Video {

    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Video aleatorio.";
    }
}
