package revo.adnan.com.learnkotln

import android.os.Bundle
import android.util.TypedValue
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.demokotlin.R
import com.example.demokotlin.activity.ParentActivity
import com.example.demokotlin.databinding.ChipsLayoutBinding
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipDrawable


class ChipsLayoutActivity : ParentActivity(), View.OnClickListener {

    lateinit var binding: ChipsLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.chips_layout)
        supportActionBar!!.title = "Chips Layout"
        clicks();
    }

    private fun clicks() {
        binding.addItem.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var id = v!!.id;
        when (id) {
            R.id.addItem -> addItem();
        }
    }

    private fun addItem() {
//        val mChip =
//            this.layoutInflater.inflate(R.layout.chip, binding.chipGroup, false) as Chip
//        mChip.setText("Adnan")
        val chip = Chip(this)
//        chip.setChipDrawable()
        val paddingDp = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, 10f,
            resources.displayMetrics
        ).toInt()
        chip.setPadding(paddingDp, paddingDp, paddingDp, paddingDp)
        chip.setText("Adnan Ahmed")
//        chip.setOnCloseIconClickListener {entryChipGroup.removeView(chip) }
        binding.chipGroup.addView(chip)
    }


}
