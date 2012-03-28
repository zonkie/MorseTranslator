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
	
	 static Long dit = (long) 1200; //300 ms
	 static Long dah = (long)3*dit;
	 static Long charbreak = (long)dah;
	 static Long symbolbreak = (long)dit;
	 static Long wordbreakbreak = (long)7*dit;
	
	 static long[] pattern_A = {0, dit, symbolbreak, dah};
	 static long[] pattern_B  = {0, dah, symbolbreak, dit, symbolbreak,  dit, symbolbreak,  dit};
	 static long[] pattern_C  = {0, dah, symbolbreak, dit, symbolbreak,  dah, symbolbreak,  dit};
	 static long[] pattern_D  = {0, dah, symbolbreak, dit, symbolbreak,  dit};
	 static long[] pattern_E  = {0, dit};
	 static long[] pattern_F  = {0, dit, symbolbreak, dit, symbolbreak,  dah, symbolbreak,  dit};
	 static long[] pattern_G  = {0, dah, symbolbreak, dah, symbolbreak,  dit};
	 static long[] pattern_H  = {0, dit, symbolbreak, dit, symbolbreak,  dit, symbolbreak,  dit};
	 static long[] pattern_I  = {0, dit, symbolbreak, dit};
	 static long[] pattern_J  = {0, dit, symbolbreak, dah, symbolbreak,  dah, symbolbreak,  dah};
	 static long[] pattern_K  = {0, dah, symbolbreak, dit, symbolbreak,  dah};
	 static long[] pattern_L  = {0, dit, symbolbreak, dah, symbolbreak,  dit, symbolbreak,  dit};
	 static long[] pattern_M  = {0, dah, symbolbreak, dah};
	 static long[] pattern_N  = {0, dah, symbolbreak, dit};
	 static long[] pattern_O  = {0, dah, symbolbreak, dah, symbolbreak,  dah};
	 static long[] pattern_P  = {0, dit, symbolbreak, dah, symbolbreak,  dah, symbolbreak,  dit};
	 static long[] pattern_Q  = {0, dah, symbolbreak, dah, symbolbreak,  dit, symbolbreak,  dah};
	 static long[] pattern_R  = {0, dit, symbolbreak, dah, symbolbreak,  dit};
	 static long[] pattern_S  = {0, dit, symbolbreak, dit, symbolbreak,  dit};
	 static long[] pattern_T  = {0, dah};
	 static long[] pattern_U  = {0, dit, symbolbreak, dit, symbolbreak,  dah};
	 static long[] pattern_V  = {0, dit, symbolbreak, dit, symbolbreak,  dit, symbolbreak,  dah};
	 static long[] pattern_W  = {0, dit, symbolbreak, dah, symbolbreak,  dah};
	 static long[] pattern_X  = {0, dah, symbolbreak, dit, symbolbreak,  dit, symbolbreak,  dah};
	 static long[] pattern_Y  = {0, dah, symbolbreak, dit, symbolbreak,  dah, symbolbreak,  dah};
	 static long[] pattern_Z  = {0, dah, symbolbreak, dah, symbolbreak,  dit, symbolbreak,  dit};
	 static long[] pattern_0  = {0, dah, symbolbreak, dah, symbolbreak,  dah, symbolbreak,  dah, symbolbreak,  dah};
	 static long[] pattern_1  = {0, dit, symbolbreak, dah, symbolbreak,  dah, symbolbreak,  dah, symbolbreak,  dah};
	 static long[] pattern_2  = {0, dit, symbolbreak, dit, symbolbreak,  dah, symbolbreak,  dah, symbolbreak,  dah};
	 static long[] pattern_3  = {0, dit, symbolbreak, dit, symbolbreak,  dit, symbolbreak,  dah, symbolbreak,  dah};
	 static long[] pattern_4  = {0, dit, symbolbreak, dit, symbolbreak,  dit, symbolbreak,  dit, symbolbreak,  dah};
	 static long[] pattern_5  = {0, dit, symbolbreak, dit, symbolbreak,  dit, symbolbreak,  dit, symbolbreak,  dit};
	 static long[] pattern_6  = {0, dah, symbolbreak, dit, symbolbreak,  dit, symbolbreak,  dit, symbolbreak,  dit};
	 static long[] pattern_7  = {0, dah, symbolbreak, dah, symbolbreak,  dit, symbolbreak,  dit, symbolbreak,  dit};
	 static long[] pattern_8  = {0, dah, symbolbreak, dah, symbolbreak,  dah, symbolbreak,  dit, symbolbreak,  dit};
	 static long[] pattern_9  = {0, dah, symbolbreak, dah, symbolbreak,  dah, symbolbreak,  dah, symbolbreak,  dit}; 
	 static long[] pattern_charbreak  = {0, 1,charbreak};
	 static long[] pattern_wordbreak  = {0, 1,wordbreakbreak};
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
	public void onClickTranslate(final View view) {


	    	Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

	    	EditText et = (EditText)findViewById(R.id.editText1);
	    	String text = et.getText().toString(); 

			Context context = getApplicationContext();
			int duration = Toast.LENGTH_LONG;
			Toast toast = Toast.makeText(context, text, 50);
			toast.show();
	    	

	    	
	    	char[] singlechars = text.toCharArray();
			for (char c : singlechars) {

 	    		if (Character.toUpperCase(c) == 'A'){v.vibrate (pattern_A, -1);}
 	    		if (Character.toUpperCase(c) == 'B'){v.vibrate (pattern_B, -1);}
 	    		if (Character.toUpperCase(c) == 'C'){v.vibrate (pattern_C, -1);}
 	    		if (Character.toUpperCase(c) == 'D'){v.vibrate (pattern_D, -1);}
 	    		if (Character.toUpperCase(c) == 'E'){v.vibrate (pattern_E, -1);}
 	    		if (Character.toUpperCase(c) == 'F'){v.vibrate (pattern_F, -1);}
 	    		if (Character.toUpperCase(c) == 'G'){v.vibrate (pattern_G, -1);}
 	    		if (Character.toUpperCase(c) == 'H'){v.vibrate (pattern_H, -1);}
 	    		if (Character.toUpperCase(c) == 'I'){v.vibrate (pattern_I, -1);}
 	    		if (Character.toUpperCase(c) == 'J'){v.vibrate (pattern_J, -1);}
 	    		if (Character.toUpperCase(c) == 'K'){v.vibrate (pattern_K, -1);}
 	    		if (Character.toUpperCase(c) == 'L'){v.vibrate (pattern_L, -1);}
 	    		if (Character.toUpperCase(c) == 'M'){v.vibrate (pattern_M, -1);}
 	    		if (Character.toUpperCase(c) == 'N'){v.vibrate (pattern_N, -1);}
 	    		if (Character.toUpperCase(c) == 'O'){v.vibrate (pattern_O, -1);}
 	    		if (Character.toUpperCase(c) == 'P'){v.vibrate (pattern_P, -1);}
 	    		if (Character.toUpperCase(c) == 'Q'){v.vibrate (pattern_Q, -1);}
 	    		if (Character.toUpperCase(c) == 'R'){v.vibrate (pattern_R, -1);}
 	    		if (Character.toUpperCase(c) == 'S'){v.vibrate (pattern_S, -1);}
 	    		if (Character.toUpperCase(c) == 'T'){v.vibrate (pattern_T, -1);}
 	    		if (Character.toUpperCase(c) == 'U'){v.vibrate (pattern_U, -1);}
 	    		if (Character.toUpperCase(c) == 'V'){v.vibrate (pattern_V, -1);}
 	    		if (Character.toUpperCase(c) == 'W'){v.vibrate (pattern_W, -1);}
 	    		if (Character.toUpperCase(c) == 'X'){v.vibrate (pattern_X, -1);}
 	    		if (Character.toUpperCase(c) == 'Y'){v.vibrate (pattern_Y, -1);}
 	    		if (Character.toUpperCase(c) == 'Z'){v.vibrate (pattern_Z, -1);}
 	    		if (Character.toUpperCase(c) == '0'){v.vibrate (pattern_0, -1);}
 	    		if (Character.toUpperCase(c) == '1'){v.vibrate (pattern_1, -1);}
 	    		if (Character.toUpperCase(c) == '2'){v.vibrate (pattern_2, -1);}
 	    		if (Character.toUpperCase(c) == '3'){v.vibrate (pattern_3, -1);}
 	    		if (Character.toUpperCase(c) == '4'){v.vibrate (pattern_4, -1);}
 	    		if (Character.toUpperCase(c) == '5'){v.vibrate (pattern_5, -1);}
 	    		if (Character.toUpperCase(c) == '6'){v.vibrate (pattern_6, -1);}
 	    		if (Character.toUpperCase(c) == '7'){v.vibrate (pattern_7, -1);}
 	    		if (Character.toUpperCase(c) == '8'){v.vibrate (pattern_8, -1);}
 	    		if (Character.toUpperCase(c) == '9'){v.vibrate (pattern_9, -1);}
				if (Character.toUpperCase(c) == ' '){v.vibrate (pattern_wordbreak, -1);}
				
	    		v.vibrate (pattern_charbreak, -1);
			}

    }
}