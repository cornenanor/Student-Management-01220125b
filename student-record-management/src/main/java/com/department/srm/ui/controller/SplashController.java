package com.department.srm.ui.controller;

import javafx.fxml.FXML;


public class SplashController {

    @FXML
    private MediaView mediaView;

    public void initialize() {
        Media media = new Media(getClass().getResource("/animation/intro.mp4").toExternalForm());
        MediaPlayer player = new MediaPlayer(media);
        mediaView.setMediaPlayer(player);
        player.play();
        player.setOnEndOfMedia(player::stop);
    }
}
