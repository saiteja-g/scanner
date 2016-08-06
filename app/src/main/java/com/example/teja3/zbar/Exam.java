package com.example.teja3.zbar;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class Exam extends Service {
    public Exam() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
