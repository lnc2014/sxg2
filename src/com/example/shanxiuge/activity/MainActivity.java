package com.example.shanxiuge.activity;

import com.example.shanxiuge.R;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity implements OnClickListener {
	Button btn_regist, btn_login;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initUI();
	}

	private void initUI() {
		btn_regist = (Button) findViewById(R.id.bt_regist);
		btn_regist.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.bt_regist:
			Intent regitst = new Intent(MainActivity.this, RegistAcitivty.class);
			startActivity(regitst);

			break;

		default:
			break;
		}
	}

}
