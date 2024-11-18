package dev.java_studies.pattern_showcase.proxy;

public class CachedYoutubeClass implements ThirdPartyYoutubeLib {

    private ThirdPartyYoutubeLib service;

    private String listCache;

    private String videoCache;

    private boolean needReset;

    public CachedYoutubeClass(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    public boolean downloadExists(int id) {
        return true;
    }

    @Override
    public String listVideos() {
        if(listCache == null || needReset) {
            listCache = service.listVideos();
        }

        return listCache;
    }

    @Override
    public String getVideoInfo(int id) {
        if(videoCache == null || needReset) {
            videoCache = service.getVideoInfo(id);
        }

        return videoCache;
    }

    @Override
    public void downloadVideo(int id) {
        if(!downloadExists(id) || needReset) {
            service.downloadVideo(id);
        }
    }

}
