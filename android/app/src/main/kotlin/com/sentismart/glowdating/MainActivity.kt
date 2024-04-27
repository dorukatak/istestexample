package com.sentismart.glowdating


import android.content.Intent;
import android.os.Bundle;



//import io.flutter.app.FlutterActivity;
//import io.flutter.plugins.GeneratedPluginRegistrant;
import androidx.annotation.NonNull;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.GeneratedPluginRegistrant;


class MainActivity: FlutterActivity() {
    override fun onNewIntent(intent : Intent){
        super.onNewIntent(intent);
        setIntent(intent)
    }
}

