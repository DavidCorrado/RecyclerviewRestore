package com.example.recyclerview

import android.os.Bundle
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.ui.main.MainViewModel

class MainActivity : AppCompatActivity() {
//    val LIST_STATE_KEY = "LIST_STATE_KEY"
    var recyclerView: RecyclerView? = null
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        val adapter = Adapter()
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView?.adapter = adapter
        // Set layout manager to position the items
        recyclerView?.layoutManager = LinearLayoutManager(this)
//        if (viewModel.listState != null) {
//            recyclerView?.layoutManager?.onRestoreInstanceState(viewModel.listState);
//        }
    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
//        viewModel.listState = recyclerView.layoutManager?.onSaveInstanceState();
//
//        outState.putParcelable(LIST_STATE_KEY, viewModel.listState);
//    }
//
//    override fun onPause() {
//        super.onPause()
//        viewModel.listState = recyclerView?.layoutManager?.onSaveInstanceState();
//    }
//
//    override fun onResume() {
//        super.onResume()
//        recyclerView?.layoutManager?.onRestoreInstanceState(viewModel.listState)
//
//    }
}