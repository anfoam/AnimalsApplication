package com.example.lenovo.animalsapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    private final ImageView imageAnimals[] = new ImageView[9];
    //object MediaPlayer ที่ใช้เล่นไฟล์เสียง
    private MediaPlayer mPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageAnimals[0] = (ImageView) findViewById(R.id.imgSheep);
        imageAnimals[1] = (ImageView) findViewById(R.id.imgRhino);
        imageAnimals[2] = (ImageView) findViewById(R.id.imgCat);
        imageAnimals[3] = (ImageView) findViewById(R.id.imgCow);
        imageAnimals[4] = (ImageView) findViewById(R.id.imgDog);
        imageAnimals[5] = (ImageView) findViewById(R.id.imgGoat);
        imageAnimals[6] = (ImageView) findViewById(R.id.imgHorse);
        imageAnimals[7] = (ImageView) findViewById(R.id.imgPig);
        imageAnimals[8] = (ImageView) findViewById(R.id.imgTiger);

        for (int i=0; i <imageAnimals.length; i++){
            imageAnimals[i].setOnClickListener(this);
        }


    }

    @Override
    public void onClick(View v) {
        int resID = 0;

        switch (v.getId()){
            case R.id.imgSheep:
                resID = R.raw.sheep;
                break;
            case R.id.imgRhino:
                resID = R.raw.rhinoceros;//แก้ไขให้ตรงกับไฟล์ของเรา
                break;
            case R.id.imgCat:
                resID = R.raw.cat; //แก้ไขให้ตรงกับไฟล์ของเรา
                break;
            case R.id.imgCow:
                resID = R.raw.cow; //แก้ไขให้ตรงกับไฟล์ของเรา
                break;
            case R.id.imgDog:
                resID = R.raw.dog; //แก้ไขให้ตรงกับไฟล์ของเรา
                break;
            case R.id.imgGoat:
                resID = R.raw.goat; //แก้ไขให้ตรงกับไฟล์ของเรา
                break;
            case R.id.imgHorse:
                resID = R.raw.horse; //แก้ไขให้ตรงกับไฟล์ของเรา
                break;
            case R.id.imgPig:
                resID = R.raw.pig; //แก้ไขให้ตรงกับไฟล์ของเรา
                break;
            case R.id.imgTiger:
                resID = R.raw.tiger; //แก้ไขให้ตรงกับไฟล์ของเรา
                break;
            default:
                resID = R.raw.nope;
        }
        playSound(resID);

    }

    private void playSound(int id) {
        if(mPlayer !=null){
            mPlayer.stop();
            mPlayer.release();
        }

        //สร้าง object MediaPlayer เพื่อเล่นเสียงตาม Resource ID ที่ระบุ
        mPlayer =MediaPlayer.create(this,id);
        mPlayer.start();

}
}
