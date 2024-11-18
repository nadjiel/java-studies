package dev.java_studies.pattern_showcase.proxy;

public interface ThirdPartyYoutubeLib {

    String listVideos();

    String getVideoInfo(int id);

    void downloadVideo(int id);

}
