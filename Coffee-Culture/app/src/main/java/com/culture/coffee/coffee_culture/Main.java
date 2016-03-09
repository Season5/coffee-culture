package com.culture.coffee.coffee_culture;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.view.CardViewNative;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Create a Card
        Card card = new Card(getBaseContext());

        //Create a CardHeader
        CardHeader header = new CardHeader(getBaseContext());
        //Add Header to card
        card.addCardHeader(header);
        //Set card in the cardView
        Context context = this;
        CardViewNative cardView = (CardViewNative) context.getActivity().findViewById(R.id.carddemo);
        cardView.setCard(card);
        setContentView(R.layout.main);

    }
}
