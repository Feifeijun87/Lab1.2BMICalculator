package my.edu.tarc.lab12bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private EditText editTextHeight,editTextWeight;
    private TextView textViewResult;
    private ImageView imageViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextHeight = (EditText)findViewById(R.id.editTextHeight);
        editTextWeight = (EditText)findViewById(R.id.editTextWeight);
        textViewResult = (TextView) findViewById(R.id.textViewResult);
        imageViewResult = (ImageView) findViewById(R.id.imageViewResult);
    }

    public void calculateBMI(View view){
    double weight,height,BMI;
        weight = Double.parseDouble(editTextWeight.getText().toString());
        height = Double.parseDouble(editTextHeight.getText().toString());
        BMI = weight/(height*height);

        if (BMI<=18.5){
            imageViewResult.setImageResource(R.drawable.under);
            textViewResult.setText("BMI= " + BMI +". you are under weight");
        }
        else if (BMI>18.5 && BMI <=21){
            imageViewResult.setImageResource(R.drawable.normal);
            textViewResult.setText("BMI= " + BMI +". you are normal weight");
        }
        else if ( BMI > 21){
            imageViewResult.setImageResource(R.drawable.over);
            textViewResult.setText("BMI= " + BMI +". you are over weight");
        }
        else{
            imageViewResult.setImageResource(R.drawable.empty);
            textViewResult.setText("BMI");
        }
    }
    public void resetTest(View view){
        editTextHeight.setText("");
        editTextWeight.setText("");
        imageViewResult.setImageResource(R.drawable.empty);
        textViewResult.setText("BMI");
    }
}
