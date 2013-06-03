package com.example.preferenceexample;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class MyPreference extends PreferenceActivity {

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.layout.preferences);
	}
}

