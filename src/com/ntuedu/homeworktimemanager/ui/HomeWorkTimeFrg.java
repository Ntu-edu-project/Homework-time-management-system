package com.ntuedu.homeworktimemanager.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ntuedu.homeworktimemanager.R;

public class HomeWorkTimeFrg extends Fragment {

	
	public HomeWorkTimeFrg() {
		// TODO Auto-generated constructor stub
	}


	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}
	

	@Override
	@Nullable
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		View view = inflater.inflate(R.layout.homework_frg,container,false);
		
		return view;

	}

}
