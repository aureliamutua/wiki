package frank.example.com.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import frank.example.com.R
import frank.example.com.adapters.ArticleCardRecyclerAdapter
import frank.example.com.adapters.ArticleListItemRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_favorites.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class FavoritesFragment : Fragment() {
    var favoritesRecycler:RecyclerView? =null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_favorites, container, false)
        favoritesRecycler = view.findViewById<RecyclerView>(R.id.favorites_recycler)
        favoritesRecycler!!.layoutManager = LinearLayoutManager(context)
        favoritesRecycler!!.adapter = ArticleCardRecyclerAdapter()

        return view
    }


}
