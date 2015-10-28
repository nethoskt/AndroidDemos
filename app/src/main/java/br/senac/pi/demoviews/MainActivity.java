package br.senac.pi.demoviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        findViewById(R.id.btnTextViewDemo).setOnClickListener(abrirTextViewDemo());
        findViewById(R.id.btnEditTextDemo).setOnClickListener(abrirEditTextDemo());
        findViewById(R.id.btnImgViewDemo). setOnClickListener(abrirImageViewDemo());
        findViewById(R.id.btnCompleteDemo).setOnClickListener(abrirCompleteDemo());
        findViewById(R.id.btnImageButtonView).setOnClickListener(abrirImageButton());
        findViewById(R.id.btnCheckBox).setOnClickListener(abrirCheckBoxDemo());
        findViewById(R.id.btnProgressDialog).setOnClickListener(abrirProgressDialogDemo());
    }

    private View.OnClickListener abrirTextViewDemo() {
        return new View.OnClickListener() {
            @Override
        public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TextView_Demo.class);
                startActivity(intent);
            }
        };

    //public void abrirTextViewDemo(View view)  {
     //   Intent intent = new Intent(this, TextView_Demo.class);
     //   startActivity(intent);
    }

    private  View.OnClickListener abrirEditTextDemo() {
        return new View.OnClickListener() {
            @Override
        public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditTextDemon.class);
                startActivity(intent);
            }
        };
    }
    private View.OnClickListener abrirImageViewDemo() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageViewDemo.class);
                startActivity(intent);
            }
        };
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    private View.OnClickListener abrirCompleteDemo() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AutoCompleteDemo.class);
                startActivity(intent);
            }
        };
    }
    private View.OnClickListener abrirImageButton() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageButton.class);
                startActivity(intent);
            }
        };
    }
    private  View.OnClickListener abrirCheckBoxDemo() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CheckBoxToggleButtonActivity.class);
                startActivity(intent);
            }
        };
    }
    private  View.OnClickListener abrirProgressDialogDemo() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProgressDialogDemoActivity.class);
                startActivity(intent);
            }
        };
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
