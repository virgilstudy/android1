package com.example.hellovirgil;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);// 隐藏掉标题栏
		setContentView(R.layout.first_layout);
		Button button1 = (Button) findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(FirstActivity.this, "Click Button1", Toast.LENGTH_SHORT).show();
			}
		});
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		/*
		 * inflate()，第一个参数指定哪个资源文件创建菜单 第二个参数指定菜单项添加到哪一个Menu对象中
		 */
		getMenuInflater().inflate(R.menu.main, menu);
		/*
		 * true代表允许创建的菜单显示 false不允许显示
		 */
		return true;
	}

	public boolean onMenuItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.add_item:
			Toast.makeText(this, "You click add", Toast.LENGTH_SHORT).show();
			break;
		case R.id.remove_item:
			Toast.makeText(this, "You click remove", Toast.LENGTH_SHORT).show();
			break;
		default:
		}
		return true;
	}

}
