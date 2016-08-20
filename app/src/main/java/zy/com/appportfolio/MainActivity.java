package zy.com.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtnMovie;
    private Button mBtnStock;
    private Button mBtnBuild;
    private Button mBtnMaterial;
    private Button mBtnGo;
    private Button mBtnCapstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnMovie = (Button) findViewById(R.id.btn_movie);
        mBtnStock = (Button) findViewById(R.id.btn_stock);
        mBtnBuild = (Button) findViewById(R.id.btn_build_big);
        mBtnMaterial = (Button) findViewById(R.id.btn_material);
        mBtnGo = (Button) findViewById(R.id.btn_go);
        mBtnCapstone = (Button) findViewById(R.id.btn_capstone);

        mBtnMovie.setOnClickListener(this);
        mBtnStock.setOnClickListener(this);
        mBtnBuild.setOnClickListener(this);
        mBtnMaterial.setOnClickListener(this);
        mBtnGo.setOnClickListener(this);
        mBtnCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_movie:
                Toast.makeText(getApplicationContext(), "Popular Movie Message", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_stock:
                Toast.makeText(getApplicationContext(), "Stock hawk", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_build_big:
                Toast.makeText(getApplicationContext(), "build it bigger", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_material:
                Toast.makeText(getApplicationContext(), "Make your app material", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_go:
                Toast.makeText(getApplicationContext(), "go ubiquitous", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_capstone:
                Toast.makeText(getApplicationContext(), "Capstone", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
