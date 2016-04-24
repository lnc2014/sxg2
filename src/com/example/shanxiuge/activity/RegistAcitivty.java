package com.example.shanxiuge.activity;

import com.example.shanxiuge.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.widget.TextView;

public class RegistAcitivty extends Activity {

	TextView text_statement;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);

		initUI();

	}

	private void initUI() {
		text_statement = (TextView) findViewById(R.id.text_statement);

		SpannableString sp = new SpannableString("点击下一步，即表示您已经仔细阅读并同意《闪修哥免责声明》");
		sp.setSpan(new URLSpan("www.baidu.com"), 19, 28,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

		sp.setSpan(new ForegroundColorSpan(R.color.registback), 19, 28,
				Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		text_statement.setText(sp);

	}

}
