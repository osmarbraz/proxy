package com.proxy;

import java.util.HashMap;

/**
 * Interface do serviço remoto.
 */
public interface ThirdPartyYouTubeLib {

    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
