package com.culture.coffee.coffee_culture;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.internal.CardThumbnail;


public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Create a Card
        // Create a Card
        Card card = new Card(this, R.layout.row_card);

// Create a CardHeader
        CardHeader header = new CardHeader(this);
        header.setTitle("Hello world");

        card.setTitle("Simple card demo");
        CardThumbnail thumb = new CardThumbnail(this);
        thumb.setDrawableResource(R.drawable.ic_launcher);

        card.addCardThumbnail(thumb);

// Add Header to card
        card.addCardHeader(header);

// Set card in the cardView
        CardView cardView = (CardView) findViewById(R.id.carddemo);
        cardView.setCard(card);
    }


    public void btnCardListDemoClick(View v){
        Intent intent = new Intent(this, CardListActivity.class);
        startActivity(intent);
    }
}
