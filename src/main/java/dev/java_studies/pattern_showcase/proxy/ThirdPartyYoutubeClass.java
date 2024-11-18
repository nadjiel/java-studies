package dev.java_studies.pattern_showcase.proxy;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {

    @Override
    public String listVideos() {
        return "video1, video2, video3";
    }

    @Override
    public String getVideoInfo(int id) {
        return "quality: 1080p";
    }

    @Override
    public void downloadVideo(int id) {
        System.out.println("Downloading video...");
    }

}
