package com.example.sensor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ReportFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_report, container, false)

        // RecyclerView 설정
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        // 구분선 추가
        val dividerItemDecoration = DividerItemDecoration(requireContext(), LinearLayoutManager.VERTICAL)
        recyclerView.addItemDecoration(dividerItemDecoration)

        // 임의 데이터 리스트 생성
        val reportList = listOf(
            TrainingReportDTO("2023-11-01 15:00", R.drawable.sample_image),
            TrainingReportDTO("2023-11-02 10:00", R.drawable.sample_image),
            TrainingReportDTO("2023-11-03 21:00", R.drawable.sample_image)
        )

        // 어댑터 설정
        recyclerView.adapter = TrainingReportAdapter(reportList)

        return view
    }
}
