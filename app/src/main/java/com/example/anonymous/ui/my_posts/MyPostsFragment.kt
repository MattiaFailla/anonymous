package com.example.anonymous.ui.my_posts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.anonymous.databinding.FragmentMyPostsBinding

class MyPostsFragment : Fragment() {

    private lateinit var myPostsViewModel: MyPostsViewModel
    private var _binding: FragmentMyPostsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        myPostsViewModel =
            ViewModelProvider(this).get(MyPostsViewModel::class.java)

        _binding = FragmentMyPostsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMyPosts
        myPostsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}