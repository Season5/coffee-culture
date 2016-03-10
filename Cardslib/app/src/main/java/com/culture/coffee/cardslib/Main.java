package com.culture.coffee.cardslib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.view.CardViewNative;


public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Create a Card
        Card card = new Card(getApplicationContext());

        //Create a CardHeader
        CardHeader header = new CardHeader(getApplicationContext());

        //Add Header to card
        card.addCardHeader(header);

        //Set card in the cardView
        CardViewNative cardView = (CardViewNative) findViewById(R.id.carddemo);
        cardView.setCard(card);
    }
}
