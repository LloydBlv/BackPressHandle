package ir.zinutech.android.backpresshandle.ui.main

import android.os.Bundle
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import ir.zinutech.android.backpresshandle.R

class NewWayFragment: Fragment(R.layout.fragment_new_way_layout) {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    activity?.onBackPressedDispatcher?.addCallback(this, object : OnBackPressedCallback(true) {
      override fun handleOnBackPressed() {
        if(shouldInterceptBackPress()){
          Toast.makeText(requireContext(), "Back press intercepted in:${this@NewWayFragment}", Toast.LENGTH_SHORT).show()
          // in here you can do logic when backPress is clicked
        }else{
          isEnabled = false
          activity?.onBackPressed()
        }
      }
    })
  }

  fun shouldInterceptBackPress() = true

}