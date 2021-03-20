package Spt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserController {
    protected UserFrame frame;
    private Color wrongData = new Color(107, 4, 0);
    private Color validData = new Color(240, 230, 140);

    public UserController(UserFrame frame) {
        this.frame = frame;
        frame.setBackButtonActionListener(new BackBtnActionListener());
        frame.setAddSongButtonActionListener(new AddSongBtnActionListener());
        frame.setAddAlbumButtonActionListener(new AddAlbumBtnActionListener());
        frame.setAddArtistButtonActionListener(new AddArtistBtnActionListener());
        frame.setAddFavoritesButtonActionListener(new AddFavoritesBtnActionListener());
        frame.setCreatePlaylistButtonActionListener(new CreatePlaylistBtnActionListener());
        frame.setSubmitButtonActionListener(new SubmitBtnActionListener());
    }


    private class BackBtnActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            FrameStack.getInstance().pop();
            LoginFrame.getLoginError().setVisible(false);
        }
    }

    private class AddSongBtnActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            UserFrame.getSubmitButton().setVisible(true);
            UserFrame.getUserMessageBox().setVisible(true);
            UserFrame.getUserMessageBox().setText("Add Song");
            UserFrame.getSongTitleLabel().setVisible(false);
            UserFrame.getSongURLLabel().setVisible(false);
            UserFrame.getSongTitleTF().setVisible(false);
            UserFrame.getSongURLTF().setVisible(false);
            UserFrame.getArtistTitleLabel().setVisible(false);
            UserFrame.getArtistTitleTF().setVisible(false);
            UserFrame.getAlbumTitleLabel().setVisible(false);
            UserFrame.getAlbumYearAppLabel().setVisible(false);
            UserFrame.getAlbumTitleTF().setVisible(false);
            UserFrame.getAlbumYearAppTF().setVisible(false);
            UserFrame.getFavoritesAlbumIdLabel().setVisible(false);
            UserFrame.getFavoritesUserIdLabel().setVisible(false);
            UserFrame.getFavoritesAlbumIdTF().setVisible(false);
            UserFrame.getFavoritesUserIdTF().setVisible(false);
            UserFrame.getPlaylistTitleLabel().setVisible(false);
            UserFrame.getPlaylistSongIdLabel().setVisible(false);
            UserFrame.getPlaylistCreatorIdLabel().setVisible(false);
            UserFrame.getPlaylistTitleTF().setVisible(false);
            UserFrame.getPlaylistSongIdTF().setVisible(false);
            UserFrame.getPlaylistCreatorIdTF().setVisible(false);
            UserFrame.getStatusOperationLabel().setVisible(false);

            UserFrame.getSongTitleLabel().setVisible(true);
            UserFrame.getSongURLLabel().setVisible(true);
            UserFrame.getSongTitleTF().setVisible(true);
            UserFrame.getSongURLTF().setVisible(true);
            UserFrame.getUserMessageBox().setVisible(true);
        }
    }

    private class AddArtistBtnActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            UserFrame.getSubmitButton().setVisible(true);
            UserFrame.getUserMessageBox().setVisible(false);
            UserFrame.getUserMessageBox().setText("Add Artist");
            UserFrame.getSongTitleLabel().setVisible(false);
            UserFrame.getSongURLLabel().setVisible(false);
            UserFrame.getSongTitleTF().setVisible(false);
            UserFrame.getSongURLTF().setVisible(false);
            UserFrame.getArtistTitleLabel().setVisible(false);
            UserFrame.getArtistTitleTF().setVisible(false);
            UserFrame.getAlbumTitleLabel().setVisible(false);
            UserFrame.getAlbumYearAppLabel().setVisible(false);
            UserFrame.getAlbumTitleTF().setVisible(false);
            UserFrame.getAlbumYearAppTF().setVisible(false);
            UserFrame.getFavoritesAlbumIdLabel().setVisible(false);
            UserFrame.getFavoritesUserIdLabel().setVisible(false);
            UserFrame.getFavoritesAlbumIdTF().setVisible(false);
            UserFrame.getFavoritesUserIdTF().setVisible(false);
            UserFrame.getPlaylistTitleLabel().setVisible(false);
            UserFrame.getPlaylistSongIdLabel().setVisible(false);
            UserFrame.getPlaylistCreatorIdLabel().setVisible(false);
            UserFrame.getPlaylistTitleTF().setVisible(false);
            UserFrame.getPlaylistSongIdTF().setVisible(false);
            UserFrame.getPlaylistCreatorIdTF().setVisible(false);
            UserFrame.getStatusOperationLabel().setVisible(false);

            UserFrame.getArtistTitleLabel().setVisible(true);
            UserFrame.getArtistTitleTF().setVisible(true);
            UserFrame.getUserMessageBox().setVisible(true);
        }
    }

    private class AddAlbumBtnActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            UserFrame.getSubmitButton().setVisible(true);
            UserFrame.getUserMessageBox().setVisible(false);
            UserFrame.getUserMessageBox().setText("Add Album");
            UserFrame.getSongTitleLabel().setVisible(false);
            UserFrame.getSongURLLabel().setVisible(false);
            UserFrame.getSongTitleTF().setVisible(false);
            UserFrame.getSongURLTF().setVisible(false);
            UserFrame.getArtistTitleLabel().setVisible(false);
            UserFrame.getArtistTitleTF().setVisible(false);
            UserFrame.getAlbumTitleLabel().setVisible(false);
            UserFrame.getAlbumYearAppLabel().setVisible(false);
            UserFrame.getAlbumTitleTF().setVisible(false);
            UserFrame.getAlbumYearAppTF().setVisible(false);
            UserFrame.getFavoritesAlbumIdLabel().setVisible(false);
            UserFrame.getFavoritesUserIdLabel().setVisible(false);
            UserFrame.getFavoritesAlbumIdTF().setVisible(false);
            UserFrame.getFavoritesUserIdTF().setVisible(false);
            UserFrame.getPlaylistTitleLabel().setVisible(false);
            UserFrame.getPlaylistSongIdLabel().setVisible(false);
            UserFrame.getPlaylistCreatorIdLabel().setVisible(false);
            UserFrame.getPlaylistTitleTF().setVisible(false);
            UserFrame.getPlaylistSongIdTF().setVisible(false);
            UserFrame.getPlaylistCreatorIdTF().setVisible(false);
            UserFrame.getStatusOperationLabel().setVisible(false);

            UserFrame.getAlbumTitleLabel().setVisible(true);
            UserFrame.getAlbumYearAppLabel().setVisible(true);
            UserFrame.getAlbumTitleTF().setVisible(true);
            UserFrame.getAlbumYearAppTF().setVisible(true);
            UserFrame.getUserMessageBox().setVisible(true);
        }
    }

    private class CreatePlaylistBtnActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            UserFrame.getSubmitButton().setVisible(true);
            UserFrame.getUserMessageBox().setVisible(false);
            UserFrame.getUserMessageBox().setText("Create Playlist");
            UserFrame.getSongTitleLabel().setVisible(false);
            UserFrame.getSongURLLabel().setVisible(false);
            UserFrame.getSongTitleTF().setVisible(false);
            UserFrame.getSongURLTF().setVisible(false);
            UserFrame.getArtistTitleLabel().setVisible(false);
            UserFrame.getArtistTitleTF().setVisible(false);
            UserFrame.getAlbumTitleLabel().setVisible(false);
            UserFrame.getAlbumYearAppLabel().setVisible(false);
            UserFrame.getAlbumTitleTF().setVisible(false);
            UserFrame.getAlbumYearAppTF().setVisible(false);
            UserFrame.getFavoritesAlbumIdLabel().setVisible(false);
            UserFrame.getFavoritesUserIdLabel().setVisible(false);
            UserFrame.getFavoritesAlbumIdTF().setVisible(false);
            UserFrame.getFavoritesUserIdTF().setVisible(false);
            UserFrame.getPlaylistTitleLabel().setVisible(false);
            UserFrame.getPlaylistSongIdLabel().setVisible(false);
            UserFrame.getPlaylistCreatorIdLabel().setVisible(false);
            UserFrame.getPlaylistTitleTF().setVisible(false);
            UserFrame.getPlaylistSongIdTF().setVisible(false);
            UserFrame.getPlaylistCreatorIdTF().setVisible(false);
            UserFrame.getStatusOperationLabel().setVisible(false);

            UserFrame.getPlaylistTitleLabel().setVisible(true);
            UserFrame.getPlaylistSongIdLabel().setVisible(true);
            UserFrame.getPlaylistCreatorIdLabel().setVisible(true);
            UserFrame.getPlaylistTitleTF().setVisible(true);
            UserFrame.getPlaylistSongIdTF().setVisible(true);
            UserFrame.getPlaylistCreatorIdTF().setVisible(true);
            UserFrame.getUserMessageBox().setVisible(true);
        }
    }

    private class AddFavoritesBtnActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            UserFrame.getSubmitButton().setVisible(true);
            UserFrame.getUserMessageBox().setVisible(false);
            UserFrame.getUserMessageBox().setText("Add Favorites");
            UserFrame.getSongTitleLabel().setVisible(false);
            UserFrame.getSongURLLabel().setVisible(false);
            UserFrame.getSongTitleTF().setVisible(false);
            UserFrame.getSongURLTF().setVisible(false);
            UserFrame.getArtistTitleLabel().setVisible(false);
            UserFrame.getArtistTitleTF().setVisible(false);
            UserFrame.getAlbumTitleLabel().setVisible(false);
            UserFrame.getAlbumYearAppLabel().setVisible(false);
            UserFrame.getAlbumTitleTF().setVisible(false);
            UserFrame.getAlbumYearAppTF().setVisible(false);
            UserFrame.getFavoritesAlbumIdLabel().setVisible(false);
            UserFrame.getFavoritesUserIdLabel().setVisible(false);
            UserFrame.getFavoritesAlbumIdTF().setVisible(false);
            UserFrame.getFavoritesUserIdTF().setVisible(false);
            UserFrame.getPlaylistTitleLabel().setVisible(false);
            UserFrame.getPlaylistSongIdLabel().setVisible(false);
            UserFrame.getPlaylistCreatorIdLabel().setVisible(false);
            UserFrame.getPlaylistTitleTF().setVisible(false);
            UserFrame.getPlaylistSongIdTF().setVisible(false);
            UserFrame.getPlaylistCreatorIdTF().setVisible(false);
            UserFrame.getStatusOperationLabel().setVisible(false);

            UserFrame.getFavoritesAlbumIdLabel().setVisible(true);
            UserFrame.getFavoritesUserIdLabel().setVisible(true);
            UserFrame.getFavoritesAlbumIdTF().setVisible(true);
            UserFrame.getFavoritesUserIdTF().setVisible(true);
            UserFrame.getUserMessageBox().setVisible(true);
        }
    }

    private class SubmitBtnActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (UserFrame.getUserMessageBox().getText().equals("Add Song")) {
                UserFrame.getStatusOperationLabel().setVisible(true);
                UserFrame.getStatusOperationLabel().setText("Song Added");
                MySQLConnection mySQLConnection = new MySQLConnection();
                mySQLConnection.initConnection("Call Add_Song('" + UserFrame.getSongTitleInput() + "', "+ null +",' " + UserFrame.getSongURLInput() +"', "+ null +  ");", 1);
            }else if (UserFrame.getUserMessageBox().getText().equals("Add Album")) {
                UserFrame.getStatusOperationLabel().setVisible(true);
                UserFrame.getStatusOperationLabel().setText("Album Added");
                MySQLConnection mySQLConnection = new MySQLConnection();
                mySQLConnection.initConnection("Call Add_Albums('" + UserFrame.getAlbumTitleInput() + "', " + UserFrame.getAlbumYearAppInput() + ");", 1);
            }
            else if(UserFrame.getUserMessageBox().getText().equals("Add Artist")){
                UserFrame.getStatusOperationLabel().setVisible(true);
                UserFrame.getStatusOperationLabel().setText("Artist Added");
                MySQLConnection mySQLConnection = new MySQLConnection();
                mySQLConnection.initConnection("call add_artists('" + UserFrame.getArtistTitleInput() + "');", 1);
            }
            else if(UserFrame.getUserMessageBox().getText().equals("Create Playlist")){
                UserFrame.getStatusOperationLabel().setVisible(true);
                UserFrame.getStatusOperationLabel().setText("Playlist Created");
                MySQLConnection mySQLConnection = new MySQLConnection();
                mySQLConnection.initConnection("Call Create_playlist('" + UserFrame.getPlaylistTitleInput() + "', " + UserFrame.getPlaylistSongIdInput() + ", " + UserFrame.getPlaylistCreatorIdInput() + ");", 1);
            }
            else if(UserFrame.getUserMessageBox().getText().equals("Add Favorites")){
                UserFrame.getStatusOperationLabel().setVisible(true);
                UserFrame.getStatusOperationLabel().setText("Favorites Added");
                MySQLConnection mySQLConnection = new MySQLConnection();
                mySQLConnection.initConnection("Call Add_Favorites(" + UserFrame.getFavoritesUserIdInput() + ", " + UserFrame.getFavoritesAlbumIdInput() + ");", 1);
            }
        }
    }
}
