package mandiri.whatthehack.com.whatthehack.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import mandiri.whatthehack.com.whatthehack.R;

public class InvestasiActivity extends AppCompatActivity {

    private ImageView backButton;
    private RelativeLayout cekTipeButton, kontakFinancialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investasi);

        backButton = findViewById(R.id.investasiBackButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        cekTipeButton = findViewById(R.id.cekTipeButton);
        cekTipeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), CekTipeActivity.class);
                startActivity(intent);
            }
        });

        kontakFinancialButton = findViewById(R.id.kontakFinansial);
        kontakFinancialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ChatActivity.class);
                startActivity(intent);
            }
        });
    }
}
