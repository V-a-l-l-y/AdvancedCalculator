package com.example.calc;

import org.mariuszgromada.math.mxparser.*;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button simpleButton, advancedButton, aboutButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);
        simpleButton = (Button) findViewById(R.id.buttonSimple);
        simpleButton.setOnClickListener(v -> openSimpleActivity());
        advancedButton = (Button) findViewById(R.id.buttonAdv);
        advancedButton.setOnClickListener(v -> openAdvancedActivity());
        aboutButton = (Button) findViewById(R.id.buttonAbout);
        aboutButton.setOnClickListener(v -> openAboutActivity());

    }
    public void openSimpleActivity(){
        Intent intent = new Intent(this, SimpleActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
    public void openAdvancedActivity(){
        Intent intent = new Intent(this, AdvancedActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
    public void openAboutActivity(){
        Intent intent = new Intent(this, AboutActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
    public void exit(View view){
        finish();
        System.exit(0);
    }


//        if (savedInstanceState != null) {
//            currViewId = savedInstanceState.getInt(KEY_VIEW);
//            System.out.println("CREATE if: "+currViewId);
//        }
//        else {
//            currViewId = R.layout.start_screen;
//            System.out.println("CREATE else: "+android.R.id.content);
//        }
//        setContentView(currViewId);
//        problemText=(EditText) findViewById(R.id.problemText);

//    }

//    @Override
//    public void onSaveInstanceState(@NonNull Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putInt(KEY_VIEW, currViewId);
//    }

//    @Override
//    public void onConfigurationChanged(Configuration newConfig) {
//        super.onConfigurationChanged(newConfig);
//
//        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
//        {
//            if (newConfig.screenLayout==R.layout.start_screen){
//                setContentView(R.layout.start_screen);
//            } else if (newConfig.screenLayout==R.layout.activity_main) {
//                setContentView(R.layout.activity_main);
//            }
//
//
//        }
//        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
//        {
//            if (newConfig.screenLayout==R.layout.start_screen){
//                setContentView(R.layout.start_screen);
//            } else if (newConfig.screenLayout==R.layout.activity_main) {
//                setContentView(R.layout.activity_main);
//            }
//        }
//    }
//    public void simpleView(View view){
//        currViewId = R.layout.activity_main;
//        setContentView(currViewId);
//        problemText = findViewById(R.id.problemText);
//        problemText.setShowSoftInputOnFocus(false);
//    }
//    public void advancedView(View view){
//        currViewId = R.layout.advanced_calc;
//        setContentView(currViewId);
//        problemText = findViewById(R.id.problemText);
//        problemText.setShowSoftInputOnFocus(false);
//    }
//    public void aboutView(View view){
//        currViewId = R.layout.about_page;
//        setContentView(currViewId);
//    }
//    public void back(View view){
//        currViewId = R.layout.start_screen;
//        setContentView(currViewId);
//    }


//    private void updateDisp(String toDisp){
//        String wasThere = problemText.getText().toString();
//
//        int cursorPos = problemText.getSelectionStart();
//        String leftStr = wasThere.substring (0, cursorPos);
//        String rightStr = wasThere. substring (cursorPos);
//
//        if(_allowDots){
//
//            if (toDisp.contains(".")){
//                _allowDots = false;
//            }
//        }else {
//            if (!toDisp.contains(".")){
//                _allowDots = true;
//            }
//        }
//
//        problemText.setText(String.format("%s%s%s", leftStr, toDisp, rightStr));
//        problemText.setSelection(cursorPos + toDisp.length());
//
//
//    }
//
//    public void equalsDisp(View view){
//        String userExp = problemText.getText().toString();
//        if (userExp.startsWith("+") || userExp.startsWith("-") ||
//                userExp.startsWith("*") || userExp.startsWith("/")){
//            userExp=savedResult+"+"+userExp;
//        }
//
//        Expression exp = new Expression (userExp);
//        String result = String.valueOf(exp.calculate());
//        if (result.equals("NaN")){
//            Toast.makeText(getApplicationContext(), "you can't do that here", Toast.LENGTH_SHORT).show();
//            currResult="0";
//        }
//        problemText.setText(result);
//        problemText.setSelection(result.length());
//
//
//        currResult=result;
//    }
//
//    public void signChangeDisp(View view){
//        String wasThere = problemText.getText().toString();
//        String toCalc = "-"+wasThere;
//        Expression exp = new Expression (toCalc);
//        String result = String.valueOf(exp.calculate());
//        problemText.setText(result);
//        problemText.setSelection(result.length());
//    }
//    public void zeroDisp(View view){
//        updateDisp(getResources().getString(R.string.zeroText));
//    }
//    public void oneDisp(View view){
//        updateDisp(getResources().getString(R.string.oneText));
//    }
//    public void twoDisp(View view){
//        updateDisp(getResources().getString(R.string.twoText));
//    }
//    public void threeDisp(View view){
//        updateDisp(getResources().getString(R.string.threeText));
//    }
//    public void fourDisp(View view){
//        updateDisp(getResources().getString(R.string.fourText));
//    }
//    public void fiveDisp(View view){
//        updateDisp(getResources().getString(R.string.fiveText));
//    }
//    public void sixDisp(View view){
//        updateDisp(getResources().getString(R.string.sixText));
//    }
//    public void sevenDisp(View view){
//        updateDisp(getResources().getString(R.string.sevenText));
//    }
//    public void eightDisp(View view){
//        updateDisp(getResources().getString(R.string.eightText));
//    }
//    public void nineDisp(View view){
//        updateDisp(getResources().getString(R.string.nineText));
//    }
//    public void dotDisp(View view){
//        if (_allowDots){
//            updateDisp(getResources().getString(R.string.decimalText));
//        }
//    }
//    public void addDisp(View view){
//        updateDisp(getResources().getString(R.string.addText));
//    }
//    public void subDisp(View view){
//        updateDisp(getResources().getString(R.string.subtractText));
//    }
//    public void multDisp(View view){
//        updateDisp(getResources().getString(R.string.multiplyText));
//    }
//    public void divDisp(View view){
//        updateDisp(getResources().getString(R.string.divideText));
//    }
//    public void sqrtDisp(View view){
//        updateDisp("sqrt()");
//        problemText.setSelection("sqrt()".length()-1);
//    }
//    public void procDisp(View view){
//        updateDisp("%");
//    }
//    public void power2Disp(View view){
//        updateDisp("^(2)");
//    }
//    public void powerYDisp(View view){
//        updateDisp("^()");
//        problemText.setSelection("^()".length());
//
//    }
//    public void sinDisp(View view){
//        updateDisp("sin()");
//        problemText.setSelection("sin()".length()-1);
//
//    }
//    public void cosDisp(View view){
//        updateDisp("cos()");
//        problemText.setSelection("cos()".length()-1);
//
//    }
//    public void tanDisp(View view){
//        updateDisp("tan()");
//        problemText.setSelection("tan()".length()-1);
//
//    }
//    public void lnDisp(View view){
//        updateDisp("ln()");
//        problemText.setSelection("ln()".length()-1);
//
//    }
//    public void lgDisp(View view){
//        updateDisp("lg()");
//        problemText.setSelection("lg()".length()-1);
//
//    }
//
//
//    public void clearDisp(View view){
//       savedResult= "".concat(currResult);
//       problemText.setText("");
//    }
//    public void allClearDisp(View view){
//        problemText.setText("");
//        currResult="0";
//        savedResult="0";
//    }


}