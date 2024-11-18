package dev.java_studies.pattern_showcase.proxy;

public class YoutubeManager {

    private ThirdPartyYoutubeLib service;

    public YoutubeManager(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    public void renderVideoPage(int id) {
        System.out.println(service.getVideoInfo(id));
    }

    public void renderListPanel() {
        System.out.println(service.listVideos());
    }

    public void reactOnUserInput() {
        renderVideoPage(1);
        renderListPanel();
    }

}
