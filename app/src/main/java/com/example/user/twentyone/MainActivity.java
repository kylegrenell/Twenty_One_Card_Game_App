package com.example.user.twentyone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.user.twentyone.TwentyOne.Player;
import com.example.user.twentyone.TwentyOne.Table;


public class MainActivity extends AppCompatActivity {

    Player player;
    Table table;
    Button mDealButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // log the onCreate call
        Log.d("Main", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDealButton = (Button) findViewById(R.id.button_hit);

        // create table to play at
        table = new Table();

        // add players to the table
        player = new Player("kyle");

        // add those players to the table
        table.sitAtTable(player);

//        table.checkTable();
//        table.clearTable();

    }

    public void buttonClicked(View view) {
        table.getCurrentPlayer().setAction(Player.Action.HIT);
        Log.d("TwentyOne", "Deal button clicked!");
        table.checkTable();
        table.clearTable();
//        TextView textView = (TextView) findViewById(R.id.textView);
//        Log.d("Main", "button clicked");
    }
}

    //    @Override
//        public boolean onCreateOptionsMenu(MenuItem item) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
////
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        if (id == R.id.action_settings) ;
//        return true;
//    }
//
//    return super.onOptionsItemSelected(item);
//}






