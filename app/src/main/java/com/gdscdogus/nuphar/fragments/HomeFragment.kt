package com.gdscdogus.nuphar.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.gdscdogus.nuphar.adapters.EventRVAdapter
import com.gdscdogus.nuphar.databinding.FragmentHomeBinding
import com.gdscdogus.nuphar.models.CoordinatesModel
import com.gdscdogus.nuphar.models.EventModel
import java.time.Instant

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding

    lateinit var eventRVAdapter: EventRVAdapter
    lateinit var events: ArrayList<EventModel>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)

        events = ArrayList()
        events.add(
            EventModel(
                "id",
                "Lorem ipsum dolor sit amet",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce nec diam lorem. In vel vulputate ex. Duis quis dui ut magna pretium facilisis a quis lorem. Aenean iaculis sapien vitae sollicitudin.",
                "adres",
                CoordinatesModel(2.2, 2.2),
                "id",
                Instant.now()
            )
        )
        events.add(
            EventModel(
                "id",
                "Lorem ipsum dolor sit amet",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce nec diam lorem. In vel vulputate ex. Duis quis dui ut magna pretium facilisis a quis lorem. Aenean iaculis sapien vitae sollicitudin.",
                "adres",
                CoordinatesModel(2.2, 2.2),
                "id",
                Instant.now()
            )
        )
        events.add(
            EventModel(
                "id",
                "Lorem ipsum dolor sit amet",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce nec diam lorem. In vel vulputate ex. Duis quis dui ut magna pretium facilisis a quis lorem. Aenean iaculis sapien vitae sollicitudin.",
                "adres",
                CoordinatesModel(2.2, 2.2),
                "id",
                Instant.now()
            )
        )
        events.add(
            EventModel(
                "id",
                "Lorem ipsum dolor sit amet",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce nec diam lorem. In vel vulputate ex. Duis quis dui ut magna pretium facilisis a quis lorem. Aenean iaculis sapien vitae sollicitudin.",
                "adres",
                CoordinatesModel(2.2, 2.2),
                "id",
                Instant.now()
            )
        )
        events.add(
            EventModel(
                "id",
                "Lorem ipsum dolor sit amet",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce nec diam lorem. In vel vulputate ex. Duis quis dui ut magna pretium facilisis a quis lorem. Aenean iaculis sapien vitae sollicitudin.",
                "adres",
                CoordinatesModel(2.2, 2.2),
                "id",
                Instant.now()
            )
        )
        events.add(
            EventModel(
                "id",
                "Lorem ipsum dolor sit amet",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce nec diam lorem. In vel vulputate ex. Duis quis dui ut magna pretium facilisis a quis lorem. Aenean iaculis sapien vitae sollicitudin.",
                "adres",
                CoordinatesModel(2.2, 2.2),
                "id",
                Instant.now()
            )
        )
        events.add(
            EventModel(
                "id",
                "Lorem ipsum dolor sit amet",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce nec diam lorem. In vel vulputate ex. Duis quis dui ut magna pretium facilisis a quis lorem. Aenean iaculis sapien vitae sollicitudin.",
                "adres",
                CoordinatesModel(2.2, 2.2),
                "id",
                Instant.now()
            )
        )
        events.add(
            EventModel(
                "id",
                "Lorem ipsum dolor sit amet",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce nec diam lorem. In vel vulputate ex. Duis quis dui ut magna pretium facilisis a quis lorem. Aenean iaculis sapien vitae sollicitudin.",
                "adres",
                CoordinatesModel(2.2, 2.2),
                "id",
                Instant.now()
            )
        )

        eventRVAdapter = EventRVAdapter(events)
        binding.rvEvents.adapter = eventRVAdapter
        binding.rvEvents.layoutManager = LinearLayoutManager(context)
        binding.rvEvents.setHasFixedSize(true)

        return binding.root
    }
}