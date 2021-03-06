package com.proxy.downloader;

import com.proxy.medialibrary.ThirdPartyYouTubeLib;
import com.proxy.medialibrary.Video;
import java.util.HashMap;

/**
 * App baixadora de mídia.
 */
public class YouTubeDownloader {

    private ThirdPartyYouTubeLib api;

    public YouTubeDownloader(ThirdPartyYouTubeLib api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId) {
        Video video = api.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Página video (imagine HTML)");
        System.out.println("ID: " + video.id);
        System.out.println("Titulo: " + video.title);
        System.out.println("Video: " + video.data);
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = api.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Videos mais populares no YouTube (imagine HTML)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + " / Título: " + video.title);
        }
        System.out.println("-------------------------------\n");
    }
}
