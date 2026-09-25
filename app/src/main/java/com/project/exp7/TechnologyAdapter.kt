package com.project.exp7

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class TechnologyAdapter(
    context: Context,
    private val names: Array<String>,
    private val icons: IntArray
) : ArrayAdapter<String>(
    context,
    R.layout.list_item,
    names
) {

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {

        val view = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.list_item, parent, false)

        val imageView = view.findViewById<ImageView>(R.id.itemImage)
        val textView = view.findViewById<TextView>(R.id.itemName)

        imageView.setImageResource(icons[position])
        textView.text = names[position]

        return view
    }
}