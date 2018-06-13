package david.tang.com.gradecalculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calculateButton = (Button) findViewById(R.id.calculateButton);
        //Runs when user clicks calculate button
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create editText for percents
                EditText homeworkPercentEditText = (EditText)findViewById(R.id.homeworkPercentEditText);
                EditText quizPercentEditText = (EditText)findViewById(R.id.quizPercentEditText);
                EditText midtermPercentEditText = (EditText)findViewById(R.id.midtermPercentEditText);
                EditText finalExamPercentEditText = (EditText)findViewById(R.id.finalExamPercentEditText);

                //Create editText for scores
                EditText homeworkScoreEditText = (EditText)findViewById(R.id.homeworkScoreEditText);
                EditText quizScoreEditText = (EditText)findViewById(R.id.quizScoreEditText);
                EditText midtermScoreEditText = (EditText)findViewById(R.id.midtermScoreEditText);
                EditText finalExamScoreEditText = (EditText)findViewById(R.id.finalExamScoreEditText);

                //Create textView for grade
                TextView gradeTextView = (TextView)findViewById(R.id.gradeTextView);

                //Get percents from editText
                double homeworkPercent = Double.parseDouble(homeworkPercentEditText.getText().toString());
                double quizPercent = Double.parseDouble(quizPercentEditText.getText().toString());
                double midtermPercent = Double.parseDouble(midtermPercentEditText.getText().toString());
                double finalExamPercent = Double.parseDouble(finalExamPercentEditText.getText().toString());

                //Get scores from editText
                double homeworkScore = Double.parseDouble(homeworkScoreEditText.getText().toString());
                double quizScore = Double.parseDouble(quizScoreEditText.getText().toString());
                double midtermScore = Double.parseDouble(midtermScoreEditText.getText().toString());
                double finalExamScore = Double.parseDouble(finalExamScoreEditText.getText().toString());

                //Calculate grade with percents and scores
                double grade = (homeworkPercent * homeworkScore + quizPercent * quizScore
                        + midtermPercent * midtermScore + finalExamPercent * finalExamScore) / 100;

                //Display grade
                gradeTextView.setText(grade + " ");
            }
        });
    }
}