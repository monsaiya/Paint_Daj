package com.example.monsaiya.paint_daj;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CanvasView canvasView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        canvasView = (CanvasView) findViewById(R.id.canvas);
        CanvasView v = new CanvasView(getApplicationContext());





    }

    public void clear(View v){
        canvasView.clearCanvas();

    }

    public void save(View v){
        canvasView.save();


    }
}
