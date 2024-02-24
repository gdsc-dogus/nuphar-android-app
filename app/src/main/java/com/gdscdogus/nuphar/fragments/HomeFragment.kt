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
                "Global Environmental Solutions Summit: Uniting for a Sustainable Future",
                "Participants will convene online to explore a range of environmental topics, including climate change, biodiversity loss, pollution, and resource depletion. Through keynote speeches, panel discussions, and interactive workshops, attendees will deepen their understanding of these issues and exchange ideas on effective strategies for mitigation and adaptation.",
                "https://meet.google.com/ibq-rzqp-dzj",
                CoordinatesModel(2.2, 2.2),
                "id",
                Instant.now()
            )
        )
        events.add(
            EventModel(
                "id",
                "Orchard Community Day: Harvest and Share",
                "During the event, participants will gather at an orange orchard to collectively pick or plant oranges. In this process, participants will not only spend time in a natural environment but also gain experience in agricultural activities. Additionally, they will learn about the techniques used in orange harvesting or planting.",
                "adres",
                CoordinatesModel(2.2, 2.2),
                "id",
                Instant.now()
            )
        )
        events.add(
            EventModel(
                "id",
                "Watershed Cleanup Day: Unite for Cleaner Rivers",
                "Participants will gather at designated water bodies to remove trash, debris, and pollutants from the environment. By working together to clean up our watersheds, participants will not only contribute to a healthier ecosystem but also gain firsthand experience in environmental conservation efforts.",
                "adres",
                CoordinatesModel(2.2, 2.2),
                "id",
                Instant.now()
            )
        )
        events.add(
            EventModel(
                "id",
                "Desert Restoration Rally: Taking Action Against Desertification",
                "Participants will gather at designated desertification hotspots, where they will engage in activities such as tree planting, soil conservation, and erosion control. Through teamwork and collective effort, attendees will contribute to the revitalization of degraded landscapes, helping to restore biodiversity, conserve water resources, and improve soil health.",
                "adres",
                CoordinatesModel(2.2, 2.2),
                "id",
                Instant.now()
            )
        )
        events.add(
            EventModel(
                "id",
                "Forest Regeneration Initiative: Community Action for Sustainable Forest Management",
                "Participants will gather at designated forest sites, where they will collaborate on a variety of restoration and conservation projects. These activities may include tree planting, invasive species removal, trail maintenance, and habitat restoration. Through teamwork and collective effort, participants will contribute to the regeneration of forested areas, fostering biodiversity, improving soil quality, and mitigating the impacts of climate change.",
                "adres",
                CoordinatesModel(2.2, 2.2),
                "id",
                Instant.now()
            )
        )
        events.add(
            EventModel(
                "id",
                "Clean Water Campaign: Community Action for Safe Drinking Water",
                "Participants will gather at various locations within the community to engage in a range of activities aimed at improving access to safe drinking water. These activities may include water testing, source protection initiatives, infrastructure improvements, and public awareness campaigns. Through collaborative efforts, participants will work towards the goal of ensuring that everyone has access to clean and safe drinking water.",
                "adres",
                CoordinatesModel(2.2, 2.2),
                "id",
                Instant.now()
            )
        )
        events.add(
            EventModel(
                "id",
                "Wastewater Guardians: Protecting Community Health through Safe Wastewater Management",
                "Participants will gather at key sites within the community to engage in a variety of activities aimed at promoting safe wastewater management. These activities may include conducting water quality tests, identifying sources of pollution, implementing pollution prevention measures, and advocating for policy changes to improve wastewater treatment infrastructure. By working collaboratively, participants will contribute to the protection of water bodies and ecosystems from the harmful impacts of wastewater contamination.",
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