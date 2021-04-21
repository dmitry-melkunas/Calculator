package by.bsuir.calculatormelkunas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.udojava.evalex.Expression;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity  {

    TextView input, output;
    String final_result;
    public String function = "";
    BigDecimal result = null;
    Expression expression;
    final static String functionKey = "1";
    final static String resultKey = "2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final_result = "";

        Button all_clear = (Button) findViewById(R.id.all_clear);
        Button delete = (Button) findViewById(R.id.delete);
        Button percent = (Button) findViewById(R.id.percent);
        Button divide = (Button) findViewById(R.id.divide);
        Button number_7 = (Button) findViewById(R.id.number_7);
        Button number_8 = (Button) findViewById(R.id.number_8);
        Button number_9 = (Button) findViewById(R.id.number_9);
        Button multiplication = (Button) findViewById(R.id.multiplication);
        Button number_4 = (Button) findViewById(R.id.number_4);
        Button number_5 = (Button) findViewById(R.id.number_5);
        Button number_6 = (Button) findViewById(R.id.number_6);
        Button minus = (Button) findViewById(R.id.minus);
        Button number_1 = (Button) findViewById(R.id.number_1);
        Button number_2 = (Button) findViewById(R.id.number_2);
        Button number_3 = (Button) findViewById(R.id.number_3);
        Button plus = (Button) findViewById(R.id.plus);
        Button number_0 = (Button) findViewById(R.id.number_0);
        Button comma = (Button) findViewById(R.id.comma);
        Button equally = (Button) findViewById(R.id.equally);
        Button left_parenthesis = (Button) findViewById(R.id.left_parenthesis);
        Button right_parenthesis = (Button) findViewById(R.id.right_parenthesis);
        Button degree = (Button) findViewById(R.id.degree);
        Button sqrt = (Button) findViewById(R.id.sqrt);
        Button ln = (Button) findViewById(R.id.ln);
        Button log = (Button) findViewById(R.id.log);
        Button sin = (Button) findViewById(R.id.sin);
        Button cos = (Button) findViewById(R.id.cos);
        Button tan = (Button) findViewById(R.id.tan);
        Button e = (Button) findViewById(R.id.e);
        Button factorial = (Button) findViewById(R.id.factorial);

        input = (TextView) findViewById(R.id.input);
        output = (TextView) findViewById(R.id.output);
        input.setText("");
        output.setText("");


    }

    @Override
    protected void onSaveInstanceState (Bundle outState) {
        outState.putString(functionKey, function);
        outState.putString(resultKey, final_result);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState (Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        function = savedInstanceState.getString(functionKey);
        input.setText(function);
        final_result = savedInstanceState.getString(resultKey);
        output.setText(final_result);
    }



    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.number_1:
                function = function + "1";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.number_2:
                function = function + "2";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.number_3:
                function = function + "3";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.number_4:
                function = function + "4";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.number_5:
                function = function + "5";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.number_6:
                function = function + "6";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.number_7:
                function = function + "7";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.number_8:
                function = function + "8";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.number_9:
                function = function + "9";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.number_0:
                function = function + "0";
                input.setText(function);
                if (function.endsWith("/0")) {
                    Toast.makeText(this, "Нельзя делить на ноль!", Toast.LENGTH_LONG).show();
                }
                else {
                    try {
                        expression = new Expression(function);
                        result = expression.eval(false);
                    } catch (Exception e) {
                        return;
                    }
                }
                break;
            case R.id.all_clear:
                function = "";
                input.setText("");
                output.setText("");
                break;
            case R.id.divide:
                function = function + "/";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.multiplication:
                function = function + "*";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.minus:
                function = function + "-";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.plus:
                function = function + "+";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.comma:
                function = function + ".";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.equally:
                //input.setText(final_result);
                output.setText("");
                //function = final_result;
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                final_result = result.toString();
                output.setText(final_result);
                break;
            case R.id.left_parenthesis:
                function = function + "(";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.right_parenthesis:
                function = function + ")";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.delete:
                String input_string = function;
                final int strLength = function.length();
                if (strLength > 0) {
                    input_string = function.substring(0, function.length() - 1);
                }
                function = input_string;
                input.setText(function);
                break;
            case R.id.percent:
                function = function + "/100";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                final_result = result.toString();
                output.setText(final_result);
                break;
            case R.id.degree:
                function = function + "^";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.sqrt:
                function = function + "sqrt(";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.ln:
                function = function + "log(";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.log:
                function = function + "log10(";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.sin:
                function = function + "sin(";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.cos:
                function = function + "cos(";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.tan:
                function = function + "tan(";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.e:
                function = function + "e";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
            case R.id.factorial:
                function = function + "fact(";
                input.setText(function);
                try {
                    expression = new Expression(function);
                    result = expression.eval(false);
                }
                catch (Exception e){
                    return;
                }
                break;
        }
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.info) {
            Toast.makeText(getApplicationContext(),
                    "Разработчик: Мелкунас Дмитрий \nГруппа 711801, БГУИР 2020", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}