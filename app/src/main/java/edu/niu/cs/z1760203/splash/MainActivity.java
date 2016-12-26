/*****************************************************************************

 CSCI 522 - Assignment 3 - Semester - Spring 2016

 Programmer: Nitin Vinod Guda
 Section   : 1
 Date Due  : 04/01/2016

 Purpose   : The application starts with a splash screen
 that lets the user know the topic of the application. The
 home screen of the application has 6 images which the can
 click. When an image is clicked, the related sound is played.
 If the user selects a different image while a sound is playing,
 the original sound will be paused and then the new sound
 will start playing. If the user selects the same images
 as the sound that is currently playing, the sound will be paused.

 ******************************************************************************/


package edu.niu.cs.z1760203.splash;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    // Initializing variables to hold screen objects
    private MediaPlayer carbineMP,
                        augerMP,
                        rocketMP,
                        umpMP,
                        winMP,
                        mossMP;

    // Using imagebutton to diaplay an image which can be clicked
    private ImageButton carbineButton,
            augerButton,
            rocketButton,
            umpButton,
            winButton,
            mossButton;

    // defining the onCreate method
    // Called when the activity is first created.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connecting the initialized variables with the screen objects
        carbineButton = (ImageButton)findViewById(R.id.carbine);
        augerButton = (ImageButton)findViewById(R.id.auger);
        rocketButton = (ImageButton)findViewById(R.id.rocket);
        umpButton = (ImageButton)findViewById(R.id.ump);
        winButton = (ImageButton)findViewById(R.id.win);
        mossButton = (ImageButton)findViewById(R.id.moss);

        // Using MediaPlayer class to control playback of audio/video files and streams.
        carbineMP = MediaPlayer.create(this,R.raw.carbine);
        augerMP = MediaPlayer.create(this,R.raw.auger);
        rocketMP = MediaPlayer.create(this,R.raw.rocket);
        umpMP = MediaPlayer.create(this,R.raw.ump);
        winMP = MediaPlayer.create(this,R.raw.winc);
        mossMP = MediaPlayer.create(this,R.raw.shotgun);

        //Register a callback to be invoked when this button is clicked.
        carbineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if carbine mp3 is already playing then it should be paused
                if(carbineMP.isPlaying()){
                    carbineMP.pause();
                }//if ends here

                //if auger mp3 is playing, pause it and play carbine mp3
                else if(augerMP.isPlaying()){
                    augerMP.pause();
                    carbineMP.start();
                }//auger else ends here

                //if rocket mp3 is playing, pause it and play carbine mp3
                else if(rocketMP.isPlaying()){
                    rocketMP.pause();
                    carbineMP.start();
                }//rocket else ends here

                //if ump mp3 is playing, pause it and play carbine mp3
                else if(umpMP.isPlaying()){
                    umpMP.pause();
                    carbineMP.start();
                }//ump else ends here

                //if win mp3 is playing, pause it and play carbine mp3
                else if(winMP.isPlaying()){
                    winMP.pause();
                    carbineMP.start();
                }//win else ends here

                //if moss mp3 is playing, pause it and play carbine mp3
                else if(mossMP.isPlaying()){
                        mossMP.pause();
                        carbineMP.start();
                }//moss else ends here

                //else start carbine mp3
                else{
                    carbineMP.start();
                }//final else ends here

            }//onClick ends here
        });//onClickListener ends here

        augerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if auger mp3 is already playing then it should be paused
                if(augerMP.isPlaying()){
                    augerMP.pause();
                }//if ends here

                //if carbine mp3 is playing, pause it and play auger mp3
                else if(carbineMP.isPlaying()){
                    carbineMP.pause();
                    augerMP.start();
                }//carbine else ends here

                //if rocket mp3 is playing, pause it and play auger mp3
                else if(rocketMP.isPlaying()){
                    rocketMP.pause();
                    augerMP.start();
                }//rocket else ends here

                //if ump mp3 is playing, pause it and play auger mp3
                else if(umpMP.isPlaying()){
                    umpMP.pause();
                    augerMP.start();
                }//ump else ends here

                //if win mp3 is playing, pause it and play auger mp3
                else if(winMP.isPlaying()){
                    winMP.pause();
                    augerMP.start();
                }//win else ends here

                //if moss mp3 is playing, pause it and play auger mp3
                else if(mossMP.isPlaying()){
                    mossMP.pause();
                    augerMP.start();
                }//moss else ends here

                //else play auger mp3
                else{
                    augerMP.start();
                }//final else ends here

            }//onClick ends here
        });//onClickListener ends here

        rocketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if rocket mp3 is playing then it should be paused
                if(rocketMP.isPlaying()){
                    rocketMP.pause();
                }//if ends here

                //if carbine mp3 is playing, pause it and play rocket mp3
                else if(carbineMP.isPlaying()){
                    carbineMP.pause();
                    rocketMP.start();
                }//carbine else ends here

                //if auger mp3 is playing, pause it and play rocket mp3
                else if(augerMP.isPlaying()){
                    augerMP.pause();
                    rocketMP.start();
                }//auger else ends here

                //if ump mp3 is playing, pause it and play rocket mp3
                else if(umpMP.isPlaying()){
                    umpMP.pause();
                    rocketMP.start();
                }//ump else ends here

                //if win mp3 is playing, pause it and play rocket mp3
                else if(winMP.isPlaying()){
                    winMP.pause();
                    rocketMP.start();
                }//win else ends here

                //if moss mp3 is playing, pause it and play rocket mp3
                else if(mossMP.isPlaying()){
                    mossMP.pause();
                    rocketMP.start();
                }//moss else ends here

                //else play rocket mp3
                else{
                    rocketMP.start();
                }//final else ends here

            }//onClick ends here
        });//onClickListener ends here


        umpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if ump mp3 is playing then it should be paused
                if (umpMP.isPlaying()) {
                    umpMP.pause();
                }//if ends here

                //if carbine mp3 is playing, pause it and play ump mp3
                else if (carbineMP.isPlaying()) {
                    carbineMP.pause();
                    umpMP.start();
                }//carbine else ends here

                //if auger mp3 is playing, pause it and play ump mp3
                else if (augerMP.isPlaying()) {
                    augerMP.pause();
                    umpMP.start();
                }//auger else ends here

                //if rocket mp3 is playing, pause it and play ump mp3
                else if (rocketMP.isPlaying()) {
                    rocketMP.pause();
                    umpMP.start();
                }//rocket else ends here

                //if win mp3 is playing, pause it and play ump mp3
                else if (winMP.isPlaying()) {
                    winMP.pause();
                    umpMP.start();
                }//win else ends here

                //if moss mp3 is playing, pause it and play ump mp3
                else if (mossMP.isPlaying()) {
                    mossMP.pause();
                    umpMP.start();
                }//moss else ends here

                //else play ump mp3
                else {
                    umpMP.start();
                }//final else ends here

            }//onClick ends here
        });//onClickListener ends here



        winButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if win mp3 is playing then it should be paused
                if (winMP.isPlaying()) {
                    winMP.pause();
                }//if ends here

                //if carbine mp3 is playing, pause it and play win mp3
                else if (carbineMP.isPlaying()) {
                    carbineMP.pause();
                    winMP.start();
                }//carbine else ends here

                //if auger mp3 is playing, pause it and play win mp3
                else if (augerMP.isPlaying()) {
                    augerMP.pause();
                    winMP.start();
                }//auger else ends here

                //if win mp3 is playing, pause it and play win mp3
                else if (rocketMP.isPlaying()) {
                    rocketMP.pause();
                    winMP.start();
                }//rocket else ends here

                //if ump mp3 is playing, pause it and play win mp3
                else if (umpMP.isPlaying()) {
                    umpMP.pause();
                    winMP.start();
                }//ump else ends here

                //if moss mp3 is playing, pause it and play win mp3
                else if (mossMP.isPlaying()) {
                    mossMP.pause();
                    winMP.start();
                }//moss else ends here

                //else play win mp3
                else {
                    winMP.start();
                }//final else ends here

            }//onClick ends here
        });//onClickListener ends here


        mossButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if moss mp3 is playing then it should be paused
                if (mossMP.isPlaying()) {
                    mossMP.pause();
                }//if ends here

                //if carbine mp3 is playing, pause it and play moss mp3
                else if (carbineMP.isPlaying()) {
                    carbineMP.pause();
                    mossMP.start();
                }//carbine else ends here

                //if auger mp3 is playing, pause it and play moss mp3
                else if (augerMP.isPlaying()) {
                    augerMP.pause();
                    mossMP.start();
                }//auger else ends here

                //if rocket mp3 is playing, pause it and play moss mp3
                else if (rocketMP.isPlaying()) {
                    rocketMP.pause();
                    mossMP.start();
                }//rocket else ends here

                //if ump mp3 is playing, pause it and play moss mp3
                else if (umpMP.isPlaying()) {
                    umpMP.pause();
                    mossMP.start();
                }//ump else ends here

                //if win mp3 is playing, pause it and play moss mp3
                else if (winMP.isPlaying()) {
                    winMP.pause();
                    mossMP.start();
                }//win else ends here

                //else play moss mp3
                else {
                    mossMP.start();
                }//final else ends here

            }//onClick ends here
        });//onClickListener ends here

    }//onCreate ends here
}//MainActivity ends here
