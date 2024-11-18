package dev.java_studies.pattern_showcase.proxy;

public class Main {

    public static void main(String[] args) {
        ThirdPartyYoutubeLib service = new ThirdPartyYoutubeClass();
        ThirdPartyYoutubeLib serviceProxy = new CachedYoutubeClass(service);

        YoutubeManager manager = new YoutubeManager(serviceProxy);

        manager.reactOnUserInput();
    }

}
