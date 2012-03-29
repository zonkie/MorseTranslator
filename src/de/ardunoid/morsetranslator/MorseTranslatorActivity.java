package de.ardunoid.morsetranslator;

import android.R.string;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MorseTranslatorActivity extends Activity {

	static Long dit = (long) 100; // 300 ms
	static Long dah = (long) 3 * dit;
	static Long charbreak = (long)  3 * dit;
	static Long symbolbreak = (long)  dit;
	static Long wordbreakbreak = (long) 3 * dah;

	static long[] pattern_A = { 0, dit, symbolbreak, dah };
	static long[] pattern_B = { 0, dah, symbolbreak, dit, symbolbreak, dit,
			symbolbreak, dit };
	static long[] pattern_C = { 0, dah, symbolbreak, dit, symbolbreak, dah,
			symbolbreak, dit };
	static long[] pattern_D = { 0, dah, symbolbreak, dit, symbolbreak, dit };
	static long[] pattern_E = { 0, dit };
	static long[] pattern_F = { 0, dit, symbolbreak, dit, symbolbreak, dah,
			symbolbreak, dit };
	static long[] pattern_G = { 0, dah, symbolbreak, dah, symbolbreak, dit };
	static long[] pattern_H = { 0, dit, symbolbreak, dit, symbolbreak, dit,
			symbolbreak, dit };
	static long[] pattern_I = { 0, dit, symbolbreak, dit };
	static long[] pattern_J = { 0, dit, symbolbreak, dah, symbolbreak, dah,
			symbolbreak, dah };
	static long[] pattern_K = { 0, dah, symbolbreak, dit, symbolbreak, dah };
	static long[] pattern_L = { 0, dit, symbolbreak, dah, symbolbreak, dit,
			symbolbreak, dit };
	static long[] pattern_M = { 0, dah, symbolbreak, dah };
	static long[] pattern_N = { 0, dah, symbolbreak, dit };
	static long[] pattern_O = { 0, dah, symbolbreak, dah, symbolbreak, dah };
	static long[] pattern_P = { 0, dit, symbolbreak, dah, symbolbreak, dah,
			symbolbreak, dit };
	static long[] pattern_Q = { 0, dah, symbolbreak, dah, symbolbreak, dit,
			symbolbreak, dah };
	static long[] pattern_R = { 0, dit, symbolbreak, dah, symbolbreak, dit };
	static long[] pattern_S = { 0, dit, symbolbreak, dit, symbolbreak, dit };
	static long[] pattern_T = { 0, dah };
	static long[] pattern_U = { 0, dit, symbolbreak, dit, symbolbreak, dah };
	static long[] pattern_V = { 0, dit, symbolbreak, dit, symbolbreak, dit,
			symbolbreak, dah };
	static long[] pattern_W = { 0, dit, symbolbreak, dah, symbolbreak, dah };
	static long[] pattern_X = { 0, dah, symbolbreak, dit, symbolbreak, dit,
			symbolbreak, dah };
	static long[] pattern_Y = { 0, dah, symbolbreak, dit, symbolbreak, dah,
			symbolbreak, dah };
	static long[] pattern_Z = { 0, dah, symbolbreak, dah, symbolbreak, dit,
			symbolbreak, dit };
	static long[] pattern_0 = { 0, dah, symbolbreak, dah, symbolbreak, dah,
			symbolbreak, dah, symbolbreak, dah };
	static long[] pattern_1 = { 0, dit, symbolbreak, dah, symbolbreak, dah,
			symbolbreak, dah, symbolbreak, dah };
	static long[] pattern_2 = { 0, dit, symbolbreak, dit, symbolbreak, dah,
			symbolbreak, dah, symbolbreak, dah };
	static long[] pattern_3 = { 0, dit, symbolbreak, dit, symbolbreak, dit,
			symbolbreak, dah, symbolbreak, dah };
	static long[] pattern_4 = { 0, dit, symbolbreak, dit, symbolbreak, dit,
			symbolbreak, dit, symbolbreak, dah };
	static long[] pattern_5 = { 0, dit, symbolbreak, dit, symbolbreak, dit,
			symbolbreak, dit, symbolbreak, dit };
	static long[] pattern_6 = { 0, dah, symbolbreak, dit, symbolbreak, dit,
			symbolbreak, dit, symbolbreak, dit };
	static long[] pattern_7 = { 0, dah, symbolbreak, dah, symbolbreak, dit,
			symbolbreak, dit, symbolbreak, dit };
	static long[] pattern_8 = { 0, dah, symbolbreak, dah, symbolbreak, dah,
			symbolbreak, dit, symbolbreak, dit };
	static long[] pattern_9 = { 0, dah, symbolbreak, dah, symbolbreak, dah,
			symbolbreak, dah, symbolbreak, dit };
	static long[] pattern_charbreak = { 0, 1, charbreak };
	static long[] pattern_wordbreak = { 0, 1, wordbreakbreak };

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	public void onClickCancel(final View view) {
		Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		v.cancel();
	}
	public void onClickTranslate(final View view) {

		try {
Log.d("test","test");
			Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

			EditText et = (EditText) findViewById(R.id.editText1);
			String text = et.getText().toString();
			// long[] pattern = {0} ;
			Context context = getApplicationContext();
			Toast toast = Toast.makeText(context, text, 50);
			toast.show();


			char[] singlechars = text.toCharArray();
			Log.d("test",String.valueOf(singlechars.length));
			for (char c : singlechars) {
				Log.d("test", String.valueOf(c));
				long[] pattern = null;
				if (Character.toUpperCase(c) == 'A') {
					pattern = pattern_A;
				}
				if (Character.toUpperCase(c) == 'B') {
					pattern = pattern_B;
				}
				if (Character.toUpperCase(c) == 'C') {
					pattern = pattern_C;
				}
				if (Character.toUpperCase(c) == 'D') {
					pattern = pattern_D;
				}
				if (Character.toUpperCase(c) == 'E') {
					pattern = pattern_E;
				}
				if (Character.toUpperCase(c) == 'F') {
					pattern = pattern_F;
				}
				if (Character.toUpperCase(c) == 'G') {
					pattern = pattern_G;
				}
				if (Character.toUpperCase(c) == 'H') {
					pattern = pattern_H;
				}
				if (Character.toUpperCase(c) == 'I') {
					pattern = pattern_I;
				}
				if (Character.toUpperCase(c) == 'J') {
					pattern = pattern_J;
				}
				if (Character.toUpperCase(c) == 'K') {
					pattern = pattern_K;
				}
				if (Character.toUpperCase(c) == 'L') {
					pattern = pattern_L;
				}
				if (Character.toUpperCase(c) == 'M') {
					pattern = pattern_M;
				}
				if (Character.toUpperCase(c) == 'N') {
					pattern = pattern_N;
				}
				if (Character.toUpperCase(c) == 'O') {
					pattern = pattern_O;
				}
				if (Character.toUpperCase(c) == 'P') {
					pattern = pattern_P;
				}
				if (Character.toUpperCase(c) == 'Q') {
					pattern = pattern_Q;
				}
				if (Character.toUpperCase(c) == 'R') {
					pattern = pattern_R;
				}
				if (Character.toUpperCase(c) == 'S') {
					pattern = pattern_S;
				}
				if (Character.toUpperCase(c) == 'T') {
					pattern = pattern_T;
				}
				if (Character.toUpperCase(c) == 'U') {
					pattern = pattern_U;
				}
				if (Character.toUpperCase(c) == 'V') {
					pattern = pattern_V;
				}
				if (Character.toUpperCase(c) == 'W') {
					pattern = pattern_W;
				}
				if (Character.toUpperCase(c) == 'X') {
					pattern = pattern_X;
				}
				if (Character.toUpperCase(c) == 'Y') {
					pattern = pattern_Y;
				}
				if (Character.toUpperCase(c) == 'Z') {
					pattern = pattern_Z;
				}
				if (Character.toUpperCase(c) == '0') {
					pattern = pattern_0;
				}
				if (Character.toUpperCase(c) == '1') {
					pattern = pattern_1;
				}
				if (Character.toUpperCase(c) == '2') {
					pattern = pattern_2;
				}
				if (Character.toUpperCase(c) == '3') {
					pattern = pattern_3;
				}
				if (Character.toUpperCase(c) == '4') {
					pattern = pattern_4;
				}
				if (Character.toUpperCase(c) == '5') {
					pattern = pattern_5;
				}
				if (Character.toUpperCase(c) == '6') {
					pattern = pattern_6;
				}
				if (Character.toUpperCase(c) == '7') {
					pattern = pattern_7;
				}
				if (Character.toUpperCase(c) == '8') {
					pattern = pattern_8;
				}
				if (Character.toUpperCase(c) == '9') {
					pattern = pattern_9;
				}
				if (Character.toUpperCase(c) == ' ') {
					pattern = pattern_wordbreak;
				}

				//Toast toast3 = Toast.makeText(context, String.valueOf(c), 1);
				//toast3.show();
				v.vibrate(pattern, -1);
				for (long step : pattern) {
					Log.d("test", String.valueOf(step));
	                try {
                        Thread.sleep(step);
	                } catch (Exception e) {
	                        
	                } 
				}
				v.cancel();
				v.vibrate(pattern_charbreak, -1);
				for (long step : pattern_charbreak) {
					Log.d("test", String.valueOf(step));
	                try {
                        Thread.sleep(step);
	                } catch (Exception e) {
	                        
	                } 
				}
				v.cancel();
			}

		} catch (Exception e) {

		}

	}
}