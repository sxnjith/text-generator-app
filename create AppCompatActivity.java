package com.example.vikasojha.quizbee;

import android.os.Bundle;

public class AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
    }
}
package example.com;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Handler;

public class AboutFragment extends android.app.Fragment {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_screen);
    }

}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.about_screeen, container, false);
        return rootView;
    }
