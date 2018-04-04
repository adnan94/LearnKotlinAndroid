package revo.adnan.com.learnkotln

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import kotlin.adnan.com.learnkotln.R

/**
 * Created by AdnanAhmed on 4/4/2018.
 */
class Adopter(context: Context,val sList:ArrayList<Model>) : BaseAdapter() {
    private val mInflator: LayoutInflater

    init {
        this.mInflator = LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return sList.size
    }

    override fun getItem(position: Int): Any {
        return sList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        val view: View?
        val vh: ListRowHolder
        if (convertView == null) {
            view = this.mInflator.inflate(R.layout.listrow, parent, false)
            vh = ListRowHolder(view)
            view.tag = vh
        } else {
            view = convertView
            vh = view.tag as ListRowHolder
        }

        vh.name.text = sList[position].name
        vh.email.text=sList[position].number
        return view
    }
}

private class ListRowHolder(row: View?) {
    public val name: TextView
    public val email: TextView

    init {
        this.name = row?.findViewById(R.id.name) as TextView
        this.email = row?.findViewById(R.id.email) as TextView

    }

}