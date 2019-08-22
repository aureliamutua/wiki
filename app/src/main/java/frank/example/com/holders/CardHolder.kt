package frank.example.com.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import frank.example.com.R
import kotlinx.android.synthetic.main.article_card_item.view.*

/**
 *Created by KihiuFrank
 *Copyright © 2019
 *franklinekihiu@gmail.com
 */
class CardHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val articleImageView: ImageView = itemView.findViewById(R.id.article_image)
    private val titleTextView: TextView = itemView.findViewById(R.id.article_title)
}