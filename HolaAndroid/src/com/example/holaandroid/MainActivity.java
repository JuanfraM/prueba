package com.example.holaandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final EditText txtNombre = (EditText) findViewById(R.id.TxtNombre);
    	final Button btnHola = (Button) findViewById(R.id.BtnHola);
    	
    	//Implementamos el evento "click" del botón
    	btnHola.setOnClickListener(new OnClickListener() {
    	public void onClick(View v) {
    	//Creamos el Intent
    	Intent intent =	new Intent(MainActivity.this, FrmSaludo.class);
    	//Creamos la información a pasar entre actividades
    	Bundle b = new Bundle();
    	b.putString("NOMBRE", txtNombre.getText().toString());
    	//Añadimos la información al intent
    	intent.putExtras(b);
    	//Iniciamos la nueva actividad
    	startActivity(intent);

    	}
    	});
    	

        
    }

    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    
}
