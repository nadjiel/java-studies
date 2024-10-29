package dev.java_studies.my_phone.main;

public class MyPhone {

    private MusicPlayer musicPlayer;

    private Phone phone;

    private WebBrowser webBrowser;

    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setWebBrowser(WebBrowser webBrowser) {
        this.webBrowser = webBrowser;
    }

    public WebBrowser getWebBrowser() {
        return webBrowser;
    }

}
