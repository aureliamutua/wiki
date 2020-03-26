package frank.example.com.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import frank.example.com.R
import frank.example.com.holders.CardHolder
import frank.example.com.holders.ListItemHolder

/**
 *Created by KihiuFrank
 *Copyright © 2019
 *franklinekihiu@gmail.com
 */
class ArticleListItemRecyclerAdapter : RecyclerView.Adapter<ListItemHolder>() {
    override fun getItemCount(): Int {
        return 15//temporary
    }

    override fun onBindViewHolder(holder: ListItemHolder, position: Int) {
       //this is where you update your view

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemHolder {
        var cardItem = LayoutInflater.from(parent.context).inflate(R.layout.article_list_item, parent, false)
        return ListItemHolder(cardItem)
    }
}