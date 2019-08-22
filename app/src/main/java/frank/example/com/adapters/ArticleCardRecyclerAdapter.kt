package frank.example.com.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import frank.example.com.R
import frank.example.com.holders.CardHolder

/**
 *Created by KihiuFrank
 *Copyright © 2019
 *franklinekihiu@gmail.com
 */
class ArticleCardRecyclerAdapter : RecyclerView.Adapter<CardHolder>() {
    override fun getItemCount(): Int {
        return 15//temporary
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {
       //this is where you update your view

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {
        var cardItem = LayoutInflater.from(parent?.context).inflate(R.layout.article_card_item, parent, false)
        return CardHolder(cardItem)
    }
}