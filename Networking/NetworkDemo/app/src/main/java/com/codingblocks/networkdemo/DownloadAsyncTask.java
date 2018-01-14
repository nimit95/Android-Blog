package com.codingblocks.networkdemo;

import android.os.AsyncTask;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by nimit on 14/1/18.
 */

public class DownloadAsyncTask extends AsyncTask<String, Void, String> {


    private TextView tvResult;


    public DownloadAsyncTask(TextView tvResult) {
        this.tvResult = tvResult;
    }


    protected String doInBackground(String... strings) {
        // Some long-running task in backgorund

        URL url = null;
        String result = "";
        try {
            url = new URL(strings[0]);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        HttpURLConnection connection = null;

        try {
            connection = (HttpURLConnection) url.openConnection();
            //Gives the data in form of bytes
            InputStream netInputStream = connection.getInputStream();

            //Converts that byte data using charset
            InputStreamReader isr = new InputStreamReader(netInputStream);

            //Helps read data in chunks
            BufferedReader br = new BufferedReader(isr);

            StringBuilder sb = new StringBuilder();
            String buffer = "";

            while(buffer!=null) {
                sb.append(buffer);
                buffer = br.readLine(); // Returns null after all work
            }

            result = sb.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    protected void onPostExecute(String result) {
        tvResult.setText(result);

    }
}
