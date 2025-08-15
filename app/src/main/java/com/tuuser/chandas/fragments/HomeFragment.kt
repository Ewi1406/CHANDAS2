package com.tuuser.chandas.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tuuser.chandas.R
import com.tuuser.chandas.adapters.DogAdapter
import com.tuuser.chandas.models.Dog

class HomeFragment : Fragment() {
    
    private lateinit var recyclerView: RecyclerView
    private lateinit var dogAdapter: DogAdapter
    
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        recyclerView = view.findViewById(R.id.recyclerViewDogs)
        recyclerView.layoutManager = LinearLayoutManager(context)
        
        val dogs = listOf(
            Dog("Luna", true, R.drawable.perro1, R.drawable.dog_golden_body, 4.5f),
            Dog("Max", false, R.drawable.perro2, R.drawable.dog_golden_body, 4.2f),
            Dog("Rocky", true, R.drawable.perro3, R.drawable.dog_puppy, 4.8f),
            Dog("Bella", false, R.drawable.perro4, R.drawable.dog_pastor, 4.0f),
            Dog("Toby", false, R.drawable.perro5, R.drawable.dog_pug, 4.3f),
            Dog("Charlie", true, R.drawable.perro6, R.drawable.dog_bulldog, 4.7f)
        )
        
        dogAdapter = DogAdapter(dogs)
        recyclerView.adapter = dogAdapter
    }
}
