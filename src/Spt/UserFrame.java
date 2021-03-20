package Spt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class UserFrame extends UniversalFrame {

    private static JButton addSong;
    private static JButton addAlbum;
    private static JButton addArtist;
    private static JButton createPlaylist;
    private static JButton addFavorites;
    private static JButton backButton;
    private static JButton submitButton;

    private static JLabel userMessageBox;
    private static JLabel statusOperationLabel;

    //private static JLabel userIdLabel;
    private static JLabel songTitleLabel;
    private static JLabel songURLLabel;
    private static JLabel artistTitleLabel;
    private static JLabel albumTitleLabel;
    private static JLabel albumYearAppLabel;
    private static JLabel favoritesUserIdLabel;
    private static JLabel favoritesAlbumIdLabel;
    private static JLabel playlistTitleLabel;
    private static JLabel playlistSongIdLabel;
    private static JLabel playlistCreatorIdLabel;
    private static JTextField songTitleTF;
    private static JTextField songURLTF;
    private static JTextField artistTitleTF;
    private static JTextField albumTitleTF;
    private static JTextField albumYearAppTF;
    private static JTextField favoritesUserIdTF;
    private static JTextField favoritesAlbumIdTF;
    private static JTextField  playlistTitleTF;
    private static JTextField  playlistSongIdTF;
    private static JTextField playlistCreatorIdTF;

    public UserFrame(String title) {
        super(title);
        contentPanel.setLayout(null);

        JPanel panelLeft = new JPanel();
        panelLeft.setLayout(null);
        panelLeft.setBounds(10, 10, 200, 800);
        panelLeft.setBackground(background);
        contentPanel.add(panelLeft);

        JLabel options = new JLabel("Options");
        options.setFont(writing);
        options.setBounds(50, 10, 100, 25);
        options.setHorizontalAlignment(SwingConstants.CENTER);
        options.setVisible(true);
        panelLeft.add(options);

        addSong = new JButton("Add Song");
        addSong.setFont(writing);
        addSong.setHorizontalAlignment(SwingConstants.CENTER);
        addSong.setBackground(background);
        addSong.setBounds(10, 60, 180, 50);
        panelLeft.add(addSong);

        addAlbum = new JButton("Add Album");
        addAlbum.setFont(writing);
        addAlbum.setHorizontalAlignment(SwingConstants.CENTER);
        addAlbum.setBackground(background);
        addAlbum.setBounds(10, 130, 180, 50);
        panelLeft.add(addAlbum);

        addArtist = new JButton("Add Artist");
        addArtist.setFont(writing);
        addArtist.setHorizontalAlignment(SwingConstants.CENTER);
        addArtist.setBackground(background);
        addArtist.setBounds(10, 200, 180, 50);
        panelLeft.add(addArtist);

        createPlaylist = new JButton("Create Playlist");
        createPlaylist.setFont(writing);
        createPlaylist.setHorizontalAlignment(SwingConstants.CENTER);
        createPlaylist.setBackground(background);
        createPlaylist.setBounds(10, 270, 180, 50);
        panelLeft.add(createPlaylist);

        addFavorites = new JButton("Add Favorite Albums");
        addFavorites.setFont(writing);
        addFavorites.setHorizontalAlignment(SwingConstants.CENTER);
        addFavorites.setBackground(background);
        addFavorites.setBounds(10, 340, 180, 50);
        panelLeft.add(addFavorites);

        backButton = new JButton("Log out");
        backButton.setFont(writing);
        backButton.setHorizontalAlignment(SwingConstants.CENTER);
        backButton.setBackground(back);
        backButton.setBounds(10, 410, 180, 50);
        panelLeft.add(backButton);

        JPanel panelRight = new JPanel();
        panelRight.setBackground(background);
        panelRight.setBounds(210, 10, 600, 340);
        panelRight.setLayout(null);
        contentPanel.add(panelRight);

        userMessageBox = new JLabel("New Song");
        userMessageBox.setVisible(false);
        userMessageBox.setBackground(background);
        userMessageBox.setBounds(200, 10, 180, 30);
        userMessageBox.setFont(writing);
        userMessageBox.setHorizontalAlignment(SwingConstants.CENTER);
        panelRight.add(userMessageBox);

        songTitleLabel = new JLabel("Song Title:");
        songTitleLabel.setVisible(false);
        songTitleLabel.setBackground(background);
        songTitleLabel.setFont(writing);
        songTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        songTitleLabel.setBounds(50, 50, 100, 25);
        panelRight.add(songTitleLabel);

        songURLLabel = new JLabel("Song URL:");
        songURLLabel.setVisible(false);
        songURLLabel.setBackground(background);
        songURLLabel.setFont(writing);
        songURLLabel.setHorizontalAlignment(SwingConstants.CENTER);
        songURLLabel.setBounds(50, 85, 100, 25);
        panelRight.add(songURLLabel);

        artistTitleLabel = new JLabel("Artist Title: ");
        artistTitleLabel.setVisible(false);
        artistTitleLabel.setBackground(background);
        artistTitleLabel.setFont(writing);
        artistTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        artistTitleLabel.setBounds(30, 50, 130, 25);
        panelRight.add(artistTitleLabel);

        albumTitleLabel = new JLabel("Album Title: ");
        albumTitleLabel.setVisible(false);
        albumTitleLabel.setBackground(background);
        albumTitleLabel.setFont(writing);
        albumTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        albumTitleLabel.setBounds(50, 50, 110, 25);
        panelRight.add(albumTitleLabel);

        albumYearAppLabel = new JLabel("Album Year Apparition: ");
        albumYearAppLabel.setVisible(false);
        albumYearAppLabel.setBackground(background);
        albumYearAppLabel.setFont(writing);
        albumYearAppLabel.setHorizontalAlignment(SwingConstants.CENTER);
        albumYearAppLabel.setBounds(50, 85, 110, 25);
        panelRight.add(albumYearAppLabel);

        favoritesUserIdLabel = new JLabel("User ID:");
        favoritesUserIdLabel.setVisible(false);
        favoritesUserIdLabel.setBackground(background);
        favoritesUserIdLabel.setFont(writing);
        favoritesUserIdLabel.setHorizontalAlignment(SwingConstants.CENTER);
        favoritesUserIdLabel.setBounds(0, 50, 160, 25);
        panelRight.add(favoritesUserIdLabel);

        favoritesAlbumIdLabel = new JLabel("Album ID:");
        favoritesAlbumIdLabel.setVisible(false);
        favoritesAlbumIdLabel.setBackground(background);
        favoritesAlbumIdLabel.setFont(writing);
        favoritesAlbumIdLabel.setHorizontalAlignment(SwingConstants.CENTER);
        favoritesAlbumIdLabel.setBounds(0, 85, 160, 25);
        panelRight.add(favoritesAlbumIdLabel);

        playlistTitleLabel = new JLabel("Playlist Title: ");
        playlistTitleLabel.setVisible(false);
        playlistTitleLabel.setBackground(background);
        playlistTitleLabel.setFont(writing);
        playlistTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        playlistTitleLabel.setBounds(50, 50, 110, 25);
        panelRight.add(playlistTitleLabel);

        playlistSongIdLabel = new JLabel("Playlist Song ID: ");
        playlistSongIdLabel.setVisible(false);
        playlistSongIdLabel.setBackground(background);
        playlistSongIdLabel.setFont(writing);
        playlistSongIdLabel.setHorizontalAlignment(SwingConstants.CENTER);
        playlistSongIdLabel.setBounds(50, 85, 110, 25);
        panelRight.add(playlistSongIdLabel);

        playlistCreatorIdLabel = new JLabel("Playlist Creator ID: ");
        playlistCreatorIdLabel.setVisible(false);
        playlistCreatorIdLabel.setBackground(background);
        playlistCreatorIdLabel.setFont(writing);
        playlistCreatorIdLabel.setHorizontalAlignment(SwingConstants.CENTER);
        playlistCreatorIdLabel.setBounds(50, 120, 110, 25);
        panelRight.add(playlistCreatorIdLabel);

        songTitleTF = new JTextField();
        songTitleTF.setVisible(false);
        songTitleTF.setBackground(background);
        songTitleTF.setFont(writing);
        songTitleTF.setHorizontalAlignment(SwingConstants.CENTER);
        songTitleTF.setBounds(180, 50, 200, 25);
        panelRight.add(songTitleTF);

        songURLTF = new JTextField();
        songURLTF.setVisible(false);
        songURLTF.setBackground(background);
        songURLTF.setFont(writing);
        songURLTF.setHorizontalAlignment(SwingConstants.CENTER);
        songURLTF.setBounds(180, 85, 200, 25);
        panelRight.add(songURLTF);

        artistTitleTF = new JTextField();
        artistTitleTF.setVisible(false);
        artistTitleTF.setBackground(background);
        artistTitleTF.setFont(writing);
        artistTitleTF.setHorizontalAlignment(SwingConstants.CENTER);
        artistTitleTF.setBounds(180, 50, 200, 25);
        panelRight.add(artistTitleTF);

        albumTitleTF = new JTextField();
        albumTitleTF.setVisible(false);
        albumTitleTF.setBackground(background);
        albumTitleTF.setFont(writing);
        albumTitleTF.setHorizontalAlignment(SwingConstants.CENTER);
        albumTitleTF.setBounds(180, 50, 200, 25);
        panelRight.add(albumTitleTF);

        albumYearAppTF = new JTextField();
        albumYearAppTF.setVisible(false);
        albumYearAppTF.setBackground(background);
        albumYearAppTF.setFont(writing);
        albumYearAppTF.setHorizontalAlignment(SwingConstants.CENTER);
        albumYearAppTF.setBounds(180, 85, 200, 25);
        panelRight.add(albumYearAppTF);

        favoritesUserIdTF = new JTextField();
        favoritesUserIdTF.setVisible(false);
        favoritesUserIdTF.setBackground(background);
        favoritesUserIdTF.setFont(writing);
        favoritesUserIdTF.setHorizontalAlignment(SwingConstants.CENTER);
        favoritesUserIdTF.setBounds(180, 50, 200, 25);
        panelRight.add(favoritesUserIdTF);

        favoritesAlbumIdTF = new JTextField();
        favoritesAlbumIdTF.setVisible(false);
        favoritesAlbumIdTF.setBackground(background);
        favoritesAlbumIdTF.setFont(writing);
        favoritesAlbumIdTF.setHorizontalAlignment(SwingConstants.CENTER);
        favoritesAlbumIdTF.setBounds(180, 85, 200, 25);
        panelRight.add(favoritesAlbumIdTF);

        playlistTitleTF = new JTextField();
        playlistTitleTF.setVisible(false);
        playlistTitleTF.setBackground(background);
        playlistTitleTF.setFont(writing);
        playlistTitleTF.setHorizontalAlignment(SwingConstants.CENTER);
        playlistTitleTF.setBounds(180, 50, 200, 25);
        panelRight.add(playlistTitleTF);

        playlistSongIdTF = new JTextField();
        playlistSongIdTF.setVisible(false);
        playlistSongIdTF.setBackground(background);
        playlistSongIdTF.setFont(writing);
        playlistSongIdTF.setHorizontalAlignment(SwingConstants.CENTER);
        playlistSongIdTF.setBounds(180, 85, 200, 25);
        panelRight.add(playlistSongIdTF);

        playlistCreatorIdTF = new JTextField();
        playlistCreatorIdTF.setVisible(false);
        playlistCreatorIdTF.setBackground(background);
        playlistCreatorIdTF.setFont(writing);
        playlistCreatorIdTF.setHorizontalAlignment(SwingConstants.CENTER);
        playlistCreatorIdTF.setBounds(180, 120, 200, 25);
        panelRight.add(playlistCreatorIdTF);

        statusOperationLabel = new JLabel();
        statusOperationLabel.setVisible(false);
        statusOperationLabel.setFont(writing);
        statusOperationLabel.setForeground(back);
        statusOperationLabel.setHorizontalAlignment(SwingConstants.CENTER);
        statusOperationLabel.setBounds(100, 230, 250, 30);
        panelRight.add(statusOperationLabel);

        submitButton = new JButton("Submit");
        submitButton.setVisible(false);
        submitButton.setFont(writing);
        submitButton.setHorizontalAlignment(SwingConstants.CENTER);
        submitButton.setBackground(back);
        submitButton.setBounds(150, 280, 180, 50);
        panelRight.add(submitButton);

    }

    public void setBackButtonActionListener(ActionListener actionListener){
        backButton.addActionListener(actionListener);
    }

    public void setSubmitButtonActionListener(ActionListener actionListener) {
        submitButton.addActionListener(actionListener);
    }

    public void setAddSongButtonActionListener(ActionListener actionListener) {
        addSong.addActionListener(actionListener);
    }

    public void setAddAlbumButtonActionListener(ActionListener actionListener) {
        addAlbum.addActionListener(actionListener);
    }

    public void setAddArtistButtonActionListener(ActionListener actionListener) {
        addArtist.addActionListener(actionListener);
    }

    public void setAddFavoritesButtonActionListener(ActionListener actionListener) {
        addFavorites.addActionListener(actionListener);
    }

    public void setCreatePlaylistButtonActionListener(ActionListener actionListener) {
        createPlaylist.addActionListener(actionListener);
    }

    public static JButton getSubmitButton() {
        return submitButton;
    }

    public static JLabel getUserMessageBox() {
        return userMessageBox;
    }

    public static JLabel getStatusOperationLabel() {
        return statusOperationLabel;
    }

    public static JLabel getSongTitleLabel() {
        return songTitleLabel;
    }

    public static JLabel getSongURLLabel() {
        return songURLLabel;
    }

    public static JLabel getArtistTitleLabel() {
        return artistTitleLabel;
    }

    public static JLabel getAlbumTitleLabel() {
        return albumTitleLabel;
    }

    public static JLabel getAlbumYearAppLabel() {
        return albumYearAppLabel;
    }

    public static JLabel getFavoritesUserIdLabel() {
        return favoritesUserIdLabel;
    }

    public static JLabel getFavoritesAlbumIdLabel() {
        return favoritesAlbumIdLabel;
    }

    public static JLabel getPlaylistTitleLabel() {
        return playlistTitleLabel;
    }

    public static JLabel getPlaylistSongIdLabel() {
        return playlistSongIdLabel;
    }

    public static JLabel getPlaylistCreatorIdLabel() {
        return playlistCreatorIdLabel;
    }

    public static JTextField getSongTitleTF() {
        return songTitleTF;
    }

    public static JTextField getSongURLTF() {
        return songURLTF;
    }

    public static JTextField getArtistTitleTF() {
        return artistTitleTF;
    }

    public static JTextField getAlbumTitleTF() {
        return albumTitleTF;
    }

    public static JTextField getAlbumYearAppTF() {
        return albumYearAppTF;
    }

    public static JTextField getFavoritesUserIdTF() {
        return favoritesUserIdTF;
    }

    public static JTextField getFavoritesAlbumIdTF() {
        return favoritesAlbumIdTF;
    }

    public static JTextField getPlaylistTitleTF() {
        return playlistTitleTF;
    }

    public static JTextField getPlaylistSongIdTF() {
        return playlistSongIdTF;
    }

    public static JTextField getPlaylistCreatorIdTF() {
        return playlistCreatorIdTF;
    }

    public static String getSongTitleInput(){
        return songTitleTF.getText();
    }

    public static String getSongURLInput(){
        return songURLTF.getText();
    }

    public static String getArtistTitleInput(){
        return artistTitleTF.getText();
    }

    public static String getAlbumTitleInput(){
        return albumTitleTF.getText();
    }

    public static String getAlbumYearAppInput(){
        return albumYearAppTF.getText();
    }

    public static String getFavoritesUserIdInput(){
        return favoritesUserIdTF.getText();
    }

    public static String getFavoritesAlbumIdInput(){
        return favoritesAlbumIdTF.getText();
    }

    public static String getPlaylistTitleInput(){
        return playlistTitleTF.getText();
    }

    public static String getPlaylistSongIdInput(){
        return playlistSongIdTF.getText();
    }

    public static String getPlaylistCreatorIdInput(){
        return playlistCreatorIdTF.getText();
    }

}
