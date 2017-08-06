package fr.mysh3ll.kedditbysteps.features.news

import android.os.Bundle

import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fr.mysh3ll.kedditbysteps.R
import fr.mysh3ll.kedditbysteps.commons.inflate
import kotlinx.android.synthetic.main.news_fragment.*

class NewsFragment : Fragment() {

    //private var newsList: RecyclerView? = null
    private val newsList by lazy {
        news_list
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        /*old code*/
        //val view = inflater.inflate(R.layout.news_fragment, container, false)
        /*new code*/
        return container?.inflate(R.layout.news_fragment)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        newsList.setHasFixedSize(true)
        newsList.layoutManager = LinearLayoutManager(context)
    }

}
