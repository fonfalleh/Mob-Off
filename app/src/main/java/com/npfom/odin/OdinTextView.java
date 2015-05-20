package com.npfom.odin;

import android.widget.TextView;

/**
 * Created by bjornahlander on 15-05-12.
 */
public class OdinTextView implements RequestInterface {
    private TextView textView = null;

    public OdinTextView(TextView tw) {
        textView = tw;
    }

    @Override
    public void process(String str) {
        if (str.startsWith("{\"error\":false")) {
            textView.append("\nReport sent successfully!");
        } else {
            textView.append("\nReport failed!\nPlease check you internet connection and try again." +
                    "\nError Message: " + str);
        }
    }
}

